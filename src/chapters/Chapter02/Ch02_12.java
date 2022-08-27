package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter speed and accelaration: ");
		
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		double length = (speed*speed)/(2*acceleration);
			
		System.out.println("The minumum runway lenght for this airplane is "+length);
	}

}
