package poddevalov.massiv.metod;

import java.util.Random;
import java.util.Scanner;

public class MetodArrayTask07 extends MetodArrayTask05{

	public static void removeElementMas(int[] input) {
		int count;
		int temp;
		int i;
		for (i = 3; i <= 13; i++) {
			count = 0;
			temp = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[j] == i) {
					temp = input[j];
					count++;
				}
			}
			if (count > 0)
				System.out.println(temp + " - " + count + " раз");
		}
	}
	
	public static int[] zapolMas(int[] input) {
		Random arr = new Random();
		for (int i = 0; i < input.length; i++) {
			input[i] = (arr.nextInt(11) + 3);
		}
		return input;
	}
}
