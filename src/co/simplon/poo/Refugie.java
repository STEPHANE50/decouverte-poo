package co.simplon.poo;

import java.util.Date;

public class Refugie extends Personne {

	private boolean regularise;
	private Date dateLimiteSejour;

	public Refugie(String prenom, String nom, int age, Date dateLimiteSejour) {
		super(prenom, nom, age);
		this.dateLimiteSejour = dateLimiteSejour;
		this.regularise = false;
	}

	public boolean demanderAsile(Adresse adresse) {
		if (this.dateLimiteSejour.after(new Date())) {
			this.regularise = true;
			this.adresse = adresse;
			return true;
		}
		return false;
	}

	@Override
	public void declineToIdentite() {
		System.out.println("Je suis " + this.prenom + " " + this.nom);
		if (this.regularise) {
			System.out.println("Je suis un réfugié régularisé vivant à " + this.getAdresse().getVille());
		} else {
			System.out.println("Je suis en attente de régularisation.");
		}
	}
	
	@Override
	public void demenage(Adresse adresse) {
		if (this.regularise) {
			if (adresse.getCodePostal() == this.adresse.getCodePostal()
					&& adresse.getVille().equals(this.adresse.getVille())) {
				super.demenage(adresse);
			} else {
				System.out
						.println("Le réfugié "
								+ this.prenom
								+ " "
								+ this.nom
								+ "ne peut déménager en dehors de sa ville de résidence actuelle");
			}
		} else {
			System.out
					.println("Le réfugié "
							+ this.prenom
							+ " "
							+ this.nom
							+ " ne peut définir d'adresse tant qu'il n'est pas régularisé.");
		}
	}

	@Override
	public void setAdresse(Adresse adresse) {
		throw new UnsupportedOperationException("Il est interdit de modifier l'adresse d'un réfugié");
	}
	
	public boolean isRegularise() {
		return regularise;
	}

	public Date getDateLimiteSejour() {
		return dateLimiteSejour;
	}

}
