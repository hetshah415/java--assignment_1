package demo;

public class Cylinder extends shape {
	
	private double radius;
	private double area;
	private double volume;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double height, double radius) {
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
		
		volume = Math.PI*this.radius*this.radius*this.getHeight();
		
		return volume;
	}
	

}
