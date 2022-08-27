package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_11 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the number of years: ");
	
	int years = input.nextInt();
	double SecondsInYear = 365 * 24 * 60 * 60;
	double BirthAmount = SecondsInYear/7.0;
	double DeathAmount = SecondsInYear/13.0;
	double NewImmigrantAmount = SecondsInYear/45.0;
	
	double CurrentPopulation = 312032486;

	
		CurrentPopulation = CurrentPopulation+ (BirthAmount + NewImmigrantAmount - DeathAmount) *years;
		
	System.out.println("The population in "+years+" years is " + (int)CurrentPopulation);
}
}
