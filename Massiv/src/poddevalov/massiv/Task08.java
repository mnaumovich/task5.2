package poddevalov.massiv;

import poddevalov.massiv.metod.EnterNumber;
import poddevalov.massiv.metod.MetodArrayTask08;

public class Task08 {

	public static void main(String[] args) {
		String [] stringMassiv = new String [EnterNumber.enterNumder()];
		MetodArrayTask08.fillArrayCatabaticLatinLetter(stringMassiv);
		MetodArrayTask08.countLetter(stringMassiv);
	}

}
