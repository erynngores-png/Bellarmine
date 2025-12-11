
public class InvalidSubspeciesException extends RuntimeException {

	public InvalidSubspeciesException(String message) {
		super(message); 
	}
	
	public InvalidSubspeciesException(String subSpecies) {
		super("Invalid Subspecies: " + subSpecies); 
	}
}
