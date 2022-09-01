package Assigments;

import java.util.Scanner;

public class W03_A03 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Maaşınızı ve yılınızı giriniz: ");
		
		 double maas = input.nextDouble();
		 double yil = input.nextDouble();
		 
		 if (yil >5) {
			 maas = maas+ maas*5/100;
			 System.out.println("Bonus almaya hak kazandınız. Maaşınız: "+maas);
			 
		 } else {
			 System.out.println("Bonus kazanamadınız.");
		 }
		}

}