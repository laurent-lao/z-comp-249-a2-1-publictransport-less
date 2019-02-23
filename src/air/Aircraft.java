package air;

import transport.PublicTransport;

// @TODO Aircraft copy
public class Aircraft extends PublicTransport {

	public enum Class {
		Helicopter,
		Airline,
		Glider,
		Balloon
	}

	public enum Maintenance {
		Weekly,
		Monthly,
		Yearly
	}

	Class       aircraftClass;
	Maintenance aircraftMaintenanceSchedule;

	public Aircraft() {

		// *** Uses parent class's constructor automatically *** no need of super()

		aircraftClass = null;
		aircraftMaintenanceSchedule = null;
	}

	public Aircraft(double ticketPrice, int numberOfStops, Class aircraftClass, Maintenance aircraftMaintenanceSchedule) {

		// Uses parent class's constructor
		super(ticketPrice, numberOfStops);

		this.aircraftClass = aircraftClass;
		this.aircraftMaintenanceSchedule = aircraftMaintenanceSchedule;

	}

	public Aircraft(Aircraft aircraft) {
		// Uses parent class's constructor
		super(aircraft);

		this.aircraftClass = aircraft.aircraftClass;
		this.aircraftMaintenanceSchedule = aircraft.aircraftMaintenanceSchedule;
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
		if (!super.equals(o))
		{
			return false;
		}
		Aircraft aircraft = (Aircraft) o;
		return aircraftClass == aircraft.aircraftClass &&
				aircraftMaintenanceSchedule == aircraft.aircraftMaintenanceSchedule;
	}

	public String toString() {
		return "Aircraft:" +
				" [Ticket Price] " + ticketPrice +
				" [Number Of Stops] " + numberOfStops +
				" [Aircraft Class] " + aircraftClass +
				" [Aircraft Maintenance Schedule] " + aircraftMaintenanceSchedule;
	}
}
