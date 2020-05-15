package cst105n.w3.d1;

import java.time.LocalDate;

public class CreditCard {

	// Attributes/ Variables
	private String number;
	private int cv;
	private char type;
	private LocalDate expiration;
	
	// Constructors
	public CreditCard(String number, int cv, char type, LocalDate expiration) {
		super();
		this.number = number;
		this.cv = cv;
		this.type = type;
		this.expiration = expiration;
	}
	
	// Getters/Setters
	public String getNumber() {
		return number;
	}
	public int getCv() {
		return cv;
	}
	public char getType() {
		return type;
	}
	public LocalDate getExpiration() {
		return expiration;
	}

	// Override Methods
	@Override
	public String toString() {
		return "CreditCard [number=" + number + ", cv=" + cv + ", type=" + type + ", expiration=" + expiration + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cv;
		result = prime * result + ((expiration == null) ? 0 : expiration.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + type;
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
		CreditCard other = (CreditCard) obj;
		if (cv != other.cv)
			return false;
		if (expiration == null) {
			if (other.expiration != null)
				return false;
		} else if (!expiration.equals(other.expiration))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	
}
