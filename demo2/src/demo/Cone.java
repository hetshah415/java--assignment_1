package demo;

public class Cone extends shape {
	
	private double radius;
	private double area;
	private double volume;
	
	public Cone() {
		
	}
	
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		area = Math.PI*this.radius*this.radius;
		
		return area;
	}

	@Override
	public double calcVolume() {
		volume = (Math.PI*this.radius*this.radius*this.getHeight())/3;
		return volume;
	}
	
}

