package controlflow;

public class Pattern5 {
public static void main(String[] args) {
	int rc=4;
	int sc=1;
	int bc=6;
	//for row count
	for(int i=0;i<rc;i++) {
		// for star count
		for(int j=0;j<sc;j++) {
			System.out.print("*");
		}
		//for blank count
		for(int k=0;k<bc;k++) {
			System.out.print(" ");
		}
		for(int j=0;j<sc;j++) {
			System.out.print("*");
		}
		
		System.out.println();
		sc++;
		bc=bc-2;
		
	}
}
}
