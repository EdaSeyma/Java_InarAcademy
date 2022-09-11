package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = input.nextDouble();
		System.out.println("Enter number of years: ");
		double numberOfyears = input.nextDouble();
		
		double futureInvestmentValue;
		
		 futureInvestmentValue=investmentAmount*Math.pow((1+monthlyInterestRate),(numberOfyears*12));
		 System.out.println("Accumaleted value is "+futureInvestmentValue);
		
	}

}
