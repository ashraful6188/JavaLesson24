package day5;

import java.util.Arrays;
// String are only immutable in java

public class MuttableVsImmutableString {

	public static void main(String[] args) {
		
		// mutable - it can be change value in the same variable
		int[] a= { 30,20,75,43,27};
		System.out.println("Before change array : "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After change array"+ Arrays.toString(a));
		
		// immutable- it can not be change value in the same variable
		String str = new String("Welcome");
		//String str = "Welcome";
		str.concat("To java");
		System.out.println(str);
		// it can be initialize in new variable
		String str2 = 	str.concat("To java");
		System.out.println(str2);
		
		
		
	
	}

}
