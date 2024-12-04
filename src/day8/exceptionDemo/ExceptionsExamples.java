package day8.exceptionDemo;

import java.util.Scanner;

public class ExceptionsExamples {
	
	public static void main(String[]args) {
		
		System.out.println("Program started .....");
		Scanner sc = new Scanner(System.in);
		
//		// example 1
//		System.out.println("Enter a number: ");
//		int num = sc.nextInt();
//		System.out.println(100/num);// ArithmeticException
//		
//		// example 2
//		int[]a = new int[5];
//		System.out.println("Enter the position (0-4)");
//		int posn = sc.nextInt();
//		System.out.println("Enter the value");
//		int value = sc.nextInt();
//		a[posn] = value;
//		System.out.println(a[posn]); // ArrayIndexOutOfBoundsException
//		
//		// exampl 3
//		String s = null;
//		int len = s.length(); // NullPointerExection
//		System.out.println(len);
		
		// example 4
		String s = "Welcome";// NumberFormatException
		int num = Integer.parseInt(s);
	    System.out.println(num);
		
		
		
		
		
		
		System.out.println("End of the program @@@@@@");
	}
	
	

}
