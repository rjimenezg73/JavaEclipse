package deitel.java.ch03;
import java.util.Scanner;

public class PruebaCuenta 
{
	
	public static void main(String[] args) 
	{
		/*
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
		
		// Quiero visualizar que valores tienen los tipos de datos por referencia si éstos no son 
		// inicializados
		Scanner entrada2 = new Scanner(System.in);
		Cuenta obj = new Cuenta();
		System.out.println("Scanner: " + entrada2);
		System.out.println("Tipo obj: " + obj);
		*/
		
		Cuenta cuenta1 = new Cuenta("Peter Pica Cu");
		Cuenta cuenta2 = new Cuenta("Roberto Jimenez");
		
		System.out.printf("El nombre de cuenta1 es: %s%n", cuenta1.obtenerNombre());
		System.out.printf("El nombre de cuenta2 es: %s%n", cuenta2.obtenerNombre());

	}

}
