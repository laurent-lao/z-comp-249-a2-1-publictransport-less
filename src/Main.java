// Importing packages

import transport.*;
import air.*;
import water.*;
import city.*;

public class Main {

	public static void main(String[] args) {

		debug_main(); // Debug launcher

	}

	/**
	 * Used for testing code
	 */
	public static void debug_main() {

		// ******** Testing constructors ********
		debug_constructorAndToString();

		// ******** Testing equals ********
		debug_equals();
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
		System.out.println("\tParametized"+new Ferry(12.00, 2, 1991, "Laurent"));

		// City Bus @DONE
		System.out.println("Testing CityBus class");
		System.out.println("\tDefault: " + new CityBus());
		System.out.println("\tParametized" + new CityBus(11.00, 1, 13, 1991, "Grand", "Steven"));

		// Tram @TODO
		//System.out.println("Testing Tram class");
		//System.out.println("\tDefault: " + new Tram());
		//System.out.println("\tParametized" + new Tram(10.00, 2, 14, 1990, "Foo", "Mick", 100));

		// Metro @TODO
		//System.out.println("Testing Metro class");
		//System.out.println("\tDefault: " + new Metro());
		//System.out.println("\tParametized" + new Metro(9.00, 3, 15, 1989, "Bar", "Arthur", 8, "Montreal"));
	}

	private static void debug_equals() {
		System.out.println("** Testing equals() **");

		// Aircraft @DONE
		System.out.println("Testing Aicraft class");
		Aircraft aircraft1 = new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly);
		Aircraft aircraft2 = new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly);
		Aircraft aircraft3 = new Aircraft(12.30, 3, air.Class.Helicopter, Maintenance.Monthly);
		System.out.println("These should be equal: " + aircraft1.equals(aircraft2));
		System.out.println("These should be not equal: " + aircraft1.equals(aircraft3));

		// Ferry @DONE
		System.out.println("Testing Ferry class");
		Ferry ferry1 = new Ferry(12.00, 2, 1991, "Laurent");
		Ferry ferry2 = new Ferry(12.00, 2, 1991, "Laurent");
		Ferry ferry3 = new Ferry(12.01, 2, 1991, "Laurent");
		System.out.println("These should be equal: " + ferry1.equals(ferry2));
		System.out.println("These should be not equal: " + ferry1.equals(ferry3));

		// City bus @DONE
		System.out.println("Testing CityBus class");
		CityBus bus1 = new CityBus(11.00, 1, 13, 1991, "Grand", "Steven");
		CityBus bus2 = new CityBus(11.00, 1, 13, 1991, "Grand", "Steven");
		CityBus bus3 = new CityBus(11.00, 1, 13, 1991, "Hehe", "Steven");
		System.out.println("These should be equal: " + bus1.equals(bus2));
		System.out.println("These should be not equal: " + bus1.equals(bus3));

		// Tram @TODO
		//System.out.println("Testing Tram class");
		//Tram tram1 = new Tram(10.00, 2, 14, 1990, "Foo", "Mick", 100);
		//System.out.println("These should be equal: " + tram1.equals(tram2));
		//System.out.println("These should be not equal: " + tram1.equals(tram3));

		// Metro @TODO
		//System.out.println("Testing Metro class");
		//Metro metro1 = new Metro(9.00, 3, 15, 1989, "Bar", "Arthur", 8, "Montreal");
		//System.out.println("These should be equal: " + metro1.equals(metro2));
		//System.out.println("These should be not equal: " + metro1.equals(metro3));
	}

	// End of code testers


}
