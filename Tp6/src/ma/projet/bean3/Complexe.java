package ma.projet.bean3;

import ma.projet.abst.Affichage;
import ma.projet.inter2.IOperation;

public class Complexe extends Affichage implements IOperation<Complexe> {

	private double re;
	private double im;

	public Complexe(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	@Override
	public void affiche() {
        System.out.println(re + " + " + im + "i");
	}

	@Override
	public void plus(Complexe c) {
		re += c.re;
		im += c.im;

	}

	@Override
	public void moins(Complexe c) {
		re -= c.re;
		im -= c.im;

	}

}
