package city;

public class Metro extends CityBus {

	private int    numberOfVehicles;
	private String nameOfTheCity = "";

	public Metro() {

		// *** Uses parent class's constructor automatically ***

		this.numberOfVehicles = 0;
	}

	public Metro(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName, int numberOfVehicules, String nameOfTheCity) {
		// Uses parent class's constructor
		super(ticketPrice, numberOfStops, routeNumber, beginOperationYear, lineName, driverName);

		this.numberOfVehicles = numberOfVehicules;
		this.nameOfTheCity = nameOfTheCity;
	}

	public Metro(Metro metro) {
		// Uses parent class's constructor
		super(metro);

		this.numberOfVehicles = metro.numberOfVehicles;
		this.nameOfTheCity = metro.nameOfTheCity;
	}

	public int getNumberOfVehicules() {
		return numberOfVehicles;
	}

	public void setNumberOfVehicules(int numberOfVehicules) {
		this.numberOfVehicles = numberOfVehicules;
	}

	public String getNameOfTheCity() {
		return nameOfTheCity;
	}

	public void setNameOfTheCity(String nameOfTheCity) {
		this.nameOfTheCity = nameOfTheCity;
	}

	public boolean equals(Object o) {
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		Metro metro = (Metro) o;
		return numberOfVehicles == metro.numberOfVehicles &&
				nameOfTheCity.equals(metro.nameOfTheCity);
	}

	public String toString() {
		return "This Metro's" +
				" ticket price is $" + ticketPrice +
				", has " + numberOfStops + " stops" +
				" and " + numberOfVehicles + " vehicles." +
				" The Route Number " + routeNumber +
				" (" + lineName + ")" +
				" operating in " + nameOfTheCity +
				" started in " + beginOperationYear +
				" and is driven by " + driverName + ".";
	}
}
