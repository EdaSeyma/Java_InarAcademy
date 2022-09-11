package chapters.Chapter03;

import java.util.Scanner;

public class Ch03_23 {

		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			System.out.println("Enter a point with two coordinates: ");
			double x=input.nextDouble();
			double y=input.nextDouble();
			double dist=Math.pow((Math.pow(x, 2)+Math.pow(y, 2)),0.5);
			if((-5<=x && x<=5) && (-2.5<=y && x<=2.5)){
			System.out.println("Point ("+x+" , "+y+") is in the regtangle "  );
			} else {
				System.out.println("Point ("+x+" , "+y+") is not in the regtangle "  );
			}
	}

}
