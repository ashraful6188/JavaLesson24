package actionItem;

public class plaindromeString {
	/*
	 * Q5. Check to see if a string is palindrome or not.
	 */

	public static void main(String[] args) {

		String word = " River", reverseWord = "";
		// reversing the string by for loop
		for (int i = word.length() - 1; i >= 0; i--) {
			reverseWord = reverseWord + word.charAt(i);
		}
		// check to see , is it plaindrome or not
		if (word.equalsIgnoreCase(reverseWord)) {
			System.out.println(word + " is a plaindrome String ");
		} else {
			System.out.println(word + " is not plaindrome String");
		}
	}
}
