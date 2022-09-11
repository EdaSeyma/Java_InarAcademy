package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the three-digit number: ");
		int number = input.nextInt();
		int lotarynumber=(int)( Math.random()*100)+100;
		int a=number/100;
		int b=(number%100)/10;
		int c=number%10;
		int d=lotarynumber/100;
		int e=(lotarynumber%100)/10;
		int f=lotarynumber%10;
		
		if(number==lotarynumber) {
			System.out.println("You won 10,000");	
			
		} else if(a==d && a==e && a==f ||b==d && b==e && b==f || c==d && c==e && c==f ) {
			System.out.println("You won 3,000");
			System.out.println("Lotery Number is "+lotarynumber);
			
		} else if(a==d || a==e || a==f ||b==d || b==e || b==f || c==d || c==e|| c==f) {
			System.out.println("You won 1,000");
			System.out.println("Lotery Number is "+lotarynumber);
		} else {
			System.out.println("Try again");
			System.out.println("Lotery Number is "+lotarynumber);
		}
	}

}
