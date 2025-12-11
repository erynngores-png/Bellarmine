
public class InvalidCoordinateException extends RuntimeException {
	public InvalidCoordinateException (String message) {
		super(message);
	}
	
	public InvalidCoordinateException(int x, int y) {
		super("Invalid Coordinate: (" + x + ", " + y + ")");
	}
}
