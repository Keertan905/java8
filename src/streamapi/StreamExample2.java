package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample2 {
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

		// filter those students whose branch is IT
		List<Student> data = getData();

		List<Student> collect = data.stream().filter(s -> "IT".equalsIgnoreCase(s.getBranch()))
				.collect(Collectors.toList());
		collect.forEach(s -> System.out.println(s.getName()));
		System.out.println("*****branch IT*******");

		// select all student names
//		List<String> names = data.stream().map(s-> s.getName()).collect(Collectors.toList());
//		names.forEach(n -> System.out.println(n));

//		List<String> names = data.stream().map(Student::getName).toList();
//		names.forEach(System.out::println);
//		System.out.println("*********student names******");
//
//		// select all distinct cities
//
//		List<String> cities = data.stream().map(Student::getCity).distinct().toList();
//		cities.forEach(System.out::println);
//		System.out.println("*********distinct city************");
//
//		// select students who study in SIRT
//
//		List<Student> sirtStudents = data.stream().filter(s -> "Sirt".equalsIgnoreCase(s.getCollege()))
//				.collect(Collectors.toList());
//		sirtStudents.forEach(s -> System.out.println(s.getName()));
//		System.out.println("******study in sirt*****");
//
//		// select students whose branch is ME
//
//		List<Student> meStudents = data.stream().filter(s -> "ME".equalsIgnoreCase(s.getBranch()))
//				.collect(Collectors.toList());
//		meStudents.forEach(s -> System.out.println(s.getName()));

//		public static <T, K> Collector<T, ?, Map<K, List<T>>>
//	    groupingBy(Function<? super T, ? extends K> classifier) {}
		// Function<? super T, ? extends K> classifier
		// R apply(T t);

//		Function<Student, Integer>  branch =  (s)->s.getBranch();
//		public static <T, U, A, R>
//	    Collector<T, ?, R> mapping(Function<? super T, ? extends U> mapper,
//                         Collector<? super U, A, R> downstream) {}
//		Function<Student, String> branch = (s) -> s.getBranch();
//		Long collect2 = data.stream().collect(Collectors.mapping(branch, Collectors.counting()));
//		System.out.println(collect2);
//	    Map<String, List<Student>> collect2 = data.stream().collect(Collectors.groupingBy(branch));
//		System.out.println(collect2);
		
//		 public static <T, K, U>
//		    Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,
//		                                    Function<? super T, ? extends U> valueMapper) {}
//		Function<Student, String> k = (s) -> s.getBranch();
//		Function<Student, String> v = (s) -> s.getBranch();
		Map<String,String> collect3 = data.stream().collect(Collectors.toMap(Student::getBranch, Student::getName,(k,v)->k+ "," + v));
		System.out.println(collect3);
//		public static <T, K, U>
//	    Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,
//	                                    Function<? super T, ? extends U> valueMapper,
//	                                    BinaryOperator<U> mergeFunction) {}
//		R apply(T t, U u);
//		public interface BinaryOperator<T> extends BiFunction<T,T,T> {}
		BinaryOperator<String> bo=(k,v)->k+ " __ " + v;
		
		Map<String,String> collect4 = data.stream().collect(Collectors.toMap(Student::getBranch, Student::getName,bo));
		System.out.println(collect4);
		
		
		
//		collect2.entrySet().forEach((K,V)->System.out.println(k + " " + v.size()));
//		Function<String,String> branchNo = (s)->s.get
		
//		public static <T, K, A, D>
//	    Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier,
//	                                          Collector<? super T, A, D> downstream) {}
		
//		Map<String,String>map2=empList.stream().collect(toMap(Employee::getName,Employee::getD
//				epartement,(n,b)->n+","+b));
		
		Function<Student, String> branch = (s) -> s.getBranch();
		Map<String,Long> collect2 = data.stream().collect(Collectors.groupingBy(branch,Collectors.counting()));
		System.out.println(collect2);
		
	}
}
