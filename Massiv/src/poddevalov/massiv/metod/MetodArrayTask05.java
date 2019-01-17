package poddevalov.massiv.metod;

import java.util.Random;
import java.util.Scanner;

public class MetodArrayTask05 {

	public static int[] zapolMas(int[] input) {
		Random res = new Random();
		for (int i = 0; i < input.length; i++) {
			input[i] = (res.nextInt(21) - 10);
		}
		return input;
	}

	public static void removeElementMas(int[] input) {
		int count;
		int temp;
		int i;
		for (i = -10; i <= 10; i++) {
			count = 0;
			temp = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[j] == i) {
					temp = input[j];
					count++;
				}
			}
			if (count >= 1)
				System.out.println(temp + " - " + count + " раз");
		}
	}
}
