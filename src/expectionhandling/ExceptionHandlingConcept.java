package expectionhandling;

//What is an Exception?
//it  is an event that disturb normal flow of the program.
//the program will terminate then and there where exception have been raised.it will not execute next line.
//How to handle the exception handling?
//use "try" and "catch" block
//
public class ExceptionHandlingConcept {
	public static int divide(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("denominator must not be zero");
		}

		System.out.println("keertan");
		return a + b;

	}

	public static void display(Student stu) {
		try {
			System.out.println(stu.getName());
			System.out.println(stu.getAge());
		} catch (Exception e) {
			System.out.println("student stu " + stu);
		}

	}

	public static void display2(Student stu) {
		if (stu != null) {
			System.out.println(stu.getName());
			System.out.println(stu.getAge());

		}

	}

	public static void main(String[] args) {
		divide(10, 0);
		Student stu = null;

		display2(stu);

		System.out.println("sam");
		Student stu1 = new Student();
		Student data = stu1.fetchData(4);
		System.out.println(data.getName());
		try {
			stu1.getAdmitCard();
		} catch (AdmitClassNotFoundException e) { 
		
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			 e.printStackTrace();

		}
	}

}
