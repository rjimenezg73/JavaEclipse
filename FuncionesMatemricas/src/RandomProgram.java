import java.util.Random;

public class RandomProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Función Random");
		
		Random randomVar = new Random();
		
		int x = randomVar.nextInt();
		System.out.println(x);
		
		// int x = randomVar.nextInt(10); esto nos arroja un numero entre 
		// cero y nueve. Si deseamos un número entre 1 y 10 simplemente sumamos
		// 1 a la expresión
		x = randomVar.nextInt(10) + 1;
		System.out.println(x);
		System.out.println("\nTembién se puede usar la función Ramdom con valores Bolleanos");
		boolean z = randomVar.nextBoolean();
		System.out.println(z);
	}

}
