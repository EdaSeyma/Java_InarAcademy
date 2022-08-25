package chapters.Chapter01;

public class W01_Section1_11 {
	public static void main(String[] args) {

		double BirthRateInSecond = 7.0;
		double DeathRateInSecond = 13.0;
		double NewImmigrantRateInSecond = 45.0;
		double SecondsInYear = 365 * 24 * 60 * 60;
		double CurrentPopulation = 312032486;

		for (int i = 1; i < 6; i++) {
			CurrentPopulation = CurrentPopulation
					+ (BirthRateInSecond + NewImmigrantRateInSecond - DeathRateInSecond) * SecondsInYear;
			System.out.println(i + ".year, new population : " + CurrentPopulation);
		}

	}

}
