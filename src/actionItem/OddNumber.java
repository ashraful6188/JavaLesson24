package actionItem;

public class OddNumber {

	/*
	 * Q5. Write a program that sums all the odd numbers from 0 to 20 using for
	 * loop.
	 */
	public static void main(String[] args) {
		int number = 20;
		int sum = 0;
		for (int i = 0; i <= number; i++) {

			if (i % 2 == 1) {
				sum = sum + i;

			}

		}
		System.out.println("Sum of ood number is :" + sum);

	}

}
