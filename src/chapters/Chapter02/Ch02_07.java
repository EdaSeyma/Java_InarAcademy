package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minutes=input.nextInt();
		
		int years =minutes / (365 * 24 * 60);
		int days = (minutes % (365 * 24 * 60)) / (24 * 60);
		
		System.out.println(minutes+ " minutes is approximately "+years+" years and "+days+" days");

	}
}
