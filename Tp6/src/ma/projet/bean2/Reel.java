package ma.projet.bean2;

public class Reel {

	private double x;

	public Reel(double x) {
		super();
		this.x = x;
	}

	public double plus(double... r) {
		double result = x;
		for (double d : r)
			result += d;
		return result;
	}

	public double moins(double... r) {
		double result = x;
		for (double d : r)
			result -= d;
		return result;
	}

}
