package chapters.Chapter01;

public class W01_Section1_11 {
	public static void main(String[] args) {
		
		double SecondsInYear = 365 * 24 * 60 * 60;
		double BirthAmountInYear = SecondsInYear/7.0;
		double DeathAmountInYear= SecondsInYear/13.0;
		double NewImmigrantAmountInYear = SecondsInYear/45.0;
		
		double CurrentPopulation = 312032486;

		for (int i = 1; i < 6; i++) {
			CurrentPopulation = CurrentPopulation
					+ ((BirthAmountInYear + NewImmigrantAmountInYear - DeathAmountInYear) * i)-(BirthAmountInYear + NewImmigrantAmountInYear - DeathAmountInYear) * (i-1);
			System.out.println(i + ".year new population: " + CurrentPopulation);
		}

	}

}
