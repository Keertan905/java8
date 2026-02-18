package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTest {
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
		List<Student> data = getData();
		// Iterate all the students
		// default void forEach(Consumer<? super T> action) {} here T is student
		// Consumer<? super T> action T is a class
		// void accept(T t);
//	
//	Consumer<Student> con = (s)->{
//		System.out.println(s.getId() +" " + s.getName() + " " + s.getBranch() + " " + s.getCollege() + " " + s.getCity());
//	};
//	
// data.forEach (con);

//		data.forEach(s -> System.out.println(
//				s.getId() + " " + s.getName() + " " + s.getBranch() + " " + s.getCollege() + " " + s.getCity()));

		// select all those student who belongs to Indore
		// Stream<T> filter(Predicate<? super T> predicate);
		// Predicate<? super T>
		// boolean test(T t);
		Predicate<Student> test = (s) -> "Indore".equalsIgnoreCase(s.getCity());

		Stream<Student> stream = data.stream();
		Stream<Student> filter = stream.filter(test);
		List<Student> collect = filter.collect(Collectors.toList());
		// collect.forEach(s -> System.out.println(
		// s.getId() + " " + s.getName() + " " + s.getBranch() + " " + s.getCollege() +
		// " " + s.getCity()));

		// <R, A> R collect(Collector<? super T, A, R> collector);
		data.stream().filter((s) -> "Indore".equalsIgnoreCase(s.getCity())).collect(Collectors.toList())
				.forEach(s -> System.out.println(s.getId() + " " + s.getName() + " " + s.getBranch() + " "
						+ s.getCollege() + " " + s.getCity()));

	}
}
