package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();

		double weightkilograms = weight * 0.45359237;
		double heightmeters = height * 0.0254;
		double BMI = weightkilograms / (heightmeters * heightmeters);
		
		System.out.println("BMI is "+BMI);
	}

}
