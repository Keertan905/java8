package javabasics; //LOADING ORDER

//Q).What is the difference and similarity between method and constructor

public class TypesOfMembersOfClass {
//Variables types(static or non-static/instance variable) 
	
//STATIC VARIABLESstatic 
	static int a1=m2();
	static {
		System.out.println("static block");
	}    
static int b;
{
	System.out.println("instance block2");
}
//NON-STATIC VARIABLES
int c=m3();          
int d;

//Types of Method(static or non-static/instance method)
static void m1() {
	System.out.println("m1()");
}
static int m2() {
	System.out.println("m2()");
	return 10;
}
int m3() {
	System.out.println("m3()");
	return 20;
	
}
void m4() {
	System.out.println("m4");
}

//Constructor
void TypesOfMembersOfClass() {
	System.out.println("TypesOfMembersOfClass");
}

//Types of block(static or non-static/instance block)
static {
	System.out.println("statiic block");
}
{
	System.out.println("instance block");
}
public static void main(String[] args) {
	TypesOfMembersOfClass typesOfMembersOfClass  = new TypesOfMembersOfClass();
	
}
}
