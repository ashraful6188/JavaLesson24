package actionItem;

public class LargestTwoNumberInArray {
	/*
	 * Q1. Find out largest of 2 numbers in array (use if..else, and ternary operator).
	 */
	public static void main(String[] args) {

		// declaring a number array
		int[] a = { 10, 11, 12, 45, 14, 15, 78, 20, 76, 10 };
		int firstLargest = 0;
		int secondLargest = 0;
		// declaring for enhanced loop to find two largest number
		for (int number : a) {

			if (firstLargest < number) {
				secondLargest = firstLargest;
				firstLargest = number;
			} else if (number > secondLargest) {
				secondLargest = number;
			}
		}
		System.out.println("The first largest number is :" + firstLargest);
		System.out.println("The Second largest number is :" + secondLargest);

		System.out.println("**** with ternary operator example***");
		// with ternary operator
		for (int number : a) {

			firstLargest = (firstLargest < number) ? number : firstLargest;

			secondLargest = (secondLargest > firstLargest) ? firstLargest : secondLargest;

		}
		System.out.println("The first largest number is :" + firstLargest);
		System.out.println("The Second largest number is :" + secondLargest);
	}
}
