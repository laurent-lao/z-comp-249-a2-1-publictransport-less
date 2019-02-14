package water;

import transport.PublicTransport;

//@TODO Ferry copy
public class Ferry extends PublicTransport {

	int    buildYear;
	String skipName = "";

	public Ferry() {
		buildYear = 0;
	}

	public Ferry(double ticketPrice, int numberOfStops, int buildYear, String skipName) {
		super(ticketPrice, numberOfStops);
		this.buildYear = buildYear;
		this.skipName = skipName;
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
		Ferry ferry = (Ferry) o;
		return buildYear == ferry.buildYear &&
				skipName.equals(ferry.skipName) &&
				super.equals(ferry);
	}

	public String toString() {
		return "Ferry{" +
				"buildYear=" + buildYear +
				", skipName='" + skipName + '\'' +
				", ticketPrice=" + ticketPrice +
				", numberOfStops=" + numberOfStops +
				'}';
	}
}
