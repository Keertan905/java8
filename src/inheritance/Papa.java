package inheritance;

public class Papa {
	int e;
	int f = m3();
	{
		System.out.println("instance block papa" + e);
	}
	static int g;
	static int h = m4();
	static {
		System.out.println("static block papa" + g);
	}

	public int m3() {
		System.out.println("m3 " +f);
		return 10;
	}

	public static int m4() {
		System.out.println("m4 " + h);
		return 20;
	}

	public Papa() {
		super();
		System.out.println("Papa construtor");
	}

}
