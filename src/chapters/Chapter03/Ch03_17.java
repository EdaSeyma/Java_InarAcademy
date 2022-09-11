package chapters.Chapter03;

import java.util.Random;
import java.util.Scanner;

public class Ch03_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//int number = (int) (Math.random() * 3);
		Random random = new Random();
		int number = random.nextInt(3);
		System.out.println("Enter a digit between 1-3");
		int usernumber = input.nextInt();
		String name = "";
		String username = "";
		switch (number) {
		case 0: {name = "scissor"; break;}
		case 1: {name = "rock"; break;}
		case 2: {name = "paper"; break;}
		}
		switch (usernumber) {
		case 0: {username = "scissor"; break;}
		case 1: {username = "rock"; break;}
		case 2: {username = "paper";break;}
		}
		if (number == 2 && usernumber == 1 || number == 1 && usernumber == 0 || number == 0 && usernumber == 1) {
			System.out.println("The computer is " + name + " ,you are " + username + " . Computer won.");
		} else if (number == usernumber) {
			System.out.println("The computer is " + name + " ,you are " + username + " too . It is a draw");
		} else {
			System.out.println("The computer is " + name + " ,you are " + username + " . You won");
		}
	}
}