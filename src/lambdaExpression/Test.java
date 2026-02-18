package lambdaExpression;

public class Test {
public static void main(String[] args) {
	FunctionalConcept fc = () ->System.out.println("Hello java");
	//implementation of abstract method + object initalization
	fc.m1();
	fc.print();
	FunctionalConcept.m2();


}
}
