package controlflow;

public class Pattern3 {
public static void main(String[] args) {
	int rc=4;
	int bc=3;
	int sc=1;
	for (int i=0;i<rc;i++) {
		//to print blank count
		for (int j=0;j<bc; j++) {
			System.out.print(" ");
		}
		//to print numbers of stars count
		for(int k=0; k<sc;k++) {
			System.out.print("* ");
		}
		bc--;
		sc++;
		System.out.println();
}
	int rc1=4;
	int sc1=3;
	int bc1=2;
	for(int i=0;i<rc1;i++) {
		for(int j=0;j<bc1;j++) {
			System.out.print(" ");
		}
		// print star count 
		for(int k=0;k<sc1;k++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}
