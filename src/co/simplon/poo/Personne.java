package co.simplon.poo;

public class Personne {

	private String prenom;
	private String nom;
	private int age;
	private String adresse;
	private boolean femme;

	public Personne(String prenom, String nom, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public boolean isFemme() {
		return femme;
	}

	public void setFemme(boolean femme) {
		this.femme = femme;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age
				+ ", adresse=" + adresse + ", femme=" + femme + "]";
	}
	
	
	
}
