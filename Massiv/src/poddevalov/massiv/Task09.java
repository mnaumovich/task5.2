package poddevalov.massiv;

import java.util.Arrays;

import poddevalov.massiv.metod.EnterNumber;
import poddevalov.massiv.metod.MetodArrayTask09;

public class Task09 {

	public static void main(String[] args) {
		int [] arrayRezult;
		int [] array = new int [EnterNumber.enterNumder()];
		MetodArrayTask09.zapolMas(array);
		arrayRezult = MetodArrayTask09.checkArrayOnNegativeNumber(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrayRezult));
	}

}
