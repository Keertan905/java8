package lambdaExpression;

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		// public int add(int a , int b)
		// (int a, int b)->(retyrn a+b}

//		B c = new Child();
//		int sum = c.add(10, 20);
//		System.out.println(sum);

//		// using lambda expression
    	B b1 = (a, b) -> a + b;
//		B b2 = (int a, int b) -> a + b;
//		System.out.println(b1.add(10, 20)); //type inference

		// public void m1(String name);
		C d = (name) -> System.out.println(name);
		d.m1("Keertan");
	}
}
