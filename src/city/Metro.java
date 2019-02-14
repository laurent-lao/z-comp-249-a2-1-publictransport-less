package city;

import java.util.Objects;

// @TODO Metro copy
public class Metro extends CityBus {

	private int    numberOfVehicules;
	private String nameOfTheCity = "";

	public Metro() {
		this.numberOfVehicules = 0;
	}

	public Metro(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName, int numberOfVehicules, String nameOfTheCity) {
		super(ticketPrice, numberOfStops, routeNumber, beginOperationYear, lineName, driverName);
		this.numberOfVehicules = numberOfVehicules;
		this.nameOfTheCity = nameOfTheCity;
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
				nameOfTheCity.equals(metro.nameOfTheCity)
				&& super.equals(metro);
	}

	public String toString() {
		return "Metro{" +
				"numberOfVehicules=" + numberOfVehicules +
				", nameOfTheCity='" + nameOfTheCity + '\'' +
				", routeNumber=" + routeNumber +
				", beginOperationYear=" + beginOperationYear +
				", lineName='" + lineName + '\'' +
				", driverName='" + driverName + '\'' +
				", ticketPrice=" + ticketPrice +
				", numberOfStops=" + numberOfStops +
				'}';
	}
}
