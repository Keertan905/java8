package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample4 {
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

		// group the student by branch OR group by branch
		// Map <String,List<Student>>
//	public static <T, K> Collector<T, ?, Map<K, List<T>>>
//    groupingBy(Function<? super T, ? extends K> classifier) {}

		Function<Student, String> classifier = s -> s.getBranch();
		Map<String, List<Student>> collect = getData().stream().collect(Collectors.groupingBy(classifier));
		Map<String, List<Student>> collect1 = getData().stream().collect(Collectors.groupingBy(s -> s.getBranch()));
		Map<String, List<Student>> collect2 = getData().stream().collect(Collectors.groupingBy(Student::getBranch));
		collect.forEach((k, v) -> System.out.println(k + " " + v));

		// group by branch and associated student names Map<String,List<String>>
//		public static <T, K, A, D>
//	    Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier,
//	                                          Collector<? super T, A, D> downstream) {}
		
//		 public static <T, U, A, R>
//		    Collector<T, ?, R> mapping(Function<? super T, ? extends U> mapper,
//		                               Collector<? super U, A, R> downstream) {}
		Function<Student, String> mapper =s-> s.getName();
		
		Map<String,List<String>> collect3 = getData().stream().collect(Collectors.groupingBy(Student::getBranch,Collectors.mapping(Student::getName,Collectors.toList())));
		
		
	}
}
