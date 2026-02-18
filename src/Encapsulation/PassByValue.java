package Encapsulation;

public class PassByValue {
	private int age = 20;

	public void updateAge(int age) {
		age = age;
		System.out.println(age);
	}

	public static void main(String[] args) {
		PassByValue pv = new PassByValue();
		System.out.println(pv.age);
		pv.updateAge(50);
		System.out.println(pv.age);

	}
}
