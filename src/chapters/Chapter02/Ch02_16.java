package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a side ");
		double side = input.nextDouble();

		double area = (3.0 / 2.0 * Math.pow(3.0, 1.0 / 2.0)) * (side * side);
		System.out.println("The area of the hexagon is " + area);
	}

}
