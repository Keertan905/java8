package controlflow;
//a=10,b=20 after swapping a=20,b=10?
public class Swapping {
public static void main(String[] args) {
	int a = 10;
    int b = 20;
    
    System.out.println("Before swapping:");
    System.out.println("a = " + a + ", b = " + b);
    
    int temp = a;
    a = b;
    b = temp;
    
    System.out.println("After swapping:");
    System.out.println("a = " + a + ", b = " + b);
}
}
