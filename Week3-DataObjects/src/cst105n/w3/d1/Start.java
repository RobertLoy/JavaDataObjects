package cst105n.w3.d1;

public class Start {

	public static void main(String[] args) {

		Guest guest = new Guest("Tom Jones");
		//System.out.println(guest.toString());		
		
		Hotel hotel = new Hotel("GCU Hotel", "Phoenix", 100, true);
		System.out.println(hotel.toString());
		
		hotel.getRooms().get(0).setNumBeds(2);
		
		System.out.println(hotel.toString());
	
	}

}
