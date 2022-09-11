package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_10 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int number1 = (int)(Math.random()*100);
		int number2 = (int)(Math.random()*100);
		System.out.println("What is " + number1 + " - " + number2 + "? ");
		System.out.println("Enter your answer: ");
		int answer= input.nextInt();
		
		System.out.println("number1 = "+number1+", number2 = "+number2);
		if(number1<number2) {
			number1=number2+number1;
			number2=number1-number2;
			number1=number1-number2; 
		}
		if(number1-number2 == answer) {
			System.out.println("You are correct!");
		} else {
			int correctAnswer = number1-number2;
			System.out.println("Your answer is wrong!");
			System.out.println(+number1+" - "+number2+" = "+correctAnswer);
		}
	}

}

