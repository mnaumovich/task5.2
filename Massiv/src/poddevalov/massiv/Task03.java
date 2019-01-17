package poddevalov.massiv;

public class Task03 {
	public static boolean provElemMasNaSovpad(int[] ishod) {
		boolean b = true;
		for (int i = 1; i < ishod.length; i++) {
			if (ishod[0] != ishod[i]) {
				b = false;
				break;
			}
		}
		return b;

	}

	public static void main(String[] args) {
		int[] mas = { 10, 10, 10, 10, 10, 10 };
		String result = provElemMasNaSovpad(mas) ? "Yes" : "No";
		System.out.println(result);

	}

}
