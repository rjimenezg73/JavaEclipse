import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.1416;
		double y = -10;
		double z = Math.max(x, y);
		double zMin = Math.min(x, y);
		System.out.println("Numeros: " + x + ", " + y);
		System.out.println("El número mayor es: " + z);
		System.out.println("El número menor es: " + zMin);
		
		System.out.println("\nHipotenusa de un Triángulo Rectángulo\n");
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side a: ");
		a = scanner.nextDouble();
		System.out.println("Enter side b: ");
		b = scanner.nextDouble();
		c = Math.sqrt((a * a) + (b * b));
		System.out.println("La Hipotenusa es: " + c);
		scanner.close();
	}

}
