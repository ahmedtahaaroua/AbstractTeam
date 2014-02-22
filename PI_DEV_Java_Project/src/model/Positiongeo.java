package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the positiongeo database table.
 * 
 */
@Entity
public class Positiongeo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_geo")
	private int idGeo;

	private double abs;

	private double ord;

	//bi-directional many-to-one association to Client
	@OneToMany(mappedBy="positiongeo")
	private List<Client> clients;

	//bi-directional many-to-one association to Restaurant
	@OneToMany(mappedBy="positiongeo")
	private List<Restaurant> restaurants;

	public Positiongeo() {
	}

	public int getIdGeo() {
		return this.idGeo;
	}

	public void setIdGeo(int idGeo) {
		this.idGeo = idGeo;
	}

	public double getAbs() {
		return this.abs;
	}

	public void setAbs(double abs) {
		this.abs = abs;
	}

	public double getOrd() {
		return this.ord;
	}

	public void setOrd(double ord) {
		this.ord = ord;
	}

	public List<Client> getClients() {
		return this.clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Client addClient(Client client) {
		getClients().add(client);
		client.setPositiongeo(this);

		return client;
	}

	public Client removeClient(Client client) {
		getClients().remove(client);
		client.setPositiongeo(null);

		return client;
	}

	public List<Restaurant> getRestaurants() {
		return this.restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public Restaurant addRestaurant(Restaurant restaurant) {
		getRestaurants().add(restaurant);
		restaurant.setPositiongeo(this);

		return restaurant;
	}

	public Restaurant removeRestaurant(Restaurant restaurant) {
		getRestaurants().remove(restaurant);
		restaurant.setPositiongeo(null);

		return restaurant;
	}

}