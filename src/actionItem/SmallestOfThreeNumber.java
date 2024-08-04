package actionItem;

import java.util.Scanner;
/*
 * Q2. Find out smallest of 3 numbers (use if..else).
 */

public class SmallestOfThreeNumber {

	public static void main(String[] args) {

		// import Scanner class to get input number
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type first number :");
		int number1 = sc.nextInt();
		System.out.println("Please type 2nd number :");
		int number2 = sc.nextInt();
		System.out.println("Please type 3rd number :");
		int number3 = sc.nextInt();

		if (number1 < number2 && number1 < number3) {
			System.out.println("This is the smallest number :" + number1);
		} 
		if (number2 < number1 && number2 < number3){
			System.out.println("This is the smallest number :" + number2);
		} else { 
			System.out.println("This is the smallest number :" + number3);

		}
		// close the scanner class
		sc.close();
	}

}
