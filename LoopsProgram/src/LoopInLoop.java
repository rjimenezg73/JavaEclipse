import java.util.Scanner;

public class LoopInLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rows;
		int cols;
		String symbol = "";
		
		System.out.println("Enter a number of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter a number of columns: ");
		cols = scanner.nextInt();
		System.out.println("Enter a symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=cols; j++) {
				System.out.print(symbol);
			}
		}
	}

}
