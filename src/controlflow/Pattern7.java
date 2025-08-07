package controlflow;

public class Pattern7 {
	public static void main(String[] args) {
		int rc = 4;
		int sc = 4; 
		int bc = 0;  
		// For each row
		for (int i = 0; i < rc; i++) {
			// Print stars on the left side
			for (int j = 0; j < sc; j++) {
				System.out.print("*");
				}
			// Print blanks in the middle
			for (int k = 0; k < bc; k++) {
				System.out.print(" ");
				}
			// Print stars on the right side
			for (int j = 0; j < sc; j++) {
				System.out.print("*");
				}
			System.out.println();
			// star count and blank count 
			sc--;
			bc=bc- 2;
			}
	}
}
