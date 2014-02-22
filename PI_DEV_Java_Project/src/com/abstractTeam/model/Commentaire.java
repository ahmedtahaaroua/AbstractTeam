package com.abstractTeam.Model;

import java.io.Serializable;



public class Commentaire implements Serializable {
	private static final long serialVersionUID = 1L;


	private int idCommentaire;

	private String message;

	
	private Client client;


	private Plat plat;


	private Restaurant restaurant;

	public Commentaire() {
	}

	public int getIdCommentaire() {
		return this.idCommentaire;
	}

	public void setIdCommentaire(int idCommentaire) {
		this.idCommentaire = idCommentaire;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Plat getPlat() {
		return this.plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	public Restaurant getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}