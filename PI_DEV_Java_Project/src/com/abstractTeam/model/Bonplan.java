package com.abstractTeam.Model;

import java.io.Serializable;

import java.util.List;


public class Bonplan implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idBonPlan;

	private String description;

	private double prix;

	private String type;


	private List<Reservation> reservations;


	private List<Photo> photos;

	public Bonplan() {
	}

	public int getIdBonPlan() {
		return this.idBonPlan;
	}

	public void setIdBonPlan(int idBonPlan) {
		this.idBonPlan = idBonPlan;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Photo> getPhotos() {
		return this.photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

}