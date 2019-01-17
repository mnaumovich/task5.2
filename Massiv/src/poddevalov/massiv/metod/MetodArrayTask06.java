package poddevalov.massiv.metod;

public class MetodArrayTask06 extends MetodArrayTask05 {

	public static void searchUniqueValue(int[] input) {
		int count;
		int temp1;
		int temp2;
		int i;
		int j;
		for (i = -10; i <= 10; i++) {
			count = 0;
			temp1 = 0;
			temp2 = 0;
			for (j = 0; j < input.length; j++) {
				if (input[j] == i) {
					count++;
					if (count == 1)
						temp1 = j;
					else if (count == 2)
						temp2 = j;
				}
			}
			if (count == 2)
				System.out.println(i + " - " + "индекс 1: " + temp1 + " индекс 2: " + temp2);

		}
	}

}
