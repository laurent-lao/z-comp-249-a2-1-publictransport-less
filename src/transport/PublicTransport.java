package transport;

// @TODO
public class PublicTransport {

	protected double ticketPrice;
	protected int numberOfStops;

	public PublicTransport() {
		ticketPrice = 0;
		numberOfStops = 0;
	}

	public PublicTransport(double ticketPrice, int numberOfStops) {
		this.ticketPrice = ticketPrice;
		this.numberOfStops = numberOfStops;
	}
}