package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_02 {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder: ");
		
		double radius = klavye.nextDouble();
		double lenght = klavye.nextDouble();
		double area;
		double volume;

		area = radius * radius * Math.PI;
		System.out.println("The area is " + (int)(area*100)/100);

		volume = area * lenght;
		System.out.println("The volume is " + (int)(volume*100)/100);
	}

}
