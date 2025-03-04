package ma.projet.bean2;

import ma.projet.inter2.IAffichage;
import ma.projet.inter2.IOperation;

public class Complexe implements IOperation<Complexe>, IAffichage<Complexe> {

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
		this.re += c.re;
		this.im += c.im;
	}

	@Override
	public void moins(Complexe c) {
		this.re -= c.re;
		this.im -= c.im;
	}

}
