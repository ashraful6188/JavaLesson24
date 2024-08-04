package day4;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// declaring an Array
		// int myArray[] = new int[5];
		int[] myArray = new int[5];
		// Assign values to the array
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;
		// print/extract value from the array
		System.out.println(myArray[4]);
		// finding out length of an array and "length" is keyword
		int length = myArray.length;
		System.out.println("The length is :" + length);

		// other way, declaring and initializing array
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(a[4]);// 5
		// extracting all the values or printing all the values out of an array
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(myArray));
		// printing all the values using for loop
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		System.out.println("**** using enhanced for loop ****");
		// Use enhanced for loop to print all the values our of an array
		// Enhanced for loop can not be work with decrement
		for (int mA : myArray) {
			System.out.println(mA);

		}
		System.out.println("Printing in reverse order");
		// printing values from last index to the first index
		for (int i = myArray.length - 1; i >= 0; i--) {
			System.out.println(myArray[i]);
		}

	}

}
