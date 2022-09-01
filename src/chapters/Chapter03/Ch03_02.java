package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);
		int number3 = (int) (System.currentTimeMillis() / 5 % 10);
		System.out.println("What is " + number1 + " + " + number2 + " + " + number3+"?");
		
		int userAnswer = input.nextInt();
		
		
		int answer = number1 + number2 + number3;

		if (userAnswer == answer) {
			System.out.println("Congrats! That is correct!");
		} else
			System.out.println("That is incorrect, please try again");
	}

}
