package operator;

public class ArithmeticOperator {
public static void main(String[] args) {
	//System.out.println(10/0);
	System.out.println(10.0/0);
	System.out.println(-10.0/0);
	System.out.println(10.0/0.0);
	System.out.println(-10.0/0.0);
	System.out.println(10/0.0);
	
	//max(int,type of a,type of b)
	//max(int,byte,byte)here max is int
	//max(int,byte,short)here max is int
	///max(int,int,long)there max is  long
	//
	byte a = 10;
	byte b = 20;
	int c=a+b;
	short d=30;
	int e =a+d;
	int f =40;
	int g =a+f;
	long h = 50;
	long i=f+h;
	float j=60;
	float k=h+j;
	double l=70;
	double  m=k+l;
	System.out.println(0/0.0);
	System.out.println(0.0/0);
	System.out.println(0.0/0.0);
	System.out.println(-0.0/0.0);
}
}
