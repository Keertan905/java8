package controlflow;

public class LoopExample {
public static void main(String[] args) {
	System.out.println("Keertan");
	System.out.println("Keertan");
	System.out.println("Keertan");
	//-------
	//In above code 1.there  is duplication of code 2.maintainence problem
	//3.more chance of mistake
	//To resolve the above problem above we use loop
	//using for loop
	System.out.println("********");
	for(int i=1;i<=10;i++) {
	System.out.println("Keertan");
}
	System.out.println("********");
	for(int i=0;i<=5;i++);  //valid but not usefull
	System.out.println("Keertan");
}
}
