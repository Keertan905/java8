package controlflow;

public class Patten4 {
public static void main(String[] args) {
	int rc=4;
	int bc= 0;
	int sc =7;
	for(int i=0;i<rc;i++) {
		// print blank count
		for(int j=0;j<bc;j++) {
		System.out.print(" ");
		}
		//print star count
		for(int k=0;k<sc;k++){
			System.out.print("*");
		}
		bc++;
		sc=sc-2;
		System.out.println();
	}
	
	
}
}
