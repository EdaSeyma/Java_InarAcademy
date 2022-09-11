package chapters.Chapter03;
import java.util.Scanner;

public class Ch03_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

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

		
		System.out.println(number1 + " " + number2 + " " + number3);
	}
}