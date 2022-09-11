package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_21 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int h ;
	System.out.println("Enter year: (e.g., 2012): ");
	int year = input.nextInt();
	System.out.println("Enter month: 1-12: ");
	int m = input.nextInt();
	System.out.println("Enter the day of the month: ");
	int q = input.nextInt();
	String todayName = "";
	
	int j = year/100;
	int k = year%100;
	
	if(m == 1) {
		m=13;
		year-=1;
		
	} else if (m==2) {
		m=14;
		year-=1;
	}
	h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
	
	System.out.println(h);
	
	switch (h) {
	case 0: todayName = "Saturday"; break;
	case 1: todayName = "Sunday"; break;
	case 2: todayName = "Monday"; break;
	case 3: todayName = "Tuesday"; break;
	case 4: todayName = "Wednesday"; break;
	case 5: todayName = "Thursday"; break;
	case 6: todayName = "Friday"; break;
	}	
	
	System.out.println("Day of the week is "+todayName);
	
}
}