package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tables database table.
 * 
 */
@Entity
@Table(name="tables")
public class Tables implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int etat;

	private String nom;

	//bi-directional many-to-one association to Restaurant
	@ManyToOne
	@JoinColumn(name="idRestaurant")
	private Restaurant restaurant;

	public Tables() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEtat() {
		return this.etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Restaurant getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}