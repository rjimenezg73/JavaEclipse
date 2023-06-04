package deitel.java.ch06;
import java.util.Scanner;

public class BuscadorMaximo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe tres valores de punto flotante, separados por espacios: ");
		double numero1 = entrada.nextDouble();
		double numero2 = entrada.nextDouble();
		double numero3 = entrada.nextDouble();
		
		double resultado = maximo(numero1, numero2, numero3);
		System.out.println("El valor máximo es: " + resultado);
		
	}
	
	public static double maximo(double x, double y, double z) {
		double valorMaximo = x;
		
		if(y > valorMaximo)
			valorMaximo = y;
		if(z > valorMaximo)
			valorMaximo = z;
		return valorMaximo;
	}
}
