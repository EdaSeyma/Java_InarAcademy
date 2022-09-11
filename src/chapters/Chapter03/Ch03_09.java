package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("he first 9 digits of an ISBN as integer: ");
		int d1 = input.nextInt();
		int d2 = input.nextInt();
		int d3 = input.nextInt();
		int d4 = input.nextInt();
		int d5 = input.nextInt();
		int d6 = input.nextInt();
		int d7 = input.nextInt();
		int d8 = input.nextInt();
		int d9 = input.nextInt();
		String strChecksum = "";
		int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		if (checksum == 10) {
			strChecksum = Integer.toString(checksum) + "X";

			System.out.println("The ISBN-10 number is: "+strChecksum);
		} else {
			strChecksum = Integer.toString(checksum) + "1";

			System.out.println("The ISBN-10 number is: "+strChecksum);
		}

	}//tekrar bak
}