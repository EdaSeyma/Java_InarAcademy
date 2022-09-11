package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1,y1 ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if ((0 <= x && x <= 200) && (0 <= y && y <= 100)) {
			System.out.println("Point (" + x + " , " + y + ") is in the triangle ");
		} else {
			System.out.println("Point (" + x + " , " + y + ") is not in the triangle ");
		}
	}

}
