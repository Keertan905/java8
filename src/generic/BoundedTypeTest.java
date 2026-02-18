package generic;

public class BoundedTypeTest {
public static void main(String[] args) {
	//BoundedTypeTest extends Number
	//here number is a class
	BoundedType<Number> bt1  = new BoundedType<>();
	BoundedType<Byte> bt2  = new BoundedType<>();
	BoundedType<Short> bt3  = new BoundedType<>();
	BoundedType<Integer> bt4  = new BoundedType<>();
	BoundedType<Long> bt5  = new BoundedType<>();
	BoundedType<Float> bt6  = new BoundedType<>();
	}
}
