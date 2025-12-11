import java.util.Random; 

abstract class Animal {
	protected int simID;
	protected Location location;
	protected boolean full; 
	protected boolean rested;
	private Random rand; 
	
	public int getSimID() {
		return simID; 
	}
	public boolean isFull() { 
		return full; 
	}
	public boolean isRested() { 
		return rested; 
	}
	
	public Animal() {
		this.simID = 0; 
		this.location = new Location(0,0);
		this.full = false; 
		this.rested = true; 	
		this.rand = new Random();
	}
	
	public Animal(int simID, Location location) throws InvalidSimIDException {
		this.simID = simID;
		this.location = location; 
		this.full = false; 
		this.rested = true; 
		this.rand = new Random();
	}
	
	public void eat() {
		double randomDouble = rand.nextDouble();
		
		if (randomDouble <= 0.5) {
			full = false; 
		}
		else {
			full = true; 
		}
	}
	
	public void sleep() {
		double randDouble = rand.nextDouble();
		if (randDouble <= 0.5) {
			rested = false;
		}
		else {
			rested = true; 
		}
	}
	
}
