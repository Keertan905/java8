package javabasics;

//static members will get memory at class loading time
//static members are related to class not an object
//we can  access call static members(variables and methods) with class name
//example Dog.name,Dog.eat();
//static variables get memory only once in their life hence memory utilization is better than instance members
//purpose of static variables(when we choose static variable)if object to object data is not changing
//purpose of static method (for utility)
//purpose of static block
//to initialize static variable
//to load something at class loading time

public class StaticMembersExamples {
	static int a=m1();
	static int b=20;
	static {
		System.out.println(a);
		System.out.println(b);
	}
	static int m1() {
		System.out.println(a);
		return 40;
	}
public static void main(String[] args) {
	System.out.println("************");
	System.out.println(StaticMembersExamples.a);
	System.out.println(StaticMembersExamples.b);
	System.out.println(StaticMembersExamples.m1());
	System.out.println("another way of calling with a same class only");
	System.out.println(a);
	System.out.println(b);
	System.out.println(m1());
}

}
