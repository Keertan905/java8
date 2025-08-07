package array;

public class Array3D {
	public static void main(String[] args) {
		int[][][] array = { { { 1, 2, 3 }, { 4, 5 }, { 6 }, { 7 } }, { { 8 }, { 9, 10 }, { 11 } },
				{ { 12, 13 }, { 14 } } };

		System.out.println(array.length);
		System.out.println(array.length * array[0].length * array[1].length);
		System.out.println("******");
		System.out.println(array[0][3][0]);
		System.out.println(array[1][1][1]);
		System.out.println(array[2][1][0]);
		System.out.println("access all the values");
		for(int i =0;i< array.length;i++) {
			for(int j=0;j <array[i].length;j++) {
				for(int k=0;k<array[i][j].length;k++) {
					System.out.println(array[i][j][k] );
				}
			}
		}
		
	}

}
