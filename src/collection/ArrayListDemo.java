package collection;

import java.util.ArrayList;

import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add(10);
	list.add("Amit");
	list.add(30);
	list.add('A');
	list.add(50);
	list.add(40);
	list.add(55.50);
	list.add(60);
	list.add(70);
	list.add("Tulsi");
	
	/*for(Object obj : list) {
	*	String name = (String) obj;
	*	System.out.println(name);
	*}
    */
 
	//generic identification <>
	
	List<Interger> List2 = new ArrayList<Integer>();
	List<Interger> list3 = new ArrayList<>();
	list3.add(10);
	list3.add(40);
	list3.add(40);
	list3.add(40);
	list3.add(40);
	list3.add(40);
	for(Integer value : list3) {
		int result = value;
		System.out.println(result);
	}
	List<String> list4 = new ArrayList<String>();
	list4.add("Amit");
	
}
}
