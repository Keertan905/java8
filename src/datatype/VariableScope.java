package datatype;

public class VariableScope {
int a=10;
{
	int b=20;
	System.out.println();// scope is b/w 5 to 8 line in int b 
}
public void m1() {
	int c=30;
	System.out.println(a);
	{
		System.out.println(c);
	}
}
}