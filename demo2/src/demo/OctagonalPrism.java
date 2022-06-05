package demo;

public class OctagonalPrism extends shape {
	
	private double length;
	private double area;
	
	public OctagonalPrism(double height, double length) {
		super(height);
		this.length = length;
	}
	@Override
	public double calcArea() {
		area = 2*(1+Math.sqrt(2))*this.length*this.length;
		return area;
	}

	@Override
	public double calcVolume() {
		double x = calcArea();
		return x*this.getHeight();
	}

}
