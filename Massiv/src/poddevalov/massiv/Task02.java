package poddevalov.massiv;

import java.util.Arrays;
import java.util.Random;

public class Task02 {

	public static int[] zapolnMas(int[] razmer) {
		Random res = new Random();
		for (int i = 0; i < razmer.length; i++) {
			razmer[i] = (res.nextInt(121) - 70);
		}
		return razmer;
	}

	public static void poiskMinMax(int[] ish) {
		int min;
		int max;
		min = max = ish[0];
		for (int j = 0; j < ish.length; j++) {
			if (ish[j] < min)
				min = ish[j];
			if (ish[j] > max)
				max = ish[j];
		}

		System.out.println(min + " " + max);
	}

	public static void main(String[] args) {
		int[] mas = new int[30];
		zapolnMas(mas);
		System.out.println(Arrays.toString(mas));
		poiskMinMax(mas);
	}

}
