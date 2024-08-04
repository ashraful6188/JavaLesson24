package day6;

/*
 * Q2. Print even and odd numbers from an Array.
 */
public class EvenOddNumberInArray {

	public static void main(String[] args) {

		int[] number = { 34, 55, 89, 32, 12, 6, 3, 5, 88 };

		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println("Even Number is :" + number[i]);
			}
			if (number[i] % 2 == 1) {
				System.out.println("Odd number is :" + number[i]);
			}
		}

	}
}
