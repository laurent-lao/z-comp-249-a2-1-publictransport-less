import air.*;
import city.CityBus;

public class Main {

    public static void main(String[] args) {

    	debug_main(); // Debug launcher


    }

	/**
	 * Used for testing code
	 */
	public static void debug_main()
	{
		// ******** Testing constructors ********
		System.out.println("Testing constructors and toString");

		// Aircraft
		System.out.println("Testing Aicraft class");
		System.out.println(new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly));

		// Ferry
		//System.out.println("Testing Transport class");
		//System.out.println(new Ferry(12.00, 2, 1991, "Laurent"));

		// City Bus
		//System.out.println("Testing CityBus class");
		//System.out.println(new CityBus(11.00, 1, 13, 1991, "Grand", "Steven"));

		// Tram
		//System.out.println("Testing Tram class");
		//System.out.println(new CityBus(10.00, 2, 14, 1990, "Foo", "Mick", 100));

		// Tram
		//System.out.println("Testing Tram class");
		//System.out.println(new CityBus(9.00, 3, 15, 1989, "Bar", "Arthur", 8, "Montreal"));


	}
}
