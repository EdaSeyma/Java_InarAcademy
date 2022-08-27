package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_04 {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double pounds = klavye.nextDouble();

		double kilograms;

		kilograms = pounds * 0.454;
		
		System.out.println(pounds+ " pounds is "+ kilograms+ " kilograms");

	}

}
