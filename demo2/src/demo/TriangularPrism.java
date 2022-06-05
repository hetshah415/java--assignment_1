package demo;

public class TriangularPrism extends shape {
	
	private double length;
	private double area;
	
	public TriangularPrism(double height, double length) {
		super(height);
		this.length = length;
	}

	@Override
	public double calcArea() {
		area = this.length*this.length*Math.sqrt(3)/4;
		return area;
	}

	@Override
	public double calcVolume() {
		double x = calcArea();
		return x*this.getHeight();
	}

}
