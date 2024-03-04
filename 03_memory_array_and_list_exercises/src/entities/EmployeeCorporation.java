package entities;

public class EmployeeCorporation {
	private Integer id;
	private String name;
	private Double salary;

	public EmployeeCorporation(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "ID: " + id + "\nName: " + name + "\nSalary: " + salary;
	}

}
