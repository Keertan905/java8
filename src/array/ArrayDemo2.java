package array;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int array[];
		int array1 [];
		int [] array2;
		int []array3;
		int[] array4; //recommended 
		int[]array5;
		System.out.println("declaration + initialization at the same line");
		int[] arr = {10,-1,5,8,9,-4,15}; 
		System.out.println(arr.length);
		System.out.println(arr[5]);
		System.out.println(arr[2]);
		
		System.out.println("******");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("******");
		for(int value:arr) {
			System.out.println(value);
		}
		int[] array6 = {1,2,3,4,5,6,7,8,9};
		
	}
}
