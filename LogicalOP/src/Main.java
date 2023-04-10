
public class Main {

	public static void main(String[] args) {
		// Los opersdores lógicos se usan para conectar dos o más expresiones
		//		&& = (AND) Para que se cumpla ambas condiciones deben ser verdaderas
		//		|| = (OR) Por lo menos una de las condiciones debe de ser verdadera
		//		! = (NOT) Invierte el valor boleano de la condición
		
		System.out.println("Operadores Lógicos - AND (&&)\n");
		
		int temp = 19;
		
		if(temp > 30) {
			System.out.println("El clima es muy caluroso!");
		}
		else if(temp >= 20 && temp <= 30) {
			System.out.println("El clima es templado");
		}
		else {
			System.out.println("El clima es frío!");
		}
	}

}
