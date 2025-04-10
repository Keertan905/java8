package javabasics;

public class Student {
	String name = "keertan";
	int age = 20;
	String address="Bhopal";
	String branch ="CSIT";
	char section = 'A';
	int phoneNumber = 123456;
	
	String getcollege() {
		return"Sagar";
	}
	boolean isMarried() {
		return false;
	}
	int getPhoneNumber() {
		return 132456;
	}
	String getBranch() {
		return"CSE";
	}
	char getSection() {
		return 'A';
	}
	int getAge () {
		return 19;
	}
	String getAddress() {
		return "Bhopal";
	}
	void eat() {
		
	}
	void read() {
		return;
	}
	void read1() {
		
	}
	public static void main(String[]args) {
		Student student = new Student();
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.address);
		System.out.println(student.branch);
		System.out.println(student.phoneNumber);
		
		student.read();
		student.eat();
		String collegeName = student.getcollege();
		System.out.println(collegeName);
		boolean married = student.isMarried();
		System.out.println(married);
		int phoneNumber = student.getPhoneNumber();
		System.out.println(phoneNumber);
		String branch = student.getBranch();
		System.out.println(branch);
		char section = student.getSection();
		System.out.println(section);
		int age = student.getAge();
		System.out.println(age);
		String address = student.getAddress();
		System.out.println(address);
		
	}
}
