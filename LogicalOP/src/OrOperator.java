import java.util.Scanner;

public class OrOperator {

	public static void main(String[] args) {
		// Los opersdores lógicos se usan para conectar dos o más expresiones
		//		&& = (AND) Para que se cumpla ambas condiciones deben ser verdaderas
		//		|| = (OR) Por lo menos una de las condiciones debe de ser verdadera
		//		! = (NOT) Invierte el valor boleano de la condición
		
		System.out.println("Operadores Lógicos - OR (||)\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit: ");
		String response = scanner.next();
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game, see you soon!");
		}
		else {
			System.out.println("You are still playing the game!");
		}
	}

}
