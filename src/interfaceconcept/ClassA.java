package interfaceconcept;
/*1)there must be a relation(parent-child,child-parent) in compile time
/          ---
 *        |  |
 * A b = (c) d
 * |      |
 * --------
 * 
/2) c =  c(same on both side as derive type of A
/3) c and d must have a relation 
*/
public class ClassA {
public void methodA() {
	System.out.println("methodA");
}
}
