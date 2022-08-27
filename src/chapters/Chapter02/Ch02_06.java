package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");

		int digit = input.nextInt();

		int hundreds = digit / 100;
		int reminder = digit % 100;
		int tenth = reminder / 10;
		reminder %= 10;
		int units = reminder;

		int sum = hundreds + tenth + reminder;

		System.out.println("The sum of the digits is " + sum);
	}

}
