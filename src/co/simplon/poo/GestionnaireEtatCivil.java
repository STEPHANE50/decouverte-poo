package co.simplon.poo;

public class GestionnaireEtatCivil {
	
	public static void main(String[] args) {
	
		// Créer une personne ... qui vous ressemble
		Personne eric = new Personne("Eric", "Siber", 35);
		System.out.print(eric);
		
		// La modifier / enrichir
		eric.setPrenom("Eric, Pierre");
		eric.setFemme(false);
		eric.setAdresse("Sartrouville");
		System.out.println(eric);
	}
}
