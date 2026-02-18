package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample3 {
	public static List<Student> getData() {
		List<Student> list = new ArrayList<>();
		Student stu1 = new Student(10, "keertan", "CS", "Sirt", "Indore");
		Student stu2 = new Student(20, "kartik", "CS", "rgpv", "Bhopal");
		Student stu3 = new Student(30, "sweta", "IT", "oriental", "Indore");
		Student stu4 = new Student(40, "sham", "ME", "lnct", "Bhopal");
		Student stu5 = new Student(50, "gazala", "IT", "Sirt", "Indore");
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
		return list;
	}

	public static void main(String[] args) {
		// select student id and their detail OR
		// map student id with student detail
		// 10->(10, "keertan", "CS", "Sirt", "Indore") Map<Integer,Student>

//		public static <T, K, U>
//	    Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,
//	                                    Function<? super T, ? extends U> valueMapper) {}
//		  R apply(T t);
		
		Function<Student, Integer> key = (s) -> s.getId();
		Function<Student, Student> value = (s) -> s;

		Map<Integer, Student> collect = getData().stream().collect(Collectors.toMap(key, value));
		Map<Integer, Student> collect1 = getData().stream().collect(Collectors.toMap((s) -> s.getId(), (s) -> s));
		Map<Integer, Student> collect2 = getData().stream()
				.collect(Collectors.toMap(Student::getId, Function.identity()));
		collect.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println("*****///*******");
		
		//map student id  with their name  Map<Integer,String>
		
		Map<Integer,String> collect3 = getData().stream().collect(Collectors.toMap(Student:: getId ,Student::getName ));
		collect3.forEach((k, v) -> System.out.println(k + " " + v));
		

//		 Stream<Student> filter = stream.filter(s->s.getBranch().equals("CS"));
//		 List<Student> list = filter.toList();
//		 list.forEach(s-> System.out.println(s.getName()));
		// stream.filter(s->s.getBranch().equals("IT"));
		// you cannot use stream against once it is closed(consumed)

	}
}
