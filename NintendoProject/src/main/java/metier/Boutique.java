package metier;

import java.util.List;

public class Boutique {
	
	private String nom;
	private Adresse adresse;
	private List<Jeu> jeux;
	
	public Boutique(String nom, Adresse adresse, List<Jeu> jeux) {
		this.nom = nom;
		this.adresse = adresse;
		this.jeux = jeux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Jeu> getJeux() {
		return jeux;
	}

	public void setJeux(List<Jeu> jeux) {
		this.jeux = jeux;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + ", jeux=" + jeux + "]";
	}
	
}
