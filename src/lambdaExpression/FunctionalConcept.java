package lambdaExpression;

// you can not override Object class in functional interface/interface
@FunctionalInterface
public interface FunctionalConcept {
	public abstract void print();

	default void m1() {
		System.out.println("m1()");
	}

//	default String toString1() {
//		return null;
//	}
//
//	public default boolean equals1(Object obj) {
//		return false;
//	}
//
//	default boolean equals() {
//		return false;
//	}
//
//	private void m3() {
//	}
	
	
	public static void m2() {
		System.out.println("m2()");
	}
}
