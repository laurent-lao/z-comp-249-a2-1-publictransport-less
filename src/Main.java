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
		System.out.println("** Testing constructors and toString **");

		// Aircraft
		System.out.println("Testing Aicraft class");
		System.out.println(new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly));

		// Ferry
		System.out.println("Testing Ferry class");
		System.out.println(new Ferry(12.00, 2, 1991, "Laurent"));

		// City Bus
		//System.out.println("Testing CityBus class");
		//System.out.println(new CityBus(11.00, 1, 13, 1991, "Grand", "Steven"));

		// Tram
		//System.out.println("Testing Tram class");
		//System.out.println(new Tram(10.00, 2, 14, 1990, "Foo", "Mick", 100));

		// Metro
		//System.out.println("Testing Metro class");
		//System.out.println(new Metro(9.00, 3, 15, 1989, "Bar", "Arthur", 8, "Montreal"));

		// ******** Testing equals ********
		System.out.println("** Testing equals() **");

		// Aircraft
		System.out.println("Testing Aicraft class");
		Aircraft aircraft1 = new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly);
		Aircraft aircraft2 = new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly);
		Aircraft aircraft3 = new Aircraft(12.30, 3, air.Class.Helicopter, Maintenance.Monthly);
		System.out.println("These should be equal: " + aircraft1.equals(aircraft2));
		System.out.println("These should be not equal: " + aircraft1.equals(aircraft3));

		// Ferry
		System.out.println("Testing Ferry class");
		Ferry ferry1 = new Ferry(12.00, 2, 1991, "Laurent");
		Ferry ferry2 = new Ferry(12.00, 2, 1991, "Laurent");
		Ferry ferry3 = new Ferry(12.01, 2, 1991, "Laurent");
		System.out.println("These should be equal: " + ferry1.equals(ferry2));
		System.out.println("These should be not equal: " + ferry1.equals(ferry3));

		// City bus
		//System.out.println("Testing CityBus class");
		//CityBus bus1 = new CityBus(11.00, 1, 13, 1991, "Grand", "Steven");
		//System.out.println("These should be equal: " + bus1.equals(bus2));
		//System.out.println("These should be not equal: " + bus1.equals(bus3));

		// Tram
		//System.out.println("Testing Tram class");
		//Tram tram1 = new Tram(10.00, 2, 14, 1990, "Foo", "Mick", 100);
		//System.out.println("These should be equal: " + tram1.equals(tram2));
		//System.out.println("These should be not equal: " + tram1.equals(tram3));

		// Metro
		//System.out.println("Testing Metro class");
		//Metro metro1 = new Metro(9.00, 3, 15, 1989, "Bar", "Arthur", 8, "Montreal");
		//System.out.println("These should be equal: " + metro1.equals(metro2));
		//System.out.println("These should be not equal: " + metro1.equals(metro3));
	}
}
