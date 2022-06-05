 package demo;

public abstract class shape {


	private double height;


	public shape() {
	
	}

	public shape(double height) {
	
	}
	
	
	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	public abstract double calcArea();
	public abstract double calcVolume();
	
	}
