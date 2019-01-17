package poddevalov.massiv.metod;

import java.util.Random;

public class MetodArrayTask10 {
	public static int[] zapolnMassivRandom(int[] input) {
		Random res = new Random();
		for (int i = 0; i < input.length; i++) {
			input[i] = res.nextInt(34);
		}
		return input;
	}

	public static void divisionArrayWithoutResidue(int[] input) {
		int index = 0;
		for (int i = 0; i < input.length - 2; i++) {
			if (input[i] == 0 || input[i + 2] == 0)
				continue;

			if ((input[i + 1] % input[i] == 0) && (input[i + 1] % input[i + 2] == 0)) {
				index = i + 1;
				break;
			}
			else
				index = 0;
		}
		if (index == 0)
			System.out.println(-1);
		else
			System.out.println(index);

	}
}
