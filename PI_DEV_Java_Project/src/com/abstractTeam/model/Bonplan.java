package com.abstractTeam.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the bonplans database table.
 * 
 */
@Entity
@Table(name="bonplans")
public class Bonplan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBonPlan;

	private String description;

	//bi-directional many-to-one association to Photo
	@OneToMany(mappedBy="bonplan")
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

	public List<Photo> getPhotos() {
		return this.photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public Photo addPhoto(Photo photo) {
		getPhotos().add(photo);
		photo.setBonplan(this);

		return photo;
	}

	public Photo removePhoto(Photo photo) {
		getPhotos().remove(photo);
		photo.setBonplan(null);

		return photo;
	}

}