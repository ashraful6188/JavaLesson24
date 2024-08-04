package day4;

public class NumberOfEvenAndOddNumbersInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int even = 0;
		int odd = 0;
		for (int var : a) {
			if (var % 2 == 0) {
				even++;
			} else {
				odd++;
			}

		}
		System.out.println(" Number of even numbers:" + even);
		System.out.println(" Number of odd numbers:" + odd);

		// Other way, number of even and odd in array
		int evenExtra = 0;
		int oddExtra = 0;
		for (int value : a) {
			if (value % 2 == 0) {
				evenExtra++;
			}

			if (value % 2 == 1) {

				oddExtra++;
			}

		}
		System.out.println("Even number " + evenExtra + " times" + " odd number" + oddExtra);
	}

}
