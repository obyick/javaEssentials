package entities;

public class BoardingHouseTenant {
	private String name;
	private String email;
	private Double value;
	private Integer room;
	
	public BoardingHouseTenant(String name, String email, double value, int room) {
		this.name = name;
		this.email = email;
		this.value = value;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public double getRentValue() {
		return value;
	}

	public int getRoomNumber() {
		return room;
	}
	
	public String toString() {
		return "Name: " + name
				+ "\nEmail: " + email
				+ "\nValue: $" + value
				+ "\nRoom: " + room;
	}
}
