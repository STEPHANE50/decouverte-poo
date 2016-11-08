package co.simplon.poo;

public class GestionnaireEtatCivil {

	public static void main(String[] args) {

		// Créer une personne ... qui vous ressemble
		Adresse adresseEric = new Adresse(10, "rue principale", 78500,
				"SARTROUVILLE");
		Personne eric = new Personne("Eric", "Siber", 35, adresseEric);
		
		eric.declineToIdentite();

		// La modifier / enrichir
		eric.setPrenom("Clément");
		eric.setFemme(false);

		// joyeux anniversaire
		eric.feteTonAnniversaire();
		System.out.println(eric);

		// déménagement
		Adresse nouvelleAdresseEric = new Adresse(1, "rue de l'église", 75001,
				"PARIS");
		eric.demenage(nouvelleAdresseEric);
		eric.declineToIdentite();

	}
}
