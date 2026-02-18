package lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class InBuiltFunctionalInterfaceTest {
	public static void main(String[] args) {
		// public interface Consumer
		// void accept(T t);
		Consumer<String> consumer = (t) -> System.out.println(t);
		Consumer<Integer> consumer1 = (t) -> System.out.println(t);
		consumer.accept("papa");

		// public interface Suppliers;
		// T.get();
		Supplier<String> namesupplier = () -> "Keertan";
		Supplier<Integer> numbersupplier = () -> 100;
		System.out.println(namesupplier.get());

		// public interface Predicate;
		// boolean test(T t);
		Predicate<Integer> predicate = (t) -> t % 2 == 0;
		System.out.println(predicate.test(4));

		// public interface function<T,R>
		// R apply(T t);
		Function<String, Integer> function = (t) -> t.length();
		System.out.println(function.apply("keertan"));

		// public interface BiConsumer<T,U>
		// void accept<T t,U u);
		BiConsumer<String, Integer> bic = (t, u) -> System.out.println(t + " " + u);
		bic.accept("sweta", 101);

		// public interface BiPredicate<T,U>
		// boolean test(T t,U u);
		BiPredicate<Integer, Integer> biPredicate = (t, u) -> t + u > 50;
		System.out.println(biPredicate.test(30, -40));

		// public interface BiFunction<T,U,R>
		// R apply(T t,U u);
		BiFunction<String, String, Integer> biFunction = (t, u) -> t.concat(u).length();
		System.out.println(biFunction.apply("sweta", "Bharti"));

	}
}
