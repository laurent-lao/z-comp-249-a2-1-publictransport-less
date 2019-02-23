package city;

import transport.PublicTransport;

public class CityBus extends PublicTransport {

	protected long   routeNumber;
	protected int    beginOperationYear;
	protected String lineName   = "";
	protected String driverName = "";

	public CityBus() {

		// *** Uses parent class's constructor automatically ***

		routeNumber = 0;
		beginOperationYear = 0;
	}

	public CityBus(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName) {
		// Uses parent class's constructor
		super(ticketPrice, numberOfStops);

		this.routeNumber = routeNumber;
		this.beginOperationYear = beginOperationYear;
		this.lineName = lineName;
		this.driverName = driverName;
	}

	public CityBus(CityBus citybus) {
		// Uses parent class's constructor
		super(citybus);

		this.routeNumber = citybus.routeNumber;
		this.beginOperationYear = citybus.beginOperationYear;
		this.lineName = citybus.lineName;
		this.driverName = citybus.driverName;
	}

	public long getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(long routeNumber) {
		this.routeNumber = routeNumber;
	}

	public int getBeginOperationYear() {
		return beginOperationYear;
	}

	public void setBeginOperationYear(int beginOperationYear) {
		this.beginOperationYear = beginOperationYear;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
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
		CityBus cityBus = (CityBus) o;
		return routeNumber == cityBus.routeNumber &&
				beginOperationYear == cityBus.beginOperationYear &&
				lineName.equals(cityBus.lineName) &&
				driverName.equals(cityBus.driverName);
	}

	public String toString() {
		return "This City Bus's" +
				" ticket price is $" + ticketPrice +
				" and has " + numberOfStops + " stops." +
				" The Route Number " + routeNumber +
				" (" + lineName + ")" +
				" started in " + beginOperationYear +
				" and is driven by " + driverName + ".";
	}
}
