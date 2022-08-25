package chapters.Chapter01;

public class W01_Section1_10 {
	public static void main(String[] args) {

		double kilometers = 14.0;
		double miles = kilometers / 1.6;
		double t = (45 * 60.0 + 30.0) / 3600.0;

		double AveSpeed = miles / t;

		System.out.println(AveSpeed);
	}

}
