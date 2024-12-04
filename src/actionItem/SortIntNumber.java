package actionItem;

import java.util.Arrays;

/*
 * Q3. Sort elements of an array.
 */
public class SortIntNumber {

	public static void main(String[] args) {

		int[] number = { 34, 54, 11, 6, 23, 90, 82, 66 };
		// print before sorting the array
		System.out.println("Before Sorted array: " + Arrays.toString(number));

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[j] < number[i]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		// print after sorted the array
		System.out.println("After sorted array :" + Arrays.toString(number));

//		// sorting array with built-in method
//		int[] number = { 34, 54, 11, 6, 23, 90, 82, 66 };
//		// print before sorting the array
//		System.out.println("Before Sorted array: " + Arrays.toString(number));
//		Arrays.sort(number);
//		// print after sorted the array
//		System.out.println("After sorted array :" + Arrays.toString(number));	
		
		
		
	}

}
