package city;

public class Metro extends CityBus {

	private int    numberOfVehicules;
	private String nameOfTheCity = "";

	public Metro() {

		// *** Uses parent class's constructor automatically ***

		this.numberOfVehicules = 0;
	}

	public Metro(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName, int numberOfVehicules, String nameOfTheCity) {
		// Uses parent class's constructor
		super(ticketPrice, numberOfStops, routeNumber, beginOperationYear, lineName, driverName);

		this.numberOfVehicules = numberOfVehicules;
		this.nameOfTheCity = nameOfTheCity;
	}

	public Metro(Metro metro) {
		// Uses parent class's constructor
		super(metro);

		this.numberOfVehicules = metro.numberOfVehicules;
		this.nameOfTheCity = metro.nameOfTheCity;
	}

	public int getNumberOfVehicules() {
		return numberOfVehicules;
	}

	public void setNumberOfVehicules(int numberOfVehicules) {
		this.numberOfVehicules = numberOfVehicules;
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
		return numberOfVehicules == metro.numberOfVehicules &&
				nameOfTheCity.equals(metro.nameOfTheCity);
	}

	public String toString() {
		return "Metro:" +
				" [Ticket Price] " + ticketPrice +
				" [Number Of Stops] " + numberOfStops +
				" [Route Number] " + routeNumber +
				" [Begin Operation Year] " + beginOperationYear +
				" [Line Name] " + lineName +
				" [Driver Name] " + driverName +
				" [Number Of Vehicule] " + numberOfVehicules +
				" [Name Of The City] " + nameOfTheCity;
	}
}
