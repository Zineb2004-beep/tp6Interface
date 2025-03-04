package ma.projet.test;

import ma.projet.bean1.Personne;
import ma.projet.bean1.Profile;

public class Test {
	public static void main(String[] args) {
		Profile directeur = new Profile("Dir", "directeur");
		Personne p1 = new Personne("SALMI", "Karim", "02 juin 1970", 20000.00, directeur);
		p1.Affiche(p1);

		Profile manager = new Profile("Man", "manager");
		Personne p2 = new Personne("alami", "ali", "04 avril 1990", 10000.00, manager);
		p2.Affiche(p2);
	}

}
