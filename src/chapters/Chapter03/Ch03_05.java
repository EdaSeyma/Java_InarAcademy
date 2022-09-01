package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's day : ");
		int today = input.nextInt();
		String todayName = "";
		System.out.println("Enter the number of day elapsed since today : ");
		int elapsedDay = input.nextInt();
		String elapseName = "";
		 int day = today+elapsedDay;

		switch (today) {
		case 1: todayName = "Sunday"; break;
		case 2: todayName = "Monday"; break;
		case 3: todayName = "Tuesday"; break;
		case 4: todayName = "Wednesday"; break;
		case 5: todayName = "Thursday"; break;
		case 6: todayName = "Friday"; break;
		case 7: todayName = "Saturday"; break;
		}
		
		switch (day) {
		case 1: elapseName = "Sunday"; break;
		case 2: elapseName = "Monday"; break;
		case 3: elapseName = "Tuesday"; break;
		case 4: elapseName = "Wednesday"; break;
		case 5: elapseName = "Thursday"; break;
		case 6: elapseName = "Friday"; break;
		case 7: elapseName = "Saturday"; break;
		}
		System.out.println("Today is "+todayName+" and the future day after "+elapsedDay+" day is "+elapseName);
	}
	}
