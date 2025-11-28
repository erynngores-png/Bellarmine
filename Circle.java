public class Circle implements AreaInterface {
	private double radius;
	
	public Circle() {
		this.radius = 0.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


    @Override
    public double getInteriorArea() {
        return Math.PI * radius * radius;  
    }
	
}