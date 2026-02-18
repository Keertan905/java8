package inheritance;
//super constructor super()
//super()  should be the first statement inside a constructor otherwise you will get compilation  error
//super() must be called from constructor only
public class Child extends Parent {
int age =30;

	public int getAge(){
//		super();
		
	return age;
}
	public Child() {
		//System.out.println(super);
		super("keertan",50); //super constructor 
		
		System.out.println(age);
		System.out.println(super.age);
		super.age = -40;
		System.out.println(getAge());  // 30 
		System.out.println(this.getAge()); //30
		System.out.println(super.getAge());//50 
	}
public static void main(String[] args) {
	Parent child = new Child();
	//System.out.println(this.age);
	System.out.println(child.getAge());
	Parent parent = new Parent();
	System.out.println(parent.getAge()); //
}

}
