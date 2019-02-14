package air;

import transport.PublicTransport;

// @TODO Aircraft copy
public class Aircraft extends PublicTransport {

	public enum Class
	{
		Helicopter,
		Airline,
		Glider,
		Balloon
	}

	public enum Maintenance
	{
		Weekly,
		Monthly,
		Yearly
	}

	Class       aircraftClass;
	Maintenance aircraftMaintenanceSchedule;

	public Aircraft() {
		aircraftClass = null;
		aircraftMaintenanceSchedule = null;
	}

	public Aircraft(double ticketPrice, int numberOfStops, Class aircraftClass, Maintenance aircraftMaintenanceSchedule) {

		// Uses parent class's constructor
		super(ticketPrice, numberOfStops);

		this.aircraftClass = aircraftClass;
		this.aircraftMaintenanceSchedule = aircraftMaintenanceSchedule;

	}

	public Class getAircraftClass() {
		return aircraftClass;
	}

	public void setAircraftClass(Class aircraftClass) {
		this.aircraftClass = aircraftClass;
	}

	public Maintenance getAircraftMaintenanceSchedule() {
		return aircraftMaintenanceSchedule;
	}

	public void setAircraftMaintenanceSchedule(Maintenance aircraftMaintenanceSchedule) {
		this.aircraftMaintenanceSchedule = aircraftMaintenanceSchedule;
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
		Aircraft aircraft = (Aircraft) o;
		return aircraftClass == aircraft.aircraftClass &&
				aircraftMaintenanceSchedule == aircraft.aircraftMaintenanceSchedule &&
				super.equals(aircraft);
	}

	public String toString() {
		return "Aircraft{" +
				"aircraftClass=" + aircraftClass +
				", aircraftMaintenanceSchedule=" + aircraftMaintenanceSchedule +
				", ticketPrice=" + ticketPrice +
				", numberOfStops=" + numberOfStops +
				'}';
	}
}
