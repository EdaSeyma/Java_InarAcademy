import java.util.Scanner;

public class MonetaryUnits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount in double: ");
		double amount = input.nextDouble();
		int remaingOfAmount = (int) (amount * 100);
		int numberofDollars = remaingOfAmount / 100;
		remaingOfAmount = remaingOfAmount % 100;
		int numberofQuarters = remaingOfAmount / 25;
		remaingOfAmount = remaingOfAmount % 25;
		int numberofDimes = remaingOfAmount / 10;
		remaingOfAmount = remaingOfAmount % 10;
		int numberofNicels = remaingOfAmount / 5;
		remaingOfAmount = remaingOfAmount % 5;
		int numberofPennies = remaingOfAmount;
		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberofDollars + " dollars");
		System.out.println(" " + numberofQuarters + " quarters ");
		System.out.println(" " + numberofDimes + " dimes");
		System.out.println(" " + numberofNicels + " nickels");
		System.out.println(" " + numberofPennies + " pennies");
	}

}
