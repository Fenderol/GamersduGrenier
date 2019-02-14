package metier;

import metier.cours;

public class Infrastructure {
	
	private String nom;
	private String type;
	private String lieu;
	private boolean disponible;
	private Cours cours;
	
	/** Constructeur infrastructure 
	 * 
	 * @param nom Nom de l'infrastructure
	 * @param type Type de l'infrastructure
	 * @param lieu Lieu de l'infrastructure
	 * @param disponible Si l'infrastructure est disponible ou non
	 */
	public Infrastructure (String nom, String type, String lieu, boolean disponible) {
		this.nom = nom;
		this.type = type;
		this.lieu = lieu;
		this.disponible = disponible;
	}

	/**
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return le type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * 
	 * @return le lieu
	 */
	public String getLieu() {
		return lieu;
	}

	/**
	 * @return la disponibilit�
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param nom le nom � ajouter
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param type le type � ajouter
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 
	 * @param lieu le lieu � ajouter
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	/**
	 * @param disponible la disponibilit� � ajouter
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	

}
