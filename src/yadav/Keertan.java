package yadav;

import mishra.Sam;
import mishra.sharma.*;  //not recommended,* meaning over hear is you can access all the classes of this package but you can not  
//access its sub-package (khan) classes
//for java.lang package classes or interfaces,import statement is not required because by default it is available for all the classes
//for Current package classes import statement is no required 
//you can not use root folder(like src)in package and import statement 
import mishra.sharma.khan.Kartik;
import static mishra.sharma.Amit.name;
import static mishra.sharma.Amit.rollno;
import static java.lang.System.out;
public class Keertan {
public static void main(String[] args) {
	//Mishra k Rahul ko bulana haa
	//mishra.Rahul rahul = new mishra.Rahul()	;
	//Mishra k bata sharma k bata khan bata rahul ko bulana haa
	Rahul rahul = new Rahul();
	mishra.Rahul rahul2 = new mishra.Rahul();
	
	Sam sam = new Sam();
	Gazala gazala = new Gazala();
	Kartik kartik = new Kartik();
	Amit amit = new Amit();
	Object object =  new Object();
	String str = new String();
	
	System.out.println(amit.age);
	System.out.println(Amit.name);
	System.out.println(Amit.rollno);
	System.out.println(amit.rollno);  //Not recommended
	
	System.out.println(name);
	System.out.println(rollno);
	out.println("Keertan");
}
}
