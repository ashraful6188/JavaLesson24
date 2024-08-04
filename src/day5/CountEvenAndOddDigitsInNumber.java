package day5;

public class CountEvenAndOddDigitsInNumber {

	public static void main(String[] args) {

		int num = 2522, oddCount = 0, evenCount = 0;
		// count even and odd number from the a digit
		while (num > 0) {
			int digit = num % 10;
		        num /= 10;
			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			
		}
		System.out.println(" Even count " + evenCount);
		System.out.println("Odd count " + oddCount);
	}

}
