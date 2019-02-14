// Importing packages

import java.util.Random;

import air.Class;
import transport.*;
import air.*;
import water.*;
import city.*;

public class Main {

	// Arrays to be used for generating objects
	// Usage: listOfCities[getRandomInt(listOfCities.length)]
	private static String[] listOfCities = new String[] {"Montreal", "Toronto",
														 "Ottawa", "Calgary",
														 "Vancouver", "Halifax",
														 "Fredericton", "Quebec",
														 "Regina", "Victoria",
														 "Saskatoon", "Edmonton",
														 "Charlottetown", "St. John's",
														 "Winnipeg"};
	// Usage: listOfNames[getRandomInt(listOfNames.length)]
	private static String[] listOfNames  = new String[] {"Sophia", "Aria",
														 "Amelia", "Jackson",
														 "Noah", "Grayson",
														 "Riley", "Charlotte",
														 "Olivier", "Elijah",
														 "Lily", "Emily",
														 "Logan", "Liam",
														 "Mason", "Mia",
														 "Abigail", "Lucas",
														 "Jacob", "Matthew",
														 "Hanna", "Brianna"};

	public static void main(String[] args) {

		debug_main(); // Debug launcher

		// TODO create a random generator for Public Transport classes
	}

	/**
	 * Used for testing code
	 */
	public static void debug_main() {

		// ******** Testing constructors ********
		debug_constructorAndToString();

		// ******** Testing equals ********
		debug_equals();

		// Testing random object generator
		//for (int i = 0; i < 10; i++)
		//{
		//	System.out.println("**** Generating all objects #" + (i + 1) + " ****");
		//
		//	System.out.println("Generating a random Aircraft: " + getRandomAircraft());
		//	System.out.println("Generating a random Ferry: " + getRandomFerry());
		//	System.out.println("Generating a random City Bus: " + getRandomCityBus());
		//}
	}

	private static void debug_constructorAndToString() {
		System.out.println("** Testing constructors and toString **");

		// Aircraft @DONE
		System.out.println("Testing Aicraft class");
		System.out.println("\tDefault: " + new Aircraft());
		System.out.println("\tParametized: " + new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly));

		// Ferry @DONE
		System.out.println("Testing Ferry class");
		System.out.println("\tDefault: " + new Ferry());
		System.out.println("\tParametized" + new Ferry(12.00, 2, 1991, "Laurent"));

		// City Bus @DONE
		System.out.println("Testing CityBus class");
		System.out.println("\tDefault: " + new CityBus());
		System.out.println("\tParametized" + new CityBus(11.00, 1, 13, 1991, "Grand", "Steven"));

		// Tram @TODO
		System.out.println("Testing Tram class");
		System.out.println("\tDefault: " + new Tram());
		System.out.println("\tParametized" + new Tram(10.00, 2, 14, 1990, "Foo", "Mick", 100));

