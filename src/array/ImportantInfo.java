package array;

//array:it is an object in java
//if you want to assign 1 array to other array then you must check type and dimension must be same
public class ImportantInfo {
	public static void main(String[] args) {
		int a = 10;
		long b = 20;
		int c = 30;
		c = a;
		b = a;
		int[] array = new int[5];
		long[] array2 = new long[5];
		int[] array3 = new int[3];
		int[] array4 = new int[5];
		int[] array5 = new int[10];
		int[][] array6 = new int[3][2];
		int[][] array7 = { { 10, 20 }, { 30, 40 } };
		// array7=array;
		// array2=array;
		array3 = array;
		array4 = array;
		array5 = array;
		// array6 = array;
		array6[0] = array;
		System.out.println(array5.length); // in array it point to other array directly ,it will not copy the content so
										   // array size doesn't matter
		int[][] array8 = new int[5][];
		array8 = array6;
		array8 = array7;
		Object obj;
		obj = array;
		Object[] obj2;
		// obj2 = array;
		Object[][] obj3;
		// obj3 = array7;
		// obj3 = array6;
		// obj3 = array8;
		// obj2 = array8;
		// obj2 = array7;
		// obj2 = array6;
	}
}
