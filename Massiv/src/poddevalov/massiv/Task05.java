package poddevalov.massiv;

import java.util.Arrays;


import poddevalov.massiv.metod.MetodArrayTask05;

public class Task05 {

	public static void main(String[] args) {

		int[] ishMas = new int[10];
		MetodArrayTask05.zapolMas(ishMas);
		System.out.println(Arrays.toString(ishMas));
		MetodArrayTask05.removeElementMas(ishMas);
	}
}
