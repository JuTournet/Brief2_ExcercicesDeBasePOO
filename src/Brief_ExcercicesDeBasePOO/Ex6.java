package Brief_ExcercicesDeBasePOO;

public class Ex6 {

	public static int addition(int num1, int num2) {
		return num1 + num2;
	}

	public static int soustraction(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public static int division(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("Impossible de divisé par 0");
			return 0;
		} else {
			return num1 / num2;
		}
	}

	public static int divisionEuclidienne(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("Impossible de divisé par 0");
			return 0;
		} else {
			return num1 % num2;
		}
	}

	public static double puissance(double num1, double num2) {
		return Math.pow(num1, num2);
	}
}
