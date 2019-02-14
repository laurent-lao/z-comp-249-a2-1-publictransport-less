package city;

import java.util.Objects;

// @TODO Tram Copy
public class Tram extends CityBus {

	private int maximumSpeed;

	public Tram() {
		this.maximumSpeed = 0;
	}

	public Tram(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName, int maximumSpeed) {
		super(ticketPrice, numberOfStops, routeNumber, beginOperationYear, lineName, driverName);
		this.maximumSpeed = maximumSpeed;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
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
		Tram tram = (Tram) o;
		return maximumSpeed == tram.maximumSpeed && super.equals(tram);
	}

	public String toString() {
		return "Tram{" +
				"maximumSpeed=" + maximumSpeed +
				", routeNumber=" + routeNumber +
				", beginOperationYear=" + beginOperationYear +
				", lineName='" + lineName + '\'' +
				", driverName='" + driverName + '\'' +
				", ticketPrice=" + ticketPrice +
				", numberOfStops=" + numberOfStops +
				'}';
	}
}
