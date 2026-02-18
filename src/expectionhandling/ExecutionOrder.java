package expectionhandling;

public class ExecutionOrder {
	public static void main(String[] args) {
		int x = 10;
		try {
			x++;
			//System.out.println(x / 0);
			x++;
			System.out.println(x);

		} catch (Exception e) {
			x++;
			System.out.println(++x);
		}finally {
			x++;
			System.out.println(x);
		}
	}
}
