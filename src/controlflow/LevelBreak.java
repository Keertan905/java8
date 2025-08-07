package controlflow;

public class LevelBreak {
public static void main(String[] args) {
	level:
	for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
			if(j==1) {
				break level;
			}
			System.out.println("Gazala");
		}//end of second loop
		System.out.println("Keertan");
	} //end of first loop
	System.out.println("Sam");
}
}
