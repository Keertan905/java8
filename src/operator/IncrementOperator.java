package operator;
//Pre increment means it first increases the value then assign/print it
//Post increment means it first print/assign the value then it increase it
public class IncrementOperator {
public static void main(String[] args) {
	//Pre and Post increment
	//int a=10;
	//a++;
	//++a;
	//System.out.println(a);
	int b = 10;
	//System.out.println(b++);
	int c= 10;
	c=c++ +c+c-- -c-- + c++;
	//c=c++ +c+c-- -c-- + ++c; 
	System.out.println(c);
	int d=10;
	System.out.println(d=++d +d++ +d- --d +d--);
	//expression evaluation left to right
	//value assigement right to left
	//int e =10++; 
	//Ex:-- 10 = money it should be in vault to increase 
	//not the money to increase directly Rs10 becoming 11
	//increment decrement operator applicable for variable only not for constant
	final int f=10; 
	//compile time constant
	//f++;  //it will not work
	System.out.println(f);
	
}
}
