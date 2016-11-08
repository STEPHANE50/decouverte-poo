package co.simplon.poo;

public class GestionnaireEtatCivil {
	
	public static void main(String[] args) {
	
		// Créer une personne ... qui vous ressemble
		Personne eric = new Personne("Eric", "Siber", 35);
		eric.declineToIdentite();
		
		// La modifier / enrichir
		eric.setPrenom("Clément");
		eric.setFemme(false);
		eric.setAdresse("Sartrouville");
		
		// joyeux anniversaire
		eric.feteTonAnniversaire();
		System.out.println(eric);
		
		// déménagement
		eric.demenage("Montreuil");
		eric.declineToIdentite();
		
	}
}
