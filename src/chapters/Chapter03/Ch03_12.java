package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three-digit integers: ");
		int number=input.nextInt();
		
		int int1 = number/100;
		int int3 = number%10;

		if (int1 == int3) {

			System.out.println(number +" is a palindrome");

		} else {

			System.out.println(number+ " is not a palindrome");
		}

	}
}
