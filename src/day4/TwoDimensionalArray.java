package day4;

public class TwoDimensionalArray {
	public static void main(String[] args) {

		// declaration 2 dimensional Array
		int[][] a = new int[3][2];

		// assigning values to the cells
		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 600;
		a[1][1] = 700;

		a[2][0] = 800;
		a[2][1] = 900;
		
		// assigning value 2d array another way  
		//int[][] a = { {100,200},{600,700},{800,900} };
		
		// extracting single value
		System.out.println(a[1][1]);// 700
		
		int[][] b = { { 1, 10 }, { 3, 4, 23 }, { 5, 6, 24, 67, 45 } };
		// extracting  single value
		System.out.println(b[2][1]);// 6
		
		System.out.println("Printing all a the values");
		// jack for loop
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);

			}
		}
		System.out.println("Printing all the values from b array");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}

		System.out.println("Extracting all the values b array using enhanced for loop");
		for (int arr[] : b) {
			for (int x : arr) {
				System.out.println(x + " ");
			}
			System.out.println();
		}

	}

}
