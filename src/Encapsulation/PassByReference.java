package Encapsulation;

public class PassByReference {
	private static void swap(Student s1,Student s2) { 
		Student temp = s1;
		s1=s2;
		s2=temp;
		}
	private static void updateName(Student s) {
		s.setName("Keertan1");
		
	}
public static void main(String[] args) {
	Student stu1 = new Student();
	stu1.setAge(20);
	stu1.setName("keertan");
	
	Student stu2 = new Student();
	stu2.setAge(30);
	stu2.setName("Lucky");
	System.out.println(stu1.getName());
	System.out.println(stu2.getName());
	
	swap(stu1, stu2);
	System.out.println(stu1.getName());
	System.out.println(stu2.getName());
	System.out.println("**********");
	updateName(stu1);
	System.out.println(stu1.getName());
	System.out.println(stu2.getName());
	
}
}
