package demo;

public class Pyramid extends shape {

	private double length;
	private double area;
	private double volume;
	
	public Pyramid(double height, double length) {
		setHeight(height);
		this.length = length;
	}
	
	@Override
	public double calcArea() {
		area = this.length*this.length;
		return area;
	}

	@Override
	public double calcVolume() {
		volume = this.length*this.length*this.getHeight();
		return volume;
	}

}
