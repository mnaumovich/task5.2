package poddevalov.massiv;

public class Task04 {
	public static boolean poiskRazlElemMas(int[] ishod) {
		boolean b = true;
		for (int i = 0; i < ishod.length; i++) {
			for (int j = i + 1; j < ishod.length; j++) {
				if (ishod[i] == ishod[j]) {
					b = false;
					break;
				}
			}
			if (b == false)
				break;
		}
		return b;
	}

	public static void main(String[] args) {
		int[] mas = { 0, 1, 0, 4, 5, 6, 8, 9 };
		System.out.println(poiskRazlElemMas(mas) ? "Yes" : "No");

	}

}
