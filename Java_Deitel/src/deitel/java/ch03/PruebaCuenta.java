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
		
		Cuenta cuenta1 = new Cuenta("Peter Pica Cu", 50.00);
		Cuenta cuenta2 = new Cuenta("Roberto Jimenez", -7.53);
		
		// Muestra el saldo inicial de cada cuenta
		System.out.printf("El nombre de cuenta1 es: %s%n", cuenta1.obtenerNombre());
		System.out.printf("Saldo de: $%.2f%n", cuenta1.obtenerSaldo());
		System.out.printf("El nombre de cuenta2 es: %s%n", cuenta2.obtenerNombre());
		System.out.printf("Saldo de: $%.2f%n", cuenta2.obtenerSaldo());
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escriba el monto a depositar para cuenta1: $");
		double montoDeposito = entrada.nextDouble();
		System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoDeposito);
		cuenta1.depositar(montoDeposito);
		System.out.printf("Saldo de %s: $%.2f%n%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		
		System.out.print("Escriba el monto a depositar para cuenta2: $");
		montoDeposito = entrada.nextDouble();
		System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
		cuenta2.depositar(montoDeposito);
		System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
		

		
	}

}
