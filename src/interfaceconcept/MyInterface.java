package interfaceconcept;
/**
 * default behaviour of compiler w.r.t interface
 */
public interface MyInterface {
int a=10;
void m1();
default void m2() {
	System.out.println("m2()");
}
static void m3() {
	System.out.println("m3()");
}
default void m4() {
	System.out.println("m4()");
}



}
