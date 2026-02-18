package interfaceconcept;

public class Inter2 implements MyInterface{
	{
	System.out.println("Inter following the instruction");
		
	}
//	default void m4() 
	public void m4(){
		
	System.out.println("Inter2 m4()");	
	}
public static void main(String[] args) {
	
//	can we create an object of an interface? ans-NO
//MyInterface my =new MyInterface();
//	Inter2(object) implements MyInterface(subject means instruction(set of rules))
//	Object,Subject ke kaisa relation hoga - instruction and follower ka relation hai jise technical term me implementation bolte hai
	
	MyInterface my= new Inter2();
//	Child(object) extends Parent(object) (inheritance) aka IS-A relation
//	Parent p= new Child();
	
	my.m4();
	my.m2();
	Inter2 inter = (Inter2) my;
//	inter.m5();
}

}
