package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		boolean fiveAndSix = number % 5 == 0 && number % 6 == 0;
        boolean fiveOrSix = number % 5 == 0 || number % 6 == 0;
        boolean fiveSixNotBoth = (number % 5 == 0 || number % 6 == 0) ^ (number % 5 == 0 && number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + fiveAndSix);
        System.out.println("Is " + number + " divisible by 5 or 6? " + fiveOrSix);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + fiveSixNotBoth);
	}
}