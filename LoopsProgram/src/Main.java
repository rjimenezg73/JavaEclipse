
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Loops in Java - For, while and do-while");
		int indice = 10;
		int n = 1;
		
		System.out.println("\n- For -");
		for(int i=0; i<indice; i++) {
			System.out.println(n);
			n++;
		}
		
		System.out.println("\n- While -");
		n=1;
		while(n <= indice) {
			System.out.println(n);
			n++;
		}
		
		System.out.println("\n- do-while -");
		n=1;
		do {
			System.out.println(n);
			n++;
		}while(n <= indice);

	}

}
