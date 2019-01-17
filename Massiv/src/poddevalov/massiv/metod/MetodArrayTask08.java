package poddevalov.massiv.metod;

import java.util.Scanner;

public class MetodArrayTask08 {
	public static String [] fillArrayCatabaticLatinLetter(String [] input){
		Scanner string = new Scanner(System.in);
		System.out.println("«аполнить массив строковыми латинскими буквами");
		for (int i = 0; i < input.length; i ++)
			input[i] = string.nextLine();
		return input;
	}
	
	
	public static void countLetter(String [] input){
		int count;
		String temp = "";
		for (char i = 'a'; i <= 'z'; i++){
			count = 0;
			for (String s : input){
				if (s.equals(String.valueOf(i))){
					count++;
					temp = s;
				}
			}
			if (count > 3)
				System.out.print(temp + " ");
		}
	}

}
