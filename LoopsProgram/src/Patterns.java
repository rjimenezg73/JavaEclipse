import java.util.*;

public class Patterns {

	public static void main(String[] args) {
		int n = 4;
		int m = 7;
		char sim = '@';
		
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
		
		// Half Rectangle
		System.out.println("\nHalf Rectangle");
		// outer loop
		for(int i = 1; i <= m; i++) {
			// inner loop 
			for(int j = 1; j <= i; j++) {
				System.out.print(sim);
			}
			System.out.println();
		}
	
		// Inverted Half Rectangle
		System.out.println("\nInverted Half Rectangle");
		// outer loop
		for(int i = m; i >= 1; i--) {
			// inner loop
			for(int j = 1; j <= i; j++) {
				System.out.print(sim);
			}
			System.out.println();
		}
		
		// Rotate Inverse Half Rectangle
		System.out.println("\nRotate Inverse Half Rectangle");
		// outer loop
		for(int i = 1; i <= m; i++) {
			// inner loop - space print
			for(int j = 1; j <= m-i; j++) {
				System.out.print(" ");
			}
			// inner loop - Symbol print
			for(int j = 1; j <= i; j++) {
				System.out.print(sim);
			}
			System.out.println();
		}
		
		// Half Rectangle with numbers
		System.out.println("\nHalf Rectangle with numbers");
		// outer loop
		for(int i = 1; i <= m; i++) {
			// inner loop
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		// Inverted Half Rectangle with numbers
		System.out.println("\nInverted Half Rectangle with numbers");
		// outer loop
		for(int i = 1; i <= m; i++) {
			// inner loop
			for(int j = 1; j <= m-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		// Floy's Triangle
		System.out.println("\nFloy's Triangle");
		int number = 1;
		// outer loop
		for(int i = 1; i <= n; i++) {
			// inner loop
			for(int j =1; j <= i; j++) {
				System.out.print(number + "\t");
				number++;
			}
			System.out.println();
		}
	}
}
