package polymorphism;

/*OVERRIDING RULES
1.There must be inheritance(parent-child) relationship
3.Method signature[method name,argument list] must be same
4.Return type-- i)primitive(int,long,float) 
               return type must be same
               ii)non-primitive(Student,Dog,Parent,Child)
               co-varient type/parent-child
5.You cannot reduce the scope/visibility but you can increase
6.You cannot override private,final,static(check in parent class method)
7.Exception i)runtime(unchecked)exception
           ii)compile-time(checked)exception       
*/

public class Child extends Parent { // parent child relation
//	@Override
	public void m1() {
		System.out.println("Child");
	}

//	@Override
	protected long m2(int a, int b) {
		return a + b;
	}

//	@Override
	public Integer m3(int a) {
		System.out.println("parent m3()");
		return a;
	}

//	public double m4(int a,int b)
	@Override
	public double m4(int a, int b) {
		System.out.println("child m4()");
		return 50;
	}

//   public Object m5()
	@Override
	public Parent m5() {
		return null;
	}

	public static void main(String[] args) {
//		Child child =new Child();
//     Parent parent=child;  child reference
		Parent parent = new Child();// child object
//		Parent parent = new Parent();
		parent.m1();
	}

}