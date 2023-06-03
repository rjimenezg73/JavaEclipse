package deitel.java.ch02;

import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		// Crea el objeto Scnner para obtener la etrada de la ventana de comandos
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int suma;
		System.out.println("Escriba el primer entero: ");
		numero1 = entrada.nextInt();
		System.out.println("Escriba el segundo entero: ");
		numero2 = entrada.nextInt();
		
		suma = numero1 + numero2;
		System.out.printf("La suma es %d%n", suma);
	}
}
