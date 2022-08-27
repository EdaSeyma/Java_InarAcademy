package chapters.Chapter02; 

import java.util.Scanner;

public class Ch02_05 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		
		
		double subtotal= klavye.nextDouble();
		double gratuityRate = klavye.nextDouble();
		
		double gratuity = subtotal*(gratuityRate/100);
		
		double total = gratuity+subtotal;
		System.out.println("The gratuity is "+gratuity+" and total is "+total);
	}

}
