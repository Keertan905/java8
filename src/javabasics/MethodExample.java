package javabasics;

//method syntax other than [] all are mandatory
//<[modifiers] method return type> <method name>([arguments type]){}
public class MethodExample {
//type 1 method return type void and without argument
//type 2 method type return other than void and without arguments
//type 3 method return type void and with arguments
	void m1(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	void m2(int i,String B,int j,boolean T) {
		System.out.println(i);
		System.out.println(B);
		System.out.println(j);
		System.out.println(T);
	}
	void m3(int W) {
		System.out.println(W);
	}
	
//type 4 method return type other than void with arguments
	boolean m4(int r,boolean T) {
		System.out.println(r);
		System.out.println(T);
		return T;
	}
	int add (int a,int b,int c,int d) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		return a+b+c+d;
	}
	int subtraction (int a,int b) {
		System.out.println(a);
		System.out.println(b);
		return a-b;
	}
	int Division (int a,int b) {
		System.out.println(a);
		System.out.println(b);
		return a/b;
	}
	int Multiplication (int a,int b) {
		System.out.println(a);
		System.out.println(b);
		return a*b;
	}
	public static void main(String[] args) {
		MethodExample method = new MethodExample();
		method.m1(5, 5);
		method.m2(55, "tom", 30, true);
		method.m3(125);
		method.m4(45, true);
		
		int result = method.add(5, 15, 25, 35);
		System.out.println(result);
		
		int result1 =  method.subtraction(2500, 1500);
		System.out.println(result1);
		
		int result3 =  method.Division(62500, 50);
		System.out.println(result3);
		
		int result4 = method.Multiplication(250 ,250);
		System.out.println(result4);
		
	}
}
