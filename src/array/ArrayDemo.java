package array;

public class ArrayDemo {
public static void main(String[] args) {
	
	// create an array object
	int[] array = new int[10];
	
	//read array  or call array
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	System.out.println(array[3]);
	System.out.println(array[4]);
	System.out.println(array[6]);
	System.out.println(array[7]);
	System.out.println(array[8]);
	System.out.println(array[9]);
	
	// System.out.println(array[10]); array index out of bound exception(AIE)
	//update the array value
	
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	array[4]=50;
	array[5]=60;
	array[6]=70;
	array[7]=80;
	array[8]=90;
	array[9]=100;
	
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	System.out.println(array[3]);
	System.out.println(array[4]);
	System.out.println(array[6]);
	System.out.println(array[7]);
	System.out.println(array[8]);
	System.out.println(array[9]);
	System.out.println("********");
	
	for(int i=0;i<10;i++) {
		System.out.println(array[i]);
	}
	
	System.out.println("array size dynamically " + array.length);
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	
	System.out.println("Enhance for loop");
	for(int value:array) {
		System.out.println(value);
	}
	
	System.out.println("******");
	long[] array1 = new long[5];
	for(long data:array1) {
		System.out.println(data);
	}
	
	System.out.println("******");
	double[] array2 = new double[5];
	for(double data2:array2) {
		System.out.println(data2);
	}
	
}
}
