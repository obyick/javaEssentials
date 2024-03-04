package entities;

public class Triangle {
	public double x;
	public double y;
	public double z;
	
	public double triangleArea() {
		double semiperimeter = (x + y + z) / 2;
		return Math.sqrt(semiperimeter * Math.abs(semiperimeter - x) * Math.abs(semiperimeter - y) * Math.abs(semiperimeter - z));
	}
}