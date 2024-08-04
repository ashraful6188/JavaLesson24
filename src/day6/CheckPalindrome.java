package day6;

/*
 * Q5. Check to see if a string is palindrome or not.
 */
public class CheckPalindrome {

	public static void main(String[] args) {

		String input = "adda";
		System.out.println("Given string is a plaindrome" + isPlaindrome(input));

	}

	public static boolean isPlaindrome(String str) {

		String reversed = "";
		for (int i = str.length() - 1; i > 0; i--) {
			reversed += str.charAt(i);
		}
		return str.equals(reversed);

	}
}
