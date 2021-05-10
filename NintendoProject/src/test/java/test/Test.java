package test;

import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console sony = new Console("ps2");
		Console nintendo = new Console("gamecube");
		Console microsoft = new Console("xbox");

		List<Console> list1 = new ArrayList<Console>();
		List<Console> list2 = new ArrayList<Console>();
		List<Console> list3 = new ArrayList<Console>();
		Adresse a1 = new Adresse(8,"toto","totoville");
		list1.add(nintendo);
		list1.add(microsoft);
		list2.add(microsoft);
		list3.add(nintendo);
		list3.add(sony);
		List<Jeu> listJ = new ArrayList<Jeu>();
		
		Boutique b1 = new Boutique("micromania",a1,listJ);
		
		Jeu j1 = new Jeu("Zelda ocarina of Time", list3,b1);
		Jeu j2 = new Jeu("Lego Star Wars II", list2,b1);
		Jeu j3 = new Jeu("Monster Hunter 2", list1,b1);
		Jeu j4 = new Jeu("MarioKart Double Dash", list2,b1);
		Jeu j5 = new Jeu("Pokemon XD: Le souffle des tenebres", list3,b1);
		listJ.add(j1);
		listJ.add(j2);
		listJ.add(j3);
		listJ.add(j4);
		listJ.add(j5);
		
		System.out.println("Voici les 5 jeux en base: ");
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		System.out.println(j4.toString());
		System.out.println(j5.toString());

		List<Jeu> jeux = new ArrayList<Jeu>();
		jeux.add(j1);
		jeux.add(j3);
		jeux.add(j5);
		Client c = new Client("toto", "titi", jeux);
	
		System.out.println(c);
		
	}

}
