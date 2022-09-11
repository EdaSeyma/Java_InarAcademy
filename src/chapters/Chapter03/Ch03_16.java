package chapters.Chapter03;

import java.text.DecimalFormat;

public class Ch03_16 {

	public static void main(String[] args) {
		double x = Double.parseDouble(new DecimalFormat("##.##").format(Math.random() * 100 - 50));
		double y = Double.parseDouble(new DecimalFormat("##.##").format(Math.random() * 200 - 100));

		System.out.println("Coordinates in Regtangular : " + x + " " + y);
	}

}
