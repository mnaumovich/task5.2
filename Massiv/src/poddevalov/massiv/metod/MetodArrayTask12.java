package poddevalov.massiv.metod;

public class MetodArrayTask12 {
	public static boolean provercaArray(int [] input){
		boolean b = true;
		int i, j;
		for (i = 0, j = input.length - 1; i < input.length; i++, j--){
			if (input[i] != input[j]){
				b = false;
				break;
			}
			if (i == j)
				break;
		}
		return b;
	}
}
