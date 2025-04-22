package javabasics;

//Instance member get memory when you create an object
//access/call instance member with the help of object reference
//purpose of instance variable(when we should use instance variable)
//ANSWER--if value changes object to object
//purpose of instance block
//to initialize a instance variable other than constructor
//purpose of constructor
//to initialize the variable
//to create an object(to help in object creation)


public class InstanceMemberExample {
		 int a=m1();
		 int b=20;
		{
			System.out.println(a);
			System.out.println(b);
		}
		 int m1() {
			System.out.println(a);
			return 40;
		}
		 public InstanceMemberExample() {
			 System.out.println("Constructor");
		 }
		 public static void main(String[] args) {
			 
			InstanceMemberExample instanceMemberExample = new InstanceMemberExample();
			
		}
		 
}
