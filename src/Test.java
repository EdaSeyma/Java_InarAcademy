
public class Test {

    public static void main(String[] strings) {

        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantInSeconds = 45.0;



        double currentPopulation = 312032486;

        double secondsInYears = 60 * 60 * 24 * 365;

        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + (int)currentPopulation);

        }
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distanceInMiles = 24;

        // Converting from miles to kilometers
        // Note: the book said 1.6, however 1.60934 is more accurate
        double distanceInKilometers = distanceInMiles * 1.60934;

        // Converting current time (hour, minutes, seconds) into total amount of minutes
        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0;

        // Calculating kilometers per hour
        // kph = 60 * distance traveled / minutes taken
        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;

        System.out.println(kilometersPerHour);
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("x = " + x + " y = " + y);
        
        System.out.println("Population projection");
		System.out.println("Current population: 312032486");
		System.out.println("One birth every 7 seconds.");
		System.out.println("One death every 13 seconds.");
		System.out.println("One new immigrant every 45 seconds.");
		System.out.println("Yearly Population projection formula: ");
		System.out.println("Current population + ((births per year)");
		System.out.println("                   - (deaths per year)");
		System.out.println("                   + (new immigrants per year))");
		System.out.println("                   * year.");
		System.out.println("Year 1 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 1));
		System.out.println("Year 2 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 2));
		System.out.println("Year 3 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 3));
		System.out.println("Year 4 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 4));
		System.out.println("Year 5 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 5));

    }
}