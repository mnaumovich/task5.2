package poddevalov.massiv.metod;

import java.util.Random;

public class MetodArrayTask09 {
	public static int[] zapolMas(int[] input) {
		Random arr = new Random();
		for (int i = 0; i < input.length; i++) {
			input[i] = (arr.nextInt(input.length + 1) - 2);
		}
		return input;
	}

	public static int[] checkArrayOnNegativeNumber(int[] input) {
		int[] checkArray = new int[input.length];
		int temp = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < -1) {
				temp = input[i];
				checkArray[i] = temp * temp;
			} else
				checkArray[i] = input[i];
		}
		return checkArray;
	}
}
