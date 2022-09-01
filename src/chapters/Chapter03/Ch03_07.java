package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount in double: ");
		double amount = input.nextDouble();
		int remaingOfAmount =(int)(amount*100);
		int numberofDollars = remaingOfAmount/100;
	    remaingOfAmount = remaingOfAmount%100;
		int numberofQuarters = remaingOfAmount/25;
		remaingOfAmount =remaingOfAmount%25;
		int numberofDimes=remaingOfAmount/10;
		remaingOfAmount=remaingOfAmount%10;
		int numberofNicels=remaingOfAmount/5;
		remaingOfAmount=remaingOfAmount%5;
		int numberofPennies=remaingOfAmount;
		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberofDollars + " dollars, " + numberofPennies + " pennies");
	}

}
