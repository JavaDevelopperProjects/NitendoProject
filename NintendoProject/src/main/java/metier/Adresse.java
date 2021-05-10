package metier;

public class Adresse {

	private int numemo;
	private String rue;
	private String ville;
	
	public Adresse(int numemo, String rue, String ville) {
		this.numemo = numemo;
		this.rue = rue;
		this.ville = ville;
	}

	public int getNumemo() {
		return numemo;
	}

	public void setNumemo(int numemo) {
		this.numemo = numemo;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [numemo=" + numemo + ", rue=" + rue + ", ville=" + ville + "]";
	}
	
}
