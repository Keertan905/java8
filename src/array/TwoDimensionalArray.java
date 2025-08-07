package array;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] array = new int[3][4];
		// size = 12
		System.out.println(array.length);
		System.out.println(array.length * array[0].length);

		// print all the elements of 2D array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		System.out.println("*******");

		// assign elements to the array
		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;
		array[0][3] = 40;
		array[1][0] = 50;
		array[1][1] = 60;
		array[1][2] = 70;
		array[1][3] = 80;
		array[2][0] = 90;
		array[2][1] = 100;
		array[2][2] = 110;
		array[2][3] = 120;
		for (int[] arr1 : array) {
			for (int data : arr1) {
				System.out.println(data);
			}
		}
		System.out.println("*******");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
}
