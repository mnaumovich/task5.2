package poddevalov.massiv;

import java.util.Arrays;

import poddevalov.massiv.metod.EnterNumber;
import poddevalov.massiv.metod.MetodArrayTask10;

public class Task10 {

	public static void main(String[] args) {
		int [] sourseArray = new int[EnterNumber.enterNumder()];
		MetodArrayTask10.zapolnMassivRandom(sourseArray);
		System.out.println(Arrays.toString(sourseArray));
		MetodArrayTask10.divisionArrayWithoutResidue(sourseArray);
	}
}
