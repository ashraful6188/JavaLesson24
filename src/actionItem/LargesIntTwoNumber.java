package actionItem;

import java.util.Scanner;

/*
 * Q1. Find out largest of 2 numbers (use if..else, and ternary
operator).
 */
public class LargesIntTwoNumber {

	public static void main(String[] args) {
		
		// import Scanner class to get input number
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type a number to search for:");
		int number1 = sc.nextInt();
		System.out.println("Please type another number to search for:");
		int number2 = sc.nextInt();
		
		if ( number1 > number2) {
			System.out.println("This is the largest number :" + number1);
		} else { 
			System.out.println("This is the largest number :" + number2);
		}
		
		System.out.println("### Finding by ternary operator ###");
		
		int largest =( number1 > number2) ? number1:number2;
		System.out.println("This is the largest number :"+ largest);
	    sc.close();
	}

}
