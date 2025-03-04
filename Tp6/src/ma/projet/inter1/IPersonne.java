package ma.projet.inter1;

import ma.projet.bean1.Personne;

public interface IPersonne <T> {
	
	void Affiche(Personne p);
	double CalculerSalaire(Personne p);

}
