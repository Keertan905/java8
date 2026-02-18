package Encapsulation;

import java.util.ArrayList;

public class PassByReferenceV2 {
	public static void update1(ArrayList<Integer> list) {
		list.add(10);
	}

	public static void update2(ArrayList<Integer> list) {
		list.add(20);
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(60);
		
		update1(list);
		update2(list);
		System.out.println(list);
		
	}
}
