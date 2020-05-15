package cst105n.w3.d1;

import java.time.LocalDate;

public class Guest {
	
	// Attributes/ Variables
	private String name;
	private int loyaltyNumber;
	private char discount;
	private CreditCard card = new CreditCard("1111-2222-3333-4444", 011, 'V', LocalDate.of(2022, 11, 01));


	// Constructor
	public Guest(String name) {
		super();
		this.name = name;
	}	
	
	// Getters/Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLoyaltyNumber() {
		return loyaltyNumber;
	}
	public void setLoyaltyNumber(int loyaltyNumber) {
		this.loyaltyNumber = loyaltyNumber;
	}
	public char getDiscount() {
		return discount;
	}
	public void setDiscount(char discount) {
		this.discount = discount;
	}

	// Override Methods
	@Override
	public String toString() {
		return "Guest [name=" + name + ", loyaltyNumber=" + loyaltyNumber + ", discount=" + discount + ", card=" + card
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + loyaltyNumber;
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
		Guest other = (Guest) obj;
		if (loyaltyNumber != other.loyaltyNumber)
			return false;
		return true;
	}
	
	
}
