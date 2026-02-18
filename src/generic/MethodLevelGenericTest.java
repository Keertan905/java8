package generic;

import java.util.ArrayList;

public class MethodLevelGenericTest {
public static void main(String[] args) {
	MethodLevelGeneric mg = new MethodLevelGeneric();
	ArrayList<String> list = new ArrayList<>();
	mg.m1(list);
	ArrayList<Integer> list2 = new ArrayList<>();
	mg.m1(list2);
}
}
