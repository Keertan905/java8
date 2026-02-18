package inheritance;
// static things of  papa  
//variables and blocks(first come first serve)
//static things of beta
//variables and blocks(FCFS)
//instance things in will get memory  when object is created
//instance things of papa 
//variables and blocks(FCFS) then constructor
///instance things of beta 
//variables and blocks(FCFS) then constructor
//output : 
public class Beta extends Papa {
	int a;
	int b = m1();
	{
		System.out.println("instance block beta " + a);
	}
	static int c;
	static int d = m2();
	static {
		System.out.println("static block beta" + c);
	}

	public int m1() {
		System.out.println("m1 " + b);
		return 10;
	}

	public static int m2() {
		System.out.println("m2 " + d);
		return 20;
	}

	public Beta() {
		super();
		System.out.println("Beta construtor");
	}
	public static void main(String[] args) {
		System.out.println("main methoded started");
	//	Beta beta = new Beta();
		Papa papa = new Papa(); //loading order
	}
}
