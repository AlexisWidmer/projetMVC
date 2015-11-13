package classes;

/**
 * 
 * @author Alexis WIDMER
 * 
 * @version version 1
 */
public class eleve {
	//Propriétés
	private int codeEleve;
	private String nom;
	private String prenom;
	private String dateNaiss;
	private division classeEleve;

	/**
	 * Accesseur en GET de l'attribut codeEleve
	 * @return codeEleve
	 */
	//Accesseurs
	public int getCodeEleve() {
		return this.codeEleve;
	}

	/**
	 * Accesseur en SET de l'attribut codeEleve
	 * @param codeEleve
	 */
	public void setCodeEleve(int codeEleve) {
		this.codeEleve = codeEleve;
	}

	/**
	 * Accesseur en GET de l'attribut nom
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Accesseur en SET de l'attribut nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Accesseur en GET de l'attribut prenom
	 * @return prenom
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * Accesseur en SET de l'attribut prenom
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Accesseur en GET de l'attribut dateNaiss
	 * @return dateNaiss
	 */
	public String getDateNaiss() {
		return this.dateNaiss;
	}

	/**
	 * Accesseur en SET de l'attribut dateNaiss
	 * @param dateNaiss
	 */
	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	/**
	 * Accesseur en GET de l'objet classeEleve
	 * @return classeEleve
	 */
	public division getClasseEleve() {
		return this.classeEleve;
	}

	/**
	 * Accesseur en SET de l'objet classeEleve
	 * @param classeEleve
	 */
	public void setClasseEleve(division classeEleve) {
		this.classeEleve = classeEleve;
	}
	
	//Méthodes
	//Constructeur par défaut
	/**
	 * Constructeur par défaut de la classe eleve
	 */
	public eleve() {
		this.codeEleve = 5212;
		this.nom = "Vaillant";
		this.prenom = "Michel";
		this.dateNaiss = "11/11/11";
		this.classeEleve = new division();
	}
	
	//Constructeur avec initialisation
	/**
	 * Constructeur avec initialisation de la classe eleve
	 * @param codeEleve
	 * @param nom
	 * @param prenom
	 * @param dateNaiss
	 * @param classeEleve
	 */
	public eleve(int codeEleve, String nom, String prenom, String dateNaiss, division classeEleve) {
		this.codeEleve = codeEleve;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.classeEleve = classeEleve;
	}
	
	/**
	 * Méthode qui retourne les valeurs des attributs de l'objet précédant l'appel de la méthode toString()
	 * Affiche les attributs prenom, nom, dateNaiss et classeEleve (composé des attributs codeDivision et libelle)
	 * @return prenom
	 * @return nom
	 * @return dateNaiss
	 * @return classeEleve.codeDivision
	 * @return classeEleve.libelle 
	 */
	public String toString() {
		return "Voici l'élève " + this.prenom + " " + this.nom + ", né(e) le " + this.dateNaiss + ". " + this.classeEleve.toString();
	}
}
