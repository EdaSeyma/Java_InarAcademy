package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double miles = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double price = input.nextDouble();
		 double cost = (distance/miles)*price;
		 
		 System.out.println("The cost of driving is "+cost);
	}

}
