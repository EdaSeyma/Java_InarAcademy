package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		double convertNumber = input.nextDouble();
		System.out.println("Enter the dollar amount: ");
		double amount = input.nextDouble();

		if (convertNumber == 0) {
			double yuan = exchangeRate * amount;
			
			System.out.println("$"+amount+" is "+yuan);
		} else if (convertNumber == 1) {
			double dolar =  amount/exchangeRate;
			System.out.println(amount+" yuan is $"+dolar);
		} else {
			System.out.println("Incorrect input.");
		}
	}
}
