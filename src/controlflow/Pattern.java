package controlflow;

public class Pattern{
	public static void main(String[] args) {
		int sc=1;
		int rc=4;
		for (int i=0; i<rc; i++) {
			//to print number of star(*) in a  row
			//number of  column
			for (int j =0; j<sc; j++) {
				System.out.print("*");   //to print on the same line
			}
			sc++;
			System.out.println(); //for new line[for next row]
		}
	}
}
