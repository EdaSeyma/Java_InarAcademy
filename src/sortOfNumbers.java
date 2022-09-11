import java.util.Scanner;

public class sortOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three integers
		System.out.print("Enter three integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		// Sort numbers
		
		if (number2 < number1 || number3 < number1)
		{
			if (number2 < number1)
			{
				number1=number1+number2;
				number2 =number1- number2;
				number1 = number1- number2; 
			}
			if (number3 < number1)
			{

				number1=number1+number3;
				number3 =number1- number3;
				number1 = number1- number3; 
			}
		}
		if (number3 < number2)
		{

			number2=number2+number3;
			number3 =number2- number3;
			number2 = number2- number3; 
		}

		// Display numbers in accending order
		System.out.println(number1 + " " + number2 + " " + number3);
	}
}