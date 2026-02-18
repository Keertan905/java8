package generic;

import java.util.ArrayList;

public class MethodLevelGeneric {
	public <T> void add(T t) {
	}

	// ArrayList type could be anything
	// Ex-ArrayList<?>
	public void m1(ArrayList<?> list) {
	}
	public <T> void m4(ArrayList<T> list) {
	}
	public void m5(ArrayList<? extends Number> list) {
	}

	public <T> void m2(ArrayList<? extends T> list) {

	}

	public <T> void m3(ArrayList<? super T> list) {

	}
}
