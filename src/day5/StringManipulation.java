package day5;

public class StringManipulation {

	public static void main(String[] args) {

		// String are immutable - it can not be changed
		String s = "Welcome 123";// string literal
		String s2 = new String("Welcome"); // though string object

		// to learn important methods of String class

		// length() -- counts all the characters in a string
		// and returns the number in int data type
		int length = s2.length();
		System.out.println("The length is : " + length);// 7
		System.out.println(s.length()); // 11

		// concat()- join multiple strings
		String s1 = "Welcome";
		String s3 = " to java";
		String s4 = " programing.";
		System.out.println(s1.concat(s3).concat(s4));
		// different way concat
		System.out.println(s1 + s3 + s4);

		// trim() -- would trim any leading and trailing spaces from a string
		s = "    welcome to java    ";
		System.out.println(s.length());
		s.trim();
		System.out.println(s.trim().length());
		// different way save in new variable and print it
		String sv = s.trim();
		System.out.println(sv.length());

		// charAt() -- return a single character out of a string from specific index
		// index star from zero
		s = "Java Selenium";
		System.out.println(s.charAt(5));
		// different way
		char chr = s.charAt(5);
		System.out.println(chr);

		// contains() -- returns a boolean ( true/false )
		// check a string is the part of the main string or not
		System.out.println(s.contains("jav"));// false
		System.out.println(s.contains("Sel"));// true
		System.out.println(s.contains("ium"));// true
		System.out.println(s.contains("a S"));// true
		// can not be possible for random character from string
		System.out.println(s.contains("jlu"));

		// equals(), equalsIgnoreCase() --> compares two strings and returns true/false
		s1 = "Welcome";
		s2 = "welcome";
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals("welcome")); // false
		System.out.println("Welcome".equals("welcome")); // false
		System.out.println(s1.equalsIgnoreCase(s2));// true

		// replace() -- it replaces a single character or character sequence of a giving
		// string
		s = "welcome to java selenium automation";
		System.out.println(s.replace("w", "W"));
		System.out.println(s.replace("java", "python"));

		// substring() -- extracts/remove substring from the main string
		System.out.println(s.substring(11));// java selenium automation
		System.out.println(s.substring(11, 15));// java

		// toUpperCase() toLowerCase --- converts the cases
		s = "Welcome";
		System.out.println(s.toUpperCase());// WELCOME
		System.out.println(s.toLowerCase());// welcome

		// split() -- split or divide original string into multiple parts based on
		// delimiter and  a String array
		s = "abc@xyz";
		String a[] = s.split("@");
		System.out.println(a[1]);
		s = "welcome to java selenium automation";
		String b[] = s.split(" ");
		System.out.println(b[3]);

		s = "welcome to java selenium automation";
		System.out.println(s.replace(" ", "_"));

		s = "abc,123@m.com";
		// extract only abc from the following string
		String c[] = s.split(",");
		System.out.println(c[1]);

	}

}
