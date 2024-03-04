package entities;

public class Control {
	public String name;
	public double salary;
	public double taxes;
	
	public double netSalary() {
		return salary - taxes;
	}
	
	public double newSalary(double increment) {
		increment *= salary /100;
		return salary += increment;
	}
	
	public String toString() {
		return "Employee"
				+ "\nName: " + name
				+ "\nSalary: " + String.format("%.2f", netSalary());
	}
}
