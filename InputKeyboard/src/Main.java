import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa para Introducir Datos desdel el teclado\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your favorite food? ");
		String food = scanner.nextLine();
		
		System.out.println("\nHola " + name + ", bienvenido al mundo de Java");
		System.out.println("You are " + age + " years old");
		System.out.println("You like " + food);
	}

}
