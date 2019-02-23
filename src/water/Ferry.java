package water;

import transport.PublicTransport;

public class Ferry extends PublicTransport {

	int    buildYear;
	String skipName = "";

	public Ferry() {

		// *** Uses parent class's constructor automatically *** no need of super()

		buildYear = 0;
	}

	public Ferry(double ticketPrice, int numberOfStops, int buildYear, String skipName) {
		// Uses parent class's constructor
		super(ticketPrice, numberOfStops);

		this.buildYear = buildYear;
		this.skipName = skipName;
	}

	public Ferry(Ferry ferry) {
		// Uses parent class's constructor
		super(ferry);

		this.buildYear = ferry.buildYear;
		this.skipName = ferry.skipName;
	}

	public int getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}

	public String getSkipName() {
		return skipName;
	}

	public void setSkipName(String skipName) {
		this.skipName = skipName;
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
		Ferry ferry = (Ferry) o;
		return buildYear == ferry.buildYear &&
				skipName.equals(ferry.skipName) &&
				super.equals(ferry);
	}

	public String toString() {
		return "Ferry:" +
				" [Ticket Price] " + ticketPrice +
				" [Number Of Stops] " + numberOfStops +
				" [Build Year] " + buildYear +
				" [Skip Name] " + skipName;
	}
}
