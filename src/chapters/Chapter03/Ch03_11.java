package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter month 1-12");
		int month = input.nextInt();
		System.out.println("Enter year ");
		int year = input.nextInt();
		String monthName="";
		
		switch (month) {
		case 1: monthName = "January";break;
		case 2: monthName = "February";break;
		case 3: monthName = "March";break;
		case 4: monthName = "April";break;
		case 5: monthName = "May";break;
		case 6: monthName = "June";break;
		case 7: monthName = "July";break;
		case 8: monthName = "August";break;
		case 9: monthName = "September";break;
		case 10:monthName = "October";break;
		case 11:monthName = "November";break;
		case 12:monthName = "December";break;
		}
		 if(month == 1||month==3||month == 5||month==3||month == 7||month==8||month==10||month==12) {
			 System.out.println(monthName + year +" had 31 days");
		 } else if(month == 4||month==6||month == 9||month==11) {
			 System.out.println(monthName +" "+ year +" had 30 days");
		 }else if(month==2 && year%4==0) {
			 System.out.println(monthName+" "+ year +" had 29 days");
		 }else if(month==2 && year%4!=0) {
			 System.out.println(monthName +" "+ year +" had 28 days");
		 }
		
		
}
}