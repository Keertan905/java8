package controlflow;

public class SwitchExample {
public static void main(String[] args) {
	
	//if you have more than two options then use switch-case instead of if-else
	//Duplicate cases are not allowed
	//In case only constant values are allowed
	//and within the range of the variable type
	//ice bss(i=int/Integer , c=char/Character , e=enum , b=byte/Byte , s=short/Short , s=string/String)
	int i =10;
	char j=20;
	//enum in detail we will discuss later 
	byte k =30;
	String s="48";
	//double b =10;
	short c=20;
	
	
	//switch(b) 
	{
	
	}
	
	byte a =30;
	final byte b=30;  //compile time constant
	
	switch(a) {
	case 20:{
		System.out.println("Banana");
		break;
	}
	case b:{
		System.out.println("Apple");
		break;
	}
	case 10:{
		System.out.println("Mango");
		break;
	}
	case 40:{
		System.out.println("Grapes");
		break;
	}
	default:{
		System.out.println("kuch nahi milaga");
	}
	
	}
}
 enum options{
	 A,B
 }
}
