package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mac = (int) (Math.random() * 2);

		System.out.println("Enter guess");
		int guess = input.nextInt();

		if (mac == 1) {
			System.out.println("Your answer is true");
		} else {
			System.out.println("Your answer is false");
			System.out.println("The correct answer is  " + mac);
		}
	}

}
