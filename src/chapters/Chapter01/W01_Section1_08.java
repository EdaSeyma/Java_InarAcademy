package chapters.Chapter01;

import java.lang.Math.*;

public class W01_Section1_08 {
	public static void main(String[] args) {
		double perimeter;
		double radius = 5.5;
		double area;

		perimeter = 2 * radius * Math.PI;
		area = radius * radius * Math.PI;

		System.out.println(perimeter);
		System.out.println(area);
	}

}
