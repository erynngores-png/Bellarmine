public class Square implements AreaInterface {
	private double side;
	
	public Square() {
		this.side = 0.0;
	}
	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;

	}

    @Override 
    public double getInteriorArea() {
        return side * side; 
    }
	
}
