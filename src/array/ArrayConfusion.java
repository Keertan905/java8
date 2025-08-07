package array;

public class ArrayConfusion {
	public static void main(String[] args) {
		Object obj;
		Object[] obj1;
		Object[][] obj2;
		Object[][][] obj3;

		int[][][] arr1 = new int[2][2][1];

		// int[] -> array of integers -> object
		// int[][] -> array of int[] -> array of object -> object[]
		// int[][][] -> array of array of array -> array of array of object -> array of
		// object[] -> object[][]

		obj = arr1; // here obj is universe god
		obj1 = arr1;
		// object[] = object[][] #type is valid and dimension is valid
		obj2 = arr1;
		// object[][] = object[][] #type is valid and dimension is valid
		// obj3 =arr1;
		// Object[][][] = object[][] #type is valid and dimension is invalid

		int[] arr2 = new int[1]; 
		// collection of object
		int[][] arr3 = new int[1][2]; 
		// collection of object
		// collection of int
		int[][][] arr4 = new int[2][2][1];
		// collection of object
		// collection of object
		// collection of int
		int[][][][] arr5 = new int[2][2][1][2];
		// collection of object
		// collection of object
		// collection of object
		// collection of int
		obj = arr2; 
		obj = arr4;
		obj = arr5;

	}
}
