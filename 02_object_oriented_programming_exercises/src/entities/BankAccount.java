package entities;

public class BankAccount {
	private int id;
	private double initial;
	private double cash;
	public String name;



	public BankAccount(int id, double initial, String name) {
		this.id = id;
		this.initial = initial;
		this.cash = initial;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public double getInitial() {
		return initial;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getCash() {
		return cash;
	}
	
	
	public void deposit(double cash) {
		this.cash += cash;
	}
	
	
	public void withdraw(double cash) {
		this.cash -= (cash + 5.00);
	}



	public String toString() {
		return "Account: " + id
				+ "\nName: " + name
				+ "\nCash: " + cash;
	}
	
	
}
