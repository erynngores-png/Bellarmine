import java.util.List;

public class BrownBear extends Animal implements Walkable, Swimmable {
	private String subSpecies;
	
	private static final List<String> species = List.of("Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian");

	public BrownBear() {
		super();
		subSpecies = "Alaskan";
	}
	
	public BrownBear(int simID, Location l, String subSpecies) {
		super(simID, l);
		this.subSpecies = subSpecies;
	}
	
	public String getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(String subSpecies) {
		if(!species.contains(subSpecies)) {
			throw new InvalidSubspeciesException(subSpecies);
		}
		
		this.subSpecies = subSpecies; 
	}
	
	@Override
	public void walk(String direction) {
		int x = location.getXCoord();
		int y = location.getYCoord();
		
		if (direction.equalsIgnoreCase("N")) {
			y += 3; 
		}
		
		else if (direction.equalsIgnoreCase("S")) {
			y -= 3; 
		}
		
		else if (direction.equalsIgnoreCase("E")){
			x += 3;
		}
		
		else if (direction.equalsIgnoreCase("W")) {
			x -= 3;
		}
		
		location.update(x, y);
		
	}
	
	@Override
	public void swim(String direction) {
		int x = location.getXCoord();
		int y = location.getYCoord();
		
		if (direction.equalsIgnoreCase("N")) {
			y += 2; 
		}
		
		else if (direction.equalsIgnoreCase("S")) {
			y -= 2; 
		}
		
		else if (direction.equalsIgnoreCase("E")) {
			x += 2;
		}
		
		else if (direction.equalsIgnoreCase("W")) {
			x -= 2;
		}
		
		location.update(x, y);
		
	}
	
	@Override 
	public String toString() {
		return "Brown Bear {" + "simID: " + getSimID() + ", location: " + location + ", full: " + isFull() + ", rested: " + isRested() + ", subspecies: " + getSubSpecies() + "}";
	}
	

}
