package controlflow;

public class ContinueExample {
public static void main(String[] args) {
	//continue , you can use within a loop only
	//purpose , if you want to skip current execution /iteration and execute next step
	for (int i=0;i<5;i++) {
		if (i==3) {
			continue;
		}
		System.out.println("Keertan");
	}
}
}
