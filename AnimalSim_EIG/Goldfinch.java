
public class Goldfinch extends Animal implements Walkable, Flyable {
	private double wingSpan;

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		if(wingSpan <= 0) {
			throw new InvalidWingspanException(wingSpan);
		}
		this.wingSpan = wingSpan;
	} 
	
	public Goldfinch() {
		super();
		this.wingSpan = 9.0;
	}
	
	public Goldfinch(int simID, Location l, double wingSpan) {
		super(simID, l); 
		this.wingSpan = wingSpan; 
		
	}
	
	@Override
	public void walk(String direction) {
		int x = location.getXCoord();
		int y = location.getYCoord();
		
		if (direction.equalsIgnoreCase("N")) {
			y += 1; 
		}
		
		else if (direction.equalsIgnoreCase("S")) {
			y -= 1; 
		}
		
		else if (direction.equalsIgnoreCase("E")) {
			x += 1;
		}
		
		else if (direction.equalsIgnoreCase("W")) {
			x -= 1;
		}
		
		location.update(x, y);
		
	}
	
	@Override 
	public void fly(Location newLocation) {
		location.update(newLocation.getXCoord(), newLocation.getYCoord());
	}
	
	@Override 
	public String toString() {
		return "Goldfinch {" + "simID: " + getSimID() + ", location: " + location + ", full: " + isFull() + ", rested: " + isRested() + ", wingspan: " + wingSpan + "}";
	}

}
