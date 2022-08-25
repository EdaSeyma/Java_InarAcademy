package chapters.Chapter01;

public class W01_Section1_07 {
	public static void main(String[] args) {
		double sum = 0.0;
		for (double i = 1.0; i < 7.0; i++) {
			if (i % 2 != 0) {
				sum = sum + 4 * (1 / (2.0 * i - 1.0));

			}
			if (i % 2 == 0) {
				sum = sum + 4 * ((-1) / (2.0 * i - 1.0));

			}

		}
		System.out.println(sum);
	}
}
