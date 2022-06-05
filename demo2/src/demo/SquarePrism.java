package demo;

public class SquarePrism extends shape {
	
	private double length;
	private double volume;
	private double area;
	
	
	public SquarePrism(double height, double length) {
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
