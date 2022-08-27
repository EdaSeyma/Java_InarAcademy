package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_03 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for feet: ");
		double feet = input.nextDouble();
		double meters;

		meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + " meters");
	}

}
