import java.util.Random;

public class RandomProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Función Random");
		
		Random randomVar = new Random();
		int x = randomVar.nextInt();
		System.out.println(x);
	}

}
