package poddevalov.massiv.metod;

import java.util.Scanner;

public class MetodArrayTask11 {
	public static String[] fillLowercaseLetter(String[] inputArray) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = sc.nextLine();
		}
		return inputArray;
	}

	public static void TotalNumberWord(String[] input) {
		int count = 0;
		String temp = "";
		for (int i = 0; i < input.length; i++) {
			temp = input[i];
			if (proverca(temp))
				count++;
		}
		System.out.print("Общее количество слов: " + count);
	}

	public static boolean proverca(String input) {
		boolean b = true;
		char proverca = ' ';
		for (int j = 0; j < input.length(); j++) {
			if (proverca == input.charAt(j))
				b = false;
		}
		return b;

	}

}
