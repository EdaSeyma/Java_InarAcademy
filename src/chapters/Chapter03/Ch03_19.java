package chapters.Chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		double perimeter;

		double[] arrEdges = { edge1, edge2, edge3 };
		Arrays.sort(arrEdges);
		double min = arrEdges[0];
		double max = arrEdges[arrEdges.length - 1];
		double middle = arrEdges[1];

		if (max - min > middle) {
			perimeter = edge1 + edge2 + edge3;
			System.out.println("The perimeter is " + perimeter);
		} else {
			System.out.println("The input is invalid.");
		}
	}
}
