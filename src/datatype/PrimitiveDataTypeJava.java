package datatype;

public class PrimitiveDataTypeJava {
//byte wrapper class byte
	//byte wrapper class Byte 
	//short wrapper class Short 
	//int wrapper class Integer 
	//long wrapper class Long
	//float wrapper Float  
	//double wrapper class Double 
	//char wrapper class Char 
	//boolean wrapper class Boolean 

public int a= 10;  //it can be accessed from anywhere(with the same class,same package
                   //from different package
int b = 20;        //it can be accessed(within the same class,within the  same package
                   //from different package but with child reference only
private int c = 30;//it can be accessed from(within the same class,with in the package only
protected int d =40;//it can be accessed within the same class only

//here int is a data type a is a variable name,= is an assigement operator
//which  is used to assign the value to the variable from right to left
//10 is a value ! state ! literal
//; statement termination ! statement completion in java

public static void main(String[] args) {
	PrimitiveDataTypeJava dt = new PrimitiveDataTypeJava();
	System.out.println(dt.a);
	System.out.println(dt.b);
	System.out.println(dt.c);
	System.out.println(dt.d);
	
}
}
