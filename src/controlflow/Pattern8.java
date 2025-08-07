package controlflow;

public class Pattern8 {
	public static void main(String[] args) {
		int rc = 4;
		int sc = rc; 
	    int bc = 0;  
	    // for row count
	        for (int i = 0; i < rc; i++) {
	        	for (int j = 0; j < sc; j++) {
	        		System.out.print("*");
	            }
	        	for (int k = 0; k < bc; k++) {
	                System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }
	}

