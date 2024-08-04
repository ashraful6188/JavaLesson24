package actionItem;

public class PlaindromeNumber {
	/*
	 * Q5. Find out a number is palindrome or not (use conditional statements +
	 * looping). If a given number is 121 after reversing it remains as 121 then we
	 * shall call this number as palindrome.
	 */
	public static void main(String[] args) {

		PlaindromeNumber rn = new PlaindromeNumber();
		int orginalNumber = 7667;
		if (orginalNumber == rn.doReverse(orginalNumber)) {
			System.out.println(" This number is Plaindrome number ");
		} else {
			System.out.println("This is not Plaindrome number");
		}

	}

	// Creating method to reverse the number
	public int doReverse(int number) {

		int reverse = 0;

		int remainder;

		do {
			remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number / 10;
		} while (number > 0);

		return reverse;
	}

}
