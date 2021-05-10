package metier;

import java.util.List;

public class Jeu {

	private String titre;
	private List<Console> consoles;
	private Boutique boutiques;
	
	
	public Jeu(String titre, List<Console> consoles, Boutique boutiques) {
		this.titre = titre;
		this.consoles = consoles;
		this.boutiques = boutiques;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public List<Console> getConsoles() {
		return consoles;
	}


	public void setConsoles(List<Console> consoles) {
		this.consoles = consoles;
	}


	public Boutique getBoutiques() {
		return boutiques;
	}


	public void setBoutiques(Boutique boutiques) {
		this.boutiques = boutiques;
	}


	@Override
	public String toString() {
		return "Jeu [titre=" + titre + ", consoles=" + consoles + ", boutiques=" + boutiques + "]";
	}
	
}
	
	
