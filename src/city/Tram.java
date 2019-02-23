package city;

public class Tram extends CityBus {

	private int maximumSpeed;

	public Tram() {

		// *** Uses parent class's constructor automatically ***

		this.maximumSpeed = 0;
	}

	public Tram(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName, int maximumSpeed) {
		// Uses parent class's constructor
		super(ticketPrice, numberOfStops, routeNumber, beginOperationYear, lineName, driverName);

		this.maximumSpeed = maximumSpeed;
	}

	public Tram(Tram tram) {
		// Uses parent class's constructor
		super(tram);

		this.maximumSpeed = tram.maximumSpeed;
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
		return maximumSpeed == tram.maximumSpeed;
	}

	public String toString() {
		return "Tram:" +
				" [Ticket Price] " + ticketPrice +
				" [Number Of Stops] " + numberOfStops +
				" [Route Number] " + routeNumber +
				" [Begin Operation Year] " + beginOperationYear +
				" [Line Name] " + lineName +
				" [Driver Name] " + driverName +
				" [Maximum Speed] " + maximumSpeed;
	}
}
