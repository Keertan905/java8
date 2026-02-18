package inheritance;
//This and Super keywords belongs to object only.Hence you can access from instance(block,method,constructor) context  only
//purpose of super and this keyword?
//
public class ThisAndSuperConcept {
int age = 20;
public void m1(int age) {
	System.out.println(this.age);
}
public static void main(String[] args) {
	ThisAndSuperConcept see = new ThisAndSuperConcept();
	see.m1(50);
	
}
}
