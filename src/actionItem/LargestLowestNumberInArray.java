package actionItem;

public class LargestLowestNumberInArray {
	/*
	 * Q4. Find out largest and lowest numbers of an array.
	 */
	public static void main(String[] args) {

		int[] number = { 34, 7, 78, 98, 43, 99, 23 };
		int largest = 0, lowest = 0;

		// finding largest number from array
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[j] < number[i]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
					largest = number[j];
				}
			}
		}
		// finding lowest number from array
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[j] > number[i]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
					lowest = number[j];
				}
			}
		}
		System.out.println("Largest number is " + largest);
		System.out.println("Lowest number is " + lowest);

	}

}
