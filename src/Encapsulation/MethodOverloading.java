package Encapsulation;

/**
 * what is a method overloading? 1.method name must be same 2.arguments list
 * must be different 3.no restrictions on return types(means return type might
 * be same or different) argument list different means- different on the basis
 * of counting different on the basis of order different on the basis of type
 * 
 * purpose(why or benefits) of method overloading- Easy to use Easy to maintain
 * Flexibility(more flexible)
 * 
 * how (implementation)- calling order of overloaded methods 1:- exact match 2:-
 * if exact match is not their ,then immediate next higher
 * primitive-type(byte->short->int->long->float->double)
 * (char->int->long->float->double) 3:-if point 2 also get failed,then exact
 * wrapper type 4:-if point 3 also get failed,then Object argument 5:-if point 4
 * also get failed,then var argument 6:-if point also get failed,then
 * compilation error
 */
public class MethodOverloading {
	void m1() {
		System.out.println("zero arguments");
	}

	/*
	 * void m1(int a) { System.out.println("one arguments int"); }
	 */

	void m1(int a, int b) {
		System.out.println("two arguments int,int");
	}

	void m1(long a, long b) {
		System.out.println("two arguments long,long");
	}

	void m1(int a, long b) {
		System.out.println("two arguments int,long");
	}

	void m1(long a, int b) {
		System.out.println("two arguments long,int");
	}

	/*
	 * void m1(long b) { System.out.println("one arguments long"); }
	 */

	/*
	 * void m1(float a) { System.out.println("one arguments float"); }
	 */

	/*
	 * void m1(double a) { System.out.println("one arguments double"); }
	 */

	/*
	 * void m1(Integer a) { System.out.println("one arguments Integer"); }
	 */

	void m1(Long a) {
		System.out.println("one arguments Long");
	}

	public static void m1(Object a) {
		System.out.println("Object");
	}

	void m1(int... a) {
		System.out.println("variable arguments");
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.m1(10);

	}
}
