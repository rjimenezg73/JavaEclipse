
public class AguaKoolAid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "water";
		String y = "Kool-Aid";
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		String temp;
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("Despues de usar una variable temporal para cambiar sus valores");
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}
