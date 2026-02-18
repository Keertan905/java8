package expectionhandling;

public class ExectionOrder2 {
	public static int getValue() {
		int x = 10;
		try {
			x++;
			// System.out.println(x / 0);
			x++;
			System.out.println(x);
			//return x;

		} catch (Exception e) {
			x++;
			System.out.println(++x);
		} finally {
			x++;
			System.out.println(x++);
		}
		x++;
		return x;
	}

	public static void main(String[] args) {
		System.out.println(getValue());
	}
}
