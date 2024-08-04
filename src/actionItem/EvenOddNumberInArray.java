package actionItem;

/*
 * Q2. Print even and odd numbers from an Array.
 */
public class EvenOddNumberInArray {

	public static void main(String[] args) {

		System.out.println(" Printing all the Odd numbers: ");
		int[] arr = { 34, 55, 89, 32, 12, 6, 3, 5, 88 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println(" Printing all the even numbers: ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

	}
}
