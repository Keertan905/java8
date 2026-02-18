package generic;

import java.util.ArrayList;

public class MyArrayListTest {
public static void main(String[] args) {
	MyArrayList<String> list = new MyArrayList<>();
	MyArrayList<Long> phonelist = new MyArrayList<>();
	MyArrayList<Double> list2 = new MyArrayList<>();
	MyArrayList<Dog> doglist = new MyArrayList<>();
	
	
	ArrayList<String> input = new ArrayList<>();
	input.add("KEERTAN");
	input.add("Sam");
	list.add(input);
	
	ArrayList<Long> input2 = new ArrayList<>();
	input2.add(123L);
	phonelist.add(null);
	
	ArrayList<Dog> dogs = new ArrayList<>();
	dogs.add(new Dog("Sheru",10));
	doglist.add(dogs);
	
}
}
