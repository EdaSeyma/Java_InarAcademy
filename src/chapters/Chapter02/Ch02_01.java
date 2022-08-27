package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_01 {
	public static void main(String[] args) {
		double fahrenheit;

		Scanner klavye = new Scanner(System.in);

		System.out.println("Enter a degree in Celcius: ");

		double celsius = klavye.nextDouble();

		fahrenheit = (9.0 / 5.0) * celsius + 32;
		System.out.println(celsius + " Celcius is " + fahrenheit + " Fahrenheit");
	}

}
