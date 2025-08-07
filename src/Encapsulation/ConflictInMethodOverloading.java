package Encapsulation;

public class ConflictInMethodOverloading {

	/*
	 * public static void m1(String a) { System.out.println("String a"); }
	 */

	public static void m1(Object a) {
		System.out.println("Object a");
	}

	public static void m1(int[] a) {
		System.out.println("int[]a");
	}

	public static void m1(String[] a) {
		System.out.println("String[]a");
	}

	public static void main(String[] args) {
		// m1(null); //null is a laddu,(if papa and a child in a home then laddu goes to
		// a child)
		// if papa and two children then conflict will happen in case of laddu(null)
		///but same rule is not applicable on other than laddu like m1("keertan");
		//if keertan(String) is not available then it goes to papa(Object) not to sweta(String[]a,String...a)
		//String[]a==String...a
		//sir bhule nahi tha bas yadd nahi tha == ignorant == ghamandi == maya == illusion ==lust==greed==attraction==fool==
		//no awareness== pauiya piye ho ==not understanding but pretend like knowing
		m1("keertan");

	}
}
