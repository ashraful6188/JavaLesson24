package day6;

public class SumOfArray {
	public static void main(String[] args) {

		// Q1. Find sum of elements in an int Array.

		int[] myArray = { 23, 6, 8, 34, 87, 53, 88 };
		int sum = 0;

		for (int value : myArray) {
			sum += value;

		}
		System.out.println("The sum of all the elements of myArray is :" + sum);

	}

}
