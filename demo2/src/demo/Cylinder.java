package demo;

public class Cylinder extends shape {
	
	private double radius;
	private double height;
	private double area;
	private double volume;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double height, double radius) {
		super();
		setHeight(height);
		this.radius = radius;
	}
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}



	@Override
	public double calcArea() {
		
		area = Math.PI*this.radius*this.radius;
	
		return area;
	}

	@Override
	public double calcVolume() {
		
		volume = Math.PI*this.radius*this.radius*getHeight();
		System.out.println(getHeight());
		
		return volume;
	}
	

}
