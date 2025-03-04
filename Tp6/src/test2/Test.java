package test2;

import ma.projet.bean2.Complexe;

public class Test {
	public static void main(String[] args) {

		Complexe c1 = new Complexe(4, 3);
		Complexe c2 = new Complexe(2, 1);

		c1.plus(c2);
		c1.affiche(); 

		c1.moins(c2);
		c1.affiche(); 

	}

}
