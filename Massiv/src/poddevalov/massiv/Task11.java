package poddevalov.massiv;

import java.util.Arrays;
import java.util.Random;

import poddevalov.massiv.metod.EnterNumber;
import poddevalov.massiv.metod.MetodArrayTask11;

public class Task11 {

	public static void main(String[] args) {
		String [] sourseArray = new String[EnterNumber.enterNumder()];
		MetodArrayTask11.fillLowercaseLetter(sourseArray);
		System.out.println(Arrays.toString(sourseArray));
		MetodArrayTask11.TotalNumberWord(sourseArray);
		
		
	}
}
