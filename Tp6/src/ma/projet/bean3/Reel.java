package ma.projet.bean3;

import ma.projet.abst.Affichage;
import ma.projet.inter2.IOperation;

public class Reel extends Affichage implements IOperation<Reel> {
	private double x;

	public Reel(double x) {
		super();
		this.x = x;
	}

	@Override
	public void affiche() {
		System.out.println(x);
	}

	@Override
	public void plus(Reel r) {

	}

	@Override
	public void moins(Reel r) {

	}

}
