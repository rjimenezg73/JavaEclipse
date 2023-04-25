
public class ForArrays {

	public static void main(String[] args) {
		// array = used to store multiple values  in a single variable
		
		
		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
		String[] colors = new String[3];
			
		cars[0] = "Mustang";
		colors[0] = "Red";
		colors[1] = "Yellow";
		colors[2] = "Blue";
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