		// Metro @TODO
		System.out.println("Testing Metro class");
		System.out.println("\tDefault: " + new Metro());
		System.out.println("\tParametized" + new Metro(9.00, 3, 15, 1989, "Bar", "Arthur", 8, "Montreal"));
	}

	private static void debug_equals() {
		System.out.println("** Testing equals() **");

		// Aircraft @DONE
		System.out.println("Testing Aircraft class");
		Aircraft aircraft1 = new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly);
		Aircraft aircraft2 = new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly);
		Aircraft aircraft3 = new Aircraft(12.30, 3, air.Class.Helicopter, Maintenance.Monthly);
		Aircraft aircraft4 = null;
		System.out.println("These should be equal: " + aircraft1.equals(aircraft2));
		System.out.println("These should be not equal: " + aircraft1.equals(aircraft3));
		System.out.println("Handles null (should be false): " + aircraft1.equals(aircraft4));

		// Ferry @DONE
		System.out.println("Testing Ferry class");
		Ferry ferry1 = new Ferry(12.00, 2, 1991, "Laurent");
		Ferry ferry2 = new Ferry(12.00, 2, 1991, "Laurent");
		Ferry ferry3 = new Ferry(12.01, 2, 1991, "Laurent");
		Ferry ferry4 = null;
		System.out.println("These should be equal: " + ferry1.equals(ferry2));
		System.out.println("These should be not equal: " + ferry1.equals(ferry3));
		System.out.println("Handles null (should be false): " + ferry1.equals(ferry4));

		// City bus @DONE
		System.out.println("Testing CityBus class");
		CityBus bus1 = new CityBus(11.00, 1, 13, 1991, "Grand", "Steven");
		CityBus bus2 = new CityBus(11.00, 1, 13, 1991, "Grand", "Steven");
		CityBus bus3 = new CityBus(11.00, 1, 13, 1991, "Hehe", "Steven");
		CityBus bus4 = null;
		System.out.println("These should be equal: " + bus1.equals(bus2));
		System.out.println("These should be not equal: " + bus1.equals(bus3));
		System.out.println("Handles null (should be false): " + bus1.equals(bus4));

		// Tram @TODO
		System.out.println("Testing Tram class");
		Tram tram1 = new Tram(10.00, 2, 14, 1990, "Foo", "Mick", 100);
		Tram tram2 = new Tram(10.00, 2, 14, 1990, "Foo", "Mick", 100);
		Tram tram3 = new Tram(10.00, 3, 14, 1990, "Foo", "Mick", 100);
		Tram tram4 = null;
		System.out.println("These should be equal: " + tram1.equals(tram2));
		System.out.println("These should be not equal: " + tram1.equals(tram3));
		System.out.println("Handles null (should be false): " + tram1.equals(tram4));

		// Metro @TODO
		System.out.println("Testing Metro class");
		Metro metro1 = new Metro(9.00, 3, 15, 1989, "Bar", "Arthur", 8, "Montreal");
		Metro metro2 = new Metro(9.00, 3, 15, 1989, "Bar", "Arthur", 8, "Montreal");
		Metro metro3 = new Metro(9.00, 3, 15, 1979, "Bar", "Arthur", 8, "Montreal");
		Metro metro4 = null;
		System.out.println("These should be equal: " + metro1.equals(metro2));
		System.out.println("These should be not equal: " + metro1.equals(metro3));
		System.out.println("Handles null (should be false): " + metro1.equals(metro4));
	}

	// End of code testers

	/**
	 * Generates a random number with a maximum
	 *
	 * @param exclusive_maximum
	 *
	 * @return random integer between 0 and exclusive_maximum (exclusive)
	 */
	public static int getRandomInt(int exclusive_maximum) {

		return new Random().nextInt(exclusive_maximum);
	}

	/**
	 * HACK: Uses the getRandomInt to create a random price
	 *
	 * @return a price of maximum 5 digits (999.99) and minimum of 2 digits (0.99)
	 */
	public static double getRandomPrice() {

		double price = 0.00;

		while (price < 0.99)
		{
			// reset price
			price = 0.00;
			double priceIndex = 0.01;

			// Generate the double using one digit at a time
			for (int maximumDigits = getRandomInt(4) + 2; maximumDigits > 0; maximumDigits--)
			{
				// Gets a digit between 0 and 9 (inclusive)
				price += priceIndex * getRandomInt(10);

				// Go to next digit of the double
				priceIndex *= 10;

			}
		}

		// HACK: Clean up the double to 2 digits after decimal place using casting
		int priceCast = (int) (price * 100);
		price = priceCast / 100.0;

		return price;
	}

	/**
	 * Generate a random year using a max Age
	 *
	 * @param maxAge
	 *
	 * @return
	 */
	public static int getRandomYear(int maxAge) {
		int yearNow = 2019;

		return yearNow = 2019 - getRandomInt(maxAge);
	}

	/**
	 * Generate a random Aircraft
	 *
	 * @return an Aircraft object
	 */
	public static Aircraft getRandomAircraft() {
		// Get a randomClass
		air.Class randomClass = air.Class.values()[getRandomInt(air.Class.values().length)];

		// Get a randomMaintenanceSchedule
		Maintenance randomMaintenace = Maintenance.values()[getRandomInt(Maintenance.values().length)];

		return new Aircraft(getRandomPrice(), getRandomInt(10), randomClass, randomMaintenace);
	}

	public static Ferry getRandomFerry() {

		return new Ferry(getRandomPrice(), getRandomInt(10), getRandomYear(120), listOfNames[getRandomInt(listOfNames.length)]);
	}

	public static CityBus getRandomCityBus() {

		// Generating a route number and its corresponding line name
		long   routeNumber = getRandomInt(500);
		String lineName    = listOfNames[getRandomInt(listOfNames.length)] + " ";

		if (routeNumber < 100)
		{
			lineName += "Street";
		}
		else if (routeNumber < 200)
		{
			lineName += "Avenue";
		}
		else if (routeNumber < 300)
		{
			lineName += "Boulevard";
		}
		else
		{
			lineName += "Express";
		}

		return new CityBus(getRandomPrice(), getRandomInt(100), routeNumber, getRandomYear(120), lineName, listOfNames[getRandomInt(listOfNames.length)]);
	}

}
