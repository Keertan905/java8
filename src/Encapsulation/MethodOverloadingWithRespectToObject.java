package Encapsulation;

public class MethodOverloadingWithRespectToObject {
	/*
	 * public static void m1(String a) { System.out.println("String"); }
	 */
	/*
	 * public static void m1(String... a) {
	 * System.out.println("String var arguments"); }
	 */
	public static void m1(String[]a) {
		System.out.println("String[] a");
	}
	public static void m1(Object a) {
		System.out.println("Object");
	}
	
public static void main(String[] args) {
	m1("keertan");
}
}
