
public class Garage {
	
	private Vehicle [] vehicleList;
	private int maxVehicles;
	private int numVehicles; 
	
	public Garage(int maxVehicles) {
		this.maxVehicles = maxVehicles;
		numVehicles = 0;
		vehicleList = new Vehicle[maxVehicles];
	}
	
	public void addVehicle(Vehicle aVehicle) {
		vehicleList[numVehicles] = aVehicle;
		numVehicles++;
	}

	public Vehicle[] getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(Vehicle[] vehicleList) {
		this.vehicleList = vehicleList;
	}

	public int getMaxVehicles() {
		return maxVehicles;
	}

	public void setMaxVehicles(int maxVehicles) {
		this.maxVehicles = maxVehicles;
	}

	public int getNumVehicles() {
		return numVehicles;
	}

	public void setNumVehicles(int numVehicles) {
		this.numVehicles = numVehicles;
	}
	
	

}
