package poddevalov.massiv;

public class Task01 {
	public static int[] fibonachiMassiv(int razmer) {
		int[] fib = new int[razmer];
		int x1 = 0;
		int x2 = 1;
		int sled;
		fib[0] = x1;
		fib[1] = x2;
		for (int a = 2; a < fib.length; a++) {
			sled = x1 + x2;
			fib[a] = sled;
			x1 = x2;
			x2 = sled;
		}
		return fib;
	}

	public static void vuvodMassiv(int[] mas) {
		for (int j = 0; j < mas.length; j++) {
			System.out.print(mas[j] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] fibCh = fibonachiMassiv(15);
		vuvodMassiv(fibCh);
	}
}
