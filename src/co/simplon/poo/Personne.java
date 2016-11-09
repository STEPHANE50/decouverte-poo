package co.simplon.poo;

public class Personne {

	protected String prenom;
	protected String nom;
	protected int age;
	protected Adresse adresse = null;
	protected boolean femme;

	public Personne(String prenom, String nom, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	
	public Personne(String prenom, String nom, int age, Adresse adresse) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
	}

	public void declineToIdentite() {
		System.out.println("Je suis " + this.prenom + " " + this.nom);
		if (adresse != null)
			System.out.println("J'habite à " + this.adresse);
	}

	public void feteTonAnniversaire() {
		this.age++;
		System.out.println(prenom + " " + nom + " fête ses " + this.age
				+ " printemps !");
	}

	public void demenage(Adresse adresse) {
		System.out.println("Je déménage de " + this.adresse + " vers "
				+ adresse);
		this.setAdresse(adresse);
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

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
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
