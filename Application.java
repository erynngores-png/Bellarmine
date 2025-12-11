import java.util.Scanner; 
import java.util.ArrayList;
public class Main{

	public void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Goldfinch());
		animals.add(new Goldfinch());
		animals.add(new BrownBear());
		animals.add(new BrownBear());
		
		for (Animal i : animals) {
			System.out.println(i.toString());
		}
	}
	
}
