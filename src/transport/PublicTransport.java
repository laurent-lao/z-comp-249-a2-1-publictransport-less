package transport;

public class PublicTransport {

	protected double ticketPrice;
	protected int    numberOfStops;

	public PublicTransport() {
		ticketPrice = 0;
		numberOfStops = 0;
	}

	public PublicTransport(double ticketPrice, int numberOfStops) {
		this.ticketPrice = ticketPrice;
		this.numberOfStops = numberOfStops;
	}

	public PublicTransport(PublicTransport publicTransport) {
		this.ticketPrice = publicTransport.ticketPrice;
		this.numberOfStops = publicTransport.numberOfStops;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNumberOfStops() {
		return numberOfStops;
	}

	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
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
		PublicTransport that = (PublicTransport) o;
		return ticketPrice == that.ticketPrice &&
				numberOfStops == that.numberOfStops;
	}

	public String toString() {
		return "This Public Transport's" +
				" ticket price is $" + ticketPrice +
				" and has " + numberOfStops + " stops.";
	}
}