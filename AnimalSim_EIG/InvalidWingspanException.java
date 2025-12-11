
public class InvalidWingspanException extends RuntimeException{

		public InvalidWingspanException(String message) {
			super(message);
		}
		
		public InvalidWingspanException(double wingSpan) {
			super("Invalid Wingspan: " + wingSpan); 
		}
}
