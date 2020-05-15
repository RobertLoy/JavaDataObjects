package cst105n.w3.d1;

public class Room {
	
	// Attributes/ Variables
	private int roomNumber;
	private int numBeds;
	private double rate;
	private boolean isBooked = false;

	// Constructor	
	public Room(int roomNumber, int numBeds, double rate) {
		super();
		this.roomNumber = roomNumber;
		this.numBeds = numBeds;
		this.rate = rate;
	}
	
	// Getters/Setters
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getNumBeds() {
		return numBeds;
	}
	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	// Override Methods
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", numBeds=" + numBeds + ", rate=" + rate + ", isBooked=" + isBooked
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roomNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (roomNumber != other.roomNumber)
			return false;
		return true;
	}	
	
	
}
