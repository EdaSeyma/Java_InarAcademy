package chapters.Chapter02;

import java.util.Scanner;

public class Ch02_18 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "  " + (i + 1) + "  " + (int)Math.pow(i, i + 1));
		}
	}
}