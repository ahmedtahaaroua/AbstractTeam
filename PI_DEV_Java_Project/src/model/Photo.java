package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the photos database table.
 * 
 */
@Entity
@Table(name="photos")
public class Photo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String description;

	private String url;

	//bi-directional many-to-one association to Restaurant
	@ManyToOne
	@JoinColumn(name="id_resto")
	private Restaurant restaurant;

	//bi-directional many-to-one association to Bonplan
	@ManyToOne
	@JoinColumn(name="idBonPlan")
	private Bonplan bonplan;

	//bi-directional many-to-one association to Plat
	@OneToMany(mappedBy="photo")
	private List<Plat> plats;

	public Photo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Restaurant getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Bonplan getBonplan() {
		return this.bonplan;
	}

	public void setBonplan(Bonplan bonplan) {
		this.bonplan = bonplan;
	}

	public List<Plat> getPlats() {
		return this.plats;
	}

	public void setPlats(List<Plat> plats) {
		this.plats = plats;
	}

	public Plat addPlat(Plat plat) {
		getPlats().add(plat);
		plat.setPhoto(this);

		return plat;
	}

	public Plat removePlat(Plat plat) {
		getPlats().remove(plat);
		plat.setPhoto(null);

		return plat;
	}

}