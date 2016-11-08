package co.simplon.poo;

public class Adresse {
	
	private int numeroVoie;
	private String nomVoie;
	private int codePostal;
	private String ville;
	
	public Adresse(int numeroVoie, String nomVoie, int codePostal, String ville) {
		super();
		this.numeroVoie = numeroVoie;
		this.nomVoie = nomVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getNumeroVoie() {
		return numeroVoie;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	@Override
	public String toString() {
		return "Adresse [numeroVoie=" + numeroVoie + ", nomVoie=" + nomVoie
				+ ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}

}