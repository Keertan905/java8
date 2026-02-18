package inheritance;

public class ClassA implements  InterfaceX , InterfaceY{

	@Override
	public void m1() {
		
		
	}

	@Override
	public void m2(int a) {
	
		
	}

	@Override
	public void m2() {
		
		
	}

	@Override
	public void m3() {  //violation due to method overloading
		
	}

}
