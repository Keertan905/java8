package controlflow;

public class BreakExample {
public static void main(String[] args) {
	
//break statement :you can use inside switch and loop context only
//purpose :  to transfer the control 
	for(int j=0;j<2;j++) {
	for(int k=0;k<2;k++) {
	for ( int i=0;i<10;i++) {
		if(i==1) {
			break;
		}
		System.out.println("Keertan");
	}
	System.out.println("Sam");
}
	System.out.println("Gazala");
}
}
}
