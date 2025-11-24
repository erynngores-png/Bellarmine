
public class Main {

	public static void main(String[] args) {
		
		Garage aGarage = new Garage(3);
		Vehicle aCar = new Vehicle("Chevrolet", "Bolt");
		
		aGarage.addVehicle(aCar); 
		
		aCar = new Vehicle("Mazda", "Miata");
		aGarage.addVehicle(aCar);
		
		System.out.println("Number of Vehicles: " + aGarage.getNumVehicles());
		System.out.println();
		
		for(int i = 0; i < aGarage.getNumVehicles(); i++) {
			System.out.println("Vehicle " + i);
			System.out.print(aGarage.getVehicleList()[i].getMake());
			System.out.print(", ");
			System.out.print(aGarage.getVehicleList()[i].getModel());
			System.out.print("\n\n");
		}
	}

}
