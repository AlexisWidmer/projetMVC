package classes;

/**
 * 
 * @author Alexis WIDMER
 * 
 * @version version 1
 */
public class division {
	//Propriétés
	private int codeDivision;
	private String libelle;
	
	//Accesseurs
	/**
	 * 
	 * Accesseur en GET de l'attribut codeDivision
	 * @return codeDivision
	 */
	public int getCodeDivision() {
		return this.codeDivision;
	}

	/**
	 * Accesseur en SET de l'attribut codeDivision
	 * @param codeDivision
	 */
	public void setCodeDivision(int codeDivision) {
		this.codeDivision = codeDivision;
	}

	/**
	 * 
	 * Accesseur en GET de l'attribut libelle
	 * @return libelle
	 */
	public String getLibelle() {
		return this.libelle;
	}

	/**
	 * Accesseur en SET de l'attribut libelle
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	//Méthodes
	//Constructeur par défaut
	/**
	 * Constructeur par défaut de la classe division
	 */
	public division() {
		this.codeDivision = 42;
		this.libelle = "Un saut vers l'inconnu";
	}
	
	//Constructeur avec initialisation
	/**
	 * Constructeur avec initialisation de la classe division
	 * 
	 * @param codeDivision
	 * @param libelle
	 */
	public division(int codeDivision, String libelle) {
		this.codeDivision = codeDivision;
		this.libelle = libelle;
	}
	
	//Méthode pour retourner les valeurs des propriétés de l'objets
	/**
	 * Méthode qui retourne les valeurs des attributs de l'objet précédant l'appel de la méthode toString()
	 * Affiche les attributs codeDivision et libelle
	 * @return codeDivision
	 * @return libelle
	 */
	public String toString() {
		return "Le code de la division de l'élève est " + this.codeDivision + " et le nom de la classe est " + this.libelle;
	}
}
