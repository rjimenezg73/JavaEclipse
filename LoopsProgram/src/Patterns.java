import java.util.*;

public class Patterns {

	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		char sim = '^';
		
		//Complete Rectangle
		System.out.println("Complete Rectangle");
		// outer loop
		for(int i = 1; i <= n; i++) {
			// inner loop
			for(int j = 1; j <= m; j++) {
				System.out.print(sim);
			}
			System.out.println();
		}
		
		// Hollow Rectangle
		System.out.println("\nHollow Rectangle");
		// outer loop
		for(int i = 1; i <= n; i++) {
			// inner loop
			for(int j = 1; j <= m; j++) {
				if(i == 1 || i == n || j == 1 || j == m) {
					System.out.print(sim);
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
