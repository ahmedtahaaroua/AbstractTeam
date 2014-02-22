package com.abstractTeam.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the reservations database table.
 * 
 */
@Entity
@Table(name="reservations")
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idReservation;

	private String choix;

	@Temporal(TemporalType.DATE)
	private Date date;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;

	//bi-directional many-to-one association to Restaurant
	@ManyToOne
	@JoinColumn(name="idResto")
	private Restaurant restaurant;

	//bi-directional many-to-one association to Facture
	@ManyToOne
	@JoinColumn(name="idFacture")
	private Facture facture;

	public Reservation() {
	}

	public int getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public String getChoix() {
		return this.choix;
	}

	public void setChoix(String choix) {
		this.choix = choix;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Restaurant getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Facture getFacture() {
		return this.facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

}