package actionItem;

public class RremoveJunk {
	/*
	 * Q6. Remove Junk or Special character from a String.
	 */

	public static void main(String[] args) {

		String str = "as$hraful.hoque@gmail.com";
		// removing special character from string
		String str2 = str.replace("@", " ").replace(".", " ").replace("$", "");
		System.out.println(str2);

		// other way remove junk character from a string
		String str3 = " #Hello worl$&!#.d";
		str3 = str3.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str3);

	}

}
