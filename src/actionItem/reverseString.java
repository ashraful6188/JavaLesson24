package actionItem;

public class reverseString {
	/*
	 * Q8. Reverse a String using loop.
	 */
	public static void main(String[] args) {
        
		// Aproach 1 with length() and CharAt(index) method
		String str = "Democracy vs Autocracy";
		// create a string variable to put reverse string
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			// using charAt() method to put in the reverse string
			reverseStr += str.charAt(i);

		}
		System.out.println(reverseStr);

		//  Approach -2 by converting String to Char Array type
		String str2 = "Democracy vs Autocracy";
		// create a string variable to put reverse string
		String reverseStr2 = "";
		char[] ch = str2.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			reverseStr2 = reverseStr2 + ch[i];

		}
		System.out.println(reverseStr2);
		
		//  Approach -3 with StringBuffer class
		StringBuffer str3 = new StringBuffer("Democracy vs Autocracy");
		System.out.println(str3.reverse());
		//  Approach -4 with StringBulder class
		StringBuilder str4 = new StringBuilder("Democracy vs Autocracy");
		System.out.println(str4.reverse());
		
		
		
		
		
		
		
		

	}

}
