package actionItem;

public class SumOfIntArray {
	/*
	 * Q1. Find sum of elements in an int Array.
	 */

	public static void main(String[] args) {

		int[] number = { 23, 45, 56, 20, 56, 99, 21 };
		int sum = 0;

		for (int i = 0; i < number.length; i++) {
			// calculating sum of array
			sum += number[i];
		}
		// print the sum of array
		System.out.println(" Sum of int array is : " + sum);
	}
}
