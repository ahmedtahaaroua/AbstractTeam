package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the restaurants database table.
 * 
 */
@Entity
@Table(name="restaurants")
public class Restaurant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String adresse;

	@Column(name="id_photo")
	private int idPhoto;

	private int nbrTable;

	private String nom;

	private double note;

	private String specialite;

	//bi-directional many-to-one association to Commentaire
	@OneToMany(mappedBy="restaurant")
	private List<Commentaire> commentaires;

	//bi-directional many-to-one association to Livraison
	@OneToMany(mappedBy="restaurant")
	private List<Livraison> livraisons;

	//bi-directional many-to-one association to Photo
	@OneToMany(mappedBy="restaurant")
	private List<Photo> photos;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="restaurant")
	private List<Reservation> reservations;

	//bi-directional many-to-one association to Restaurateur
	@ManyToOne
	@JoinColumn(name="id_restaurateur")
	private Restaurateur restaurateur;

	//bi-directional many-to-one association to Positiongeo
	@ManyToOne
	@JoinColumn(name="id_geo")
	private Positiongeo positiongeo;

	//bi-directional many-to-one association to Table
	@OneToMany(mappedBy="restaurant")
	private List<Tables> tables;

	public Restaurant() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getIdPhoto() {
		return this.idPhoto;
	}

	public void setIdPhoto(int idPhoto) {
		this.idPhoto = idPhoto;
	}

	public int getNbrTable() {
		return this.nbrTable;
	}

	public void setNbrTable(int nbrTable) {
		this.nbrTable = nbrTable;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNote() {
		return this.note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String getSpecialite() {
		return this.specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public List<Commentaire> getCommentaires() {
		return this.commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public Commentaire addCommentaire(Commentaire commentaire) {
		getCommentaires().add(commentaire);
		commentaire.setRestaurant(this);

		return commentaire;
	}

	public Commentaire removeCommentaire(Commentaire commentaire) {
		getCommentaires().remove(commentaire);
		commentaire.setRestaurant(null);

		return commentaire;
	}

	public List<Livraison> getLivraisons() {
		return this.livraisons;
	}

	public void setLivraisons(List<Livraison> livraisons) {
		this.livraisons = livraisons;
	}

	public Livraison addLivraison(Livraison livraison) {
		getLivraisons().add(livraison);
		livraison.setRestaurant(this);

		return livraison;
	}

	public Livraison removeLivraison(Livraison livraison) {
		getLivraisons().remove(livraison);
		livraison.setRestaurant(null);

		return livraison;
	}

	public List<Photo> getPhotos() {
		return this.photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public Photo addPhoto(Photo photo) {
		getPhotos().add(photo);
		photo.setRestaurant(this);

		return photo;
	}

	public Photo removePhoto(Photo photo) {
		getPhotos().remove(photo);
		photo.setRestaurant(null);

		return photo;
	}

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Reservation addReservation(Reservation reservation) {
		getReservations().add(reservation);
		reservation.setRestaurant(this);

		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setRestaurant(null);

		return reservation;
	}

	public Restaurateur getRestaurateur() {
		return this.restaurateur;
	}

	public void setRestaurateur(Restaurateur restaurateur) {
		this.restaurateur = restaurateur;
	}

	public Positiongeo getPositiongeo() {
		return this.positiongeo;
	}

	public void setPositiongeo(Positiongeo positiongeo) {
		this.positiongeo = positiongeo;
	}

	public List<Tables> getTables() {
		return this.tables;
	}

	public void setTables(List<Tables> tables) {
		this.tables = tables;
	}

	public Tables addTable(Tables table) {
		getTables().add(table);
		table.setRestaurant(this);

		return table;
	}

	public Tables removeTable(Tables table) {
		getTables().remove(table);
		table.setRestaurant(null);

		return table;
	}

}