package deitel.java.ch03;
import java.util.Scanner;

public class PruebaCuenta 
{
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		Cuenta miCuenta = new Cuenta();
		
		// Muestra el valor inicial del nombre (null)
		System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());
		
		// Pide y lee el nombre
		System.out.println("Introduzca el nombre: ");
		String elNombre = entrada.nextLine();
		miCuenta.establecerNombre(elNombre);
		System.out.println();
		
		// Muestra el nombre almacenado en el objeto Cuenta
		System.out.printf("El nombre en el objeto miCuenta es: %n%s%n",miCuenta.obtenerNombre());
	}

}
