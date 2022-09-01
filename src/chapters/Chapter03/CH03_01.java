package chapters.Chapter03;

import java.util.Scanner;

public class CH03_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a,b,c ");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double r1;
		double r2;
		double dictriminant = Math.pow(b, 2) - 4 * a * c;

		if (dictriminant > 0) {
			r1 = (-1 * b + Math.pow(dictriminant, 0.5)) / (2 * a);
			r2 = (-1 * b - Math.pow(dictriminant, 0.5)) / (2 * a);
			System.out.println("The equation has two roots " + r1 + " and " + r2);

		} else if (dictriminant == 0) {
			r1 = (-1 * b + Math.pow(dictriminant, 0.5)) / (2 * a);
			System.out.println("The equation has one roots " + r1);

		} else {
			System.out.println("The equation has no real roots");
		}

	}

}
