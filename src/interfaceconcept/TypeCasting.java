package interfaceconcept;

public class TypeCasting {
	public static void main(String[] args) {
		ClassA a = new ClassB();
		ClassC c = (ClassC) a;
		
		// Compile time checking
		// 1.there must be a relation between classC and reference a(ClassA)
		// ANS-- yes,there is a relation ClassA(parent) and ClassC(child)
		// ClassC-> ClassC must be same and should be derived
		
		ClassB b = (ClassC) a;
		b.methodB();
		
		//Run-time checking
		//Reference a(ClassA) here reference a containing classB Object
		//ClassB ->same
		//ClassB -> Child of ClassC -child nahi ha
		
		// 1.satisfied
		// 2.ClassC -> ClassC -NO same
		// ClassC -> derived type of ClassB -Yes

		// ClassD d =(ClassB)a;
		// 1.satisfied
		// 2.ClassB -> ClassB -NO same
		// ClassB -> derived type(child) of ClassD -NO same.

		// ClassF f = (ClassB)a;
		// 1.satisfied
		// 2.ClassB -> ClassB -NO same
		// ClassB -> Child of ClassF -NOF

		ClassA a1 = (ClassB) a;
		// 1.satisfied
		// 2.ClassB -> ClassB -NO same
		// ClassB -> derived type of ClassA -Yes

	}
}
