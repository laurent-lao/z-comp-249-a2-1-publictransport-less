import air.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        debug_main(); // Main debugger


    }

    public static void debug_main()
	{
		System.out.println(new Aircraft(12.34, 3, air.Class.Helicopter, Maintenance.Monthly));
	}
}
