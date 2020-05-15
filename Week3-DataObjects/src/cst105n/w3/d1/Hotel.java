package cst105n.w3.d1;

import java.util.ArrayList;

public class Hotel {
	
	// Attributes/ Variables
	private String name;
	private String city;
	private int numRooms;
	private boolean hasPool;
	private ArrayList<Room> rooms = new ArrayList<>();

	// Constructor
	public Hotel(String name, String city, int numRooms, boolean hasPool) {
		super();
		this.name = name;
		this.city = city;
		this.numRooms = numRooms;
		this.hasPool = hasPool;
		rooms.add(new Room(101, 1, 79.99));	 // 0
		rooms.add(new Room(102, 2, 99.99));  // 1
		rooms.add(new Room(103, 2, 99.99));  // 2
	}

	// Getters/Setters
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public int getNumRooms() {
		return numRooms;
	}
	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}
	public boolean isHasPool() {
		return hasPool;
	}
	public void setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
	}

	
	// Override Methods
	@Override
	public String toString() {
		String output =  "Hotel [name=" + name + ", city=" + city + ", numRooms=" + numRooms + ", hasPool=" + hasPool + "]\n";
		for (Room r : rooms)
			output += r + "\n";
		return output;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + (hasPool ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numRooms;
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
		Hotel other = (Hotel) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (hasPool != other.hasPool)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numRooms != other.numRooms)
			return false;
		return true;
	}
	
	
	
	
}
