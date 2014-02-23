package com.abstractTeam.controler;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.abstractTeam.model.Restaurant;




public class RestaurantDAO {

	@PersistenceContext(unitName = "test")
	private EntityManager entityManager;

	public void createRestaurant(Restaurant Restaurant) {
		
				
				entityManager.persist(Restaurant);
				
		
	}

	
	public Restaurant readRestaurant(int idPersonne) {
		//Restaurant personne = entityManager.find(Restaurant.class, idPersonne);
		//entityManager.refresh(personne);
		Restaurant personne =	entityManager.find(Restaurant.class, idPersonne);
		return personne;
	}

	public void deleteRestaurant(Restaurant Restaurant) {
		Restaurant personne =entityManager.merge(Restaurant);
		entityManager.remove(personne);
	}


	public void updateRestaurant(Restaurant Restaurant) {
		entityManager.merge(Restaurant);

	}

	
	
	public List<Restaurant> findAllRestaurant() {

		String q = "SELECT p from " + Restaurant.class.getName() + " p";
		Query query = entityManager.createQuery(q);
		List<Restaurant> listePersonnes= query.getResultList();
		return listePersonnes;
	}

	
	public Restaurant findById(long p) {
		
	        return entityManager.find(Restaurant.class, p);  
	   }
	
	}

