package generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericConceptCheck<T> {
	public void m1(List<String> list) {

	};

//	public void m1(List<Integer> list) {
//
//	};
	// T t = new T(); invalid
	// T[] t = new T[2](); invalid
	T t;
	// static T t1; invalid
	// <E> E e; invalid
	// List<int> list; invalid
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); // valid from 1.7 onwards
		ArrayList<String> list2 = new ArrayList<String>(); // valid from 1.5 onwards
		ArrayList<?> list3 = new ArrayList<>();
		ArrayList<?> list4 = new ArrayList<Integer>();
		ArrayList<?> list5 = new ArrayList<Object>();
		ArrayList<? extends Number> list6 = new ArrayList<Integer>();
		// ArrayList<? extends Number> list7 = new ArrayList<String>(); invalid because
		// allowed type are Number and child classes,
		// Byte,Short,Integer,Long,Float,Double
		ArrayList list7 = new ArrayList();
		list = list7;
		list2 = list7;
		list3 = list7;
		list7 = list;
		list7 = list2;
		list7 = list3;
		List<String> list8 = new ArrayList<>();
		List list9 = new ArrayList();
		list8 = list9;
		list9 = list8;

	}
}
