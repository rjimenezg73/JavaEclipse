import java.util.*;

public class Patterns {

	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		char sim = '^';
		
		// outer loop
		for(int i = 1; i <= n; i++) {
			// inner loop
			for(int j = 1; j <= 5; j++) {
				System.out.print(sim);
			}
			System.out.println();
		}
	}

}
