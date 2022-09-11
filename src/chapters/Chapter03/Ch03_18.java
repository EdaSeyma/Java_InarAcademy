package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double w = input.nextDouble();
		if (w > 50)
			System.out.println("The package cannot be shipped.");
		else {
			if (0 < w && w == 1) {
				System.out.println("the shipping cost is " + 3.5);

			} else if (1 < w && w <= 3) {
				System.out.println("the shipping cost is " + 5.5);

			} else if (1 < w && w <= 10) {
				System.out.println("the shipping cost is " + 8.5);

			} else if (10 < w && w <= 20) {
				System.out.println("the shipping cost is " + 10.5);

			}
		}
	}
}
