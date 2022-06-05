package demo;

public class PentagonalPrism extends shape {
	
	private double length;
	private double area;
	
	public PentagonalPrism(double height, double length) {
		setHeight(height);
		this.length = length;
	}
	@Override
	public double calcArea() {
		double radian = Math.toRadians(54);
		area = (5*this.length*this.length*Math.tan(radian))/4;
		return area;
	}

	@Override
	public double calcVolume() {
		double x = calcArea();
		return x*this.getHeight();
	}

}
