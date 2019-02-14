package city;

import transport.PublicTransport;

import java.util.Objects;

// @TODO CityBus copy
public class CityBus extends PublicTransport {

	protected long   routeNumber;
	protected int    beginOperationYear;
	protected String lineName   = "";
	protected String driverName = "";

	public CityBus() {
		routeNumber = 0;
		beginOperationYear = 0;
	}

	public CityBus(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName) {
		super(ticketPrice, numberOfStops);
		this.routeNumber = routeNumber;
		this.beginOperationYear = beginOperationYear;
		this.lineName = lineName;
		this.driverName = driverName;
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
				driverName.equals(cityBus.driverName) &&
				super.equals(cityBus);
	}

	public String toString() {
		return "CityBus{" +
				"routeNumber=" + routeNumber +
				", beginOperationYear=" + beginOperationYear +
				", lineName='" + lineName + '\'' +
				", driverName='" + driverName + '\'' +
				", ticketPrice=" + ticketPrice +
				", numberOfStops=" + numberOfStops +
				'}';
	}
}
