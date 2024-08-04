package actionItem;
/*
 * Q4. Reverse a number (use % / = operators).
 */
public class ReverseNumber {

	public static void main(String[] args) {
		
		ReverseNumber number = new ReverseNumber();
		System.out.println(" Revese Number is :" + number.doReverse(785));
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
