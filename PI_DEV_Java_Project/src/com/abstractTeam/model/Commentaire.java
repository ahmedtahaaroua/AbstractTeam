package com.abstractTeam.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the commentaires database table.
 * 
 */
@Entity

@Table(name="commentaires")
public class Commentaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCommentaire;

	private String message;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;

	//bi-directional many-to-one association to Plat
	@ManyToOne
	@JoinColumn(name="idPlat")
	private Plat plat;

	//bi-directional many-to-one association to Restaurant
	@ManyToOne
	@JoinColumn(name="idResto")
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