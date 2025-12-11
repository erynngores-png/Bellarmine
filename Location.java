public class Location {
	private int xCoord; 
	private int yCoord;
	
	public int getXCoord() {
		return xCoord;
	}

	public int getYCoord() {
		return yCoord;
	}

	public Location() {
		this.xCoord = 0; 
		this.yCoord = 0;
	}
	
	public Location(int xCoord, int yCoord) {
		update(xCoord, yCoord); 
	}
	
	public void update(int x, int y) {
		if (x < 0 || y < 0) {
			throw new InvalidCoordinateException (x, y);
		}
		
		this.xCoord = x;
		this.yCoord = y; 
	}
	
	public int[] getCoordinates() {
		return new int[] {xCoord, yCoord}; 
	}
	
	@Override
	public String toString() {
		return "(" + xCoord + ", " + yCoord + ")";
	}

}
