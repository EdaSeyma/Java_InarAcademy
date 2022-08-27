package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the monthly saving amount: ");

		double montlyAmount = input.nextDouble();
		System.out.println("Enter the when you calculate after month: ");

		int month = input.nextInt();
		double totalAmount = 0;

		for (int i = 1; i <= month; i++) {
			totalAmount =(totalAmount+ montlyAmount) * (1 + 0.00417);
		}
		System.out.println("After " + month + " months your total amount: " + totalAmount);
	}

}
