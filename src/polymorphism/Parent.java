package polymorphism;
//same object having multiple behaviors
public class Parent {
	public void m1() {
		System.out.println("Parent");
	}

	protected long m2(int a, int b) {
		System.out.println("parent m2()");
		return a + b;
	}

	protected synchronized Object m3(int a) {
		System.out.println("parent m3()");
		return a;
	}
	public double m4(int a,int b) {
		System.out.println("parent m4()");
		return 10;
	}
	public Parent m5() {
		System.out.println("parent m5()");
		return null;
	}
}
