import java.awt.geom.Area;

public class Main {

	public static void main(String[] args) {
		AreaInterface square = new Square(2.0); 
        AreaInterface circle = new Circle(2.0); 
	
		System.out.printf("%.1f%n", square.getInteriorArea()); 
		System.out.printf("%.2f%n", circle.getInteriorArea()); 


	}

}