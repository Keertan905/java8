package expectionhandling;

//default propagation with respect to runtime and checked exception
/**
 * step1: if an exception is raised inside any method then an exception object
 * will be created by JVM with the following information (name of the
 * exception,description of the exception and location of the exception 
 * step 2:
 * JVM checks whether the method(current method) contains any exception handling
 * code or not. if the method will not contain any exception handling code can
 * JVM terminates the program abnormally and remove the corresponding entry from
 * the stack. 
 * step 3: JVM will check whether the caller method contains
 * exception handling code or not. if the method will not contain any exception
 * handling code can JVM terminates the program abnormally and remove the
 * corresponding entry from the stack.
 * step 4: JVM will check the same again and
 * if found main method also does not contain any exception handling code then
 * JVM terminates the main method and remove the corresponding entry from the
 * stack.
 * step 5: default exception handler print exception information to the
 * console in the following format and terminate the program abnormally name of
 * the exception:description location of the exception(stack trace)
 * 
 */
public class ExceptionPropogation {
	public static void m1() {
		System.out.println("m1.method");
		m2();
		System.out.println("m1 end");
	}

	public static void m2() {
		System.out.println(10 / 0);
		System.out.println("m2.method");
	}

	public static void main(String[] args) {
		m1();

	}
}
