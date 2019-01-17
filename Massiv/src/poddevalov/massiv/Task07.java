package poddevalov.massiv;

import java.util.Arrays;
import java.util.Scanner;

import poddevalov.massiv.metod.EnterNumber;
import poddevalov.massiv.metod.MetodArrayTask07;

public class Task07 {
	
	public static void main(String[] args) {
		int [] ourMassiv = new int [EnterNumber.enterNumder()];
		
		MetodArrayTask07.zapolMas(ourMassiv);
		MetodArrayTask07.removeElementMas(ourMassiv);
		System.out.println(Arrays.toString(ourMassiv));
	}
}
