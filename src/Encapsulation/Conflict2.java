package Encapsulation;
/**
 * In overloaded methods, arguments list is different on the bases of order then while calling the method
 * there might be an ambiguity.So special attention is required to avoid ambiguity.
 * Solution--
 * provide exact argument type value else you will get compilation error 
 * 
 */

class Conflict2 {
	public static void m1(int a, long b) {
		System.out.println("int ,long");
	}

	public static void m1(long a, int b) {
		System.out.println("long ,int");
	}

	public static void main(String[] args) {
		m1(10L,20);
		//m1(10,20L);
	}
}
