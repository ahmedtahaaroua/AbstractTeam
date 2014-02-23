package com.abstractTeam.controler;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.abstractTeam.model.Restaurateur;




public class RestaurateurDAO {

	@PersistenceContext(unitName = "test")
	private EntityManager entityManager;

	public void createRestaurateur(Restaurateur Restaurateur) {
		
				
				entityManager.persist(Restaurateur);
				
		
	}

	
	public Restaurateur readRestaurateur(int idPersonne) {
		//Restaurateur personne = entityManager.find(Restaurateur.class, idPersonne);
		//entityManager.refresh(personne);
		Restaurateur personne =	entityManager.find(Restaurateur.class, idPersonne);
		return personne;
	}

	public void deleteRestaurateur(Restaurateur Restaurateur) {
		Restaurateur personne =entityManager.merge(Restaurateur);
		entityManager.remove(personne);
	}


	public void updateRestaurateur(Restaurateur Restaurateur) {
		entityManager.merge(Restaurateur);

	}

	
	
	public List<Restaurateur> findAllRestaurateur() {

		String q = "SELECT p from " + Restaurateur.class.getName() + " p";
		Query query = entityManager.createQuery(q);
		List<Restaurateur> listePersonnes= query.getResultList();
		return listePersonnes;
	}

	
	public Restaurateur findById(long p) {
		
	        return entityManager.find(Restaurateur.class, p);  
	   }
	
	}

