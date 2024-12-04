package actionItem;
/*
 * Q7. Create a program that converts a given number of days into
 * years, months, and days.
 */

public class ConvertDay {
	
	public static void main(String[]args) {
		
		int days = 100;
		ConvertDay.convertDays(days);
		
		
		
	}
	
	public static void convertDays(int day) {
		
		int years = (int) day/360;
		if( years < 1) {
			System.out.print(years+ " less then a year, ");
		}else {
			System.out.println( years + "year, ");
		}
		int month = (int)day/30;
		System.out.print(month + " month");
		
		
	}

	
	
	
	
	
	
	
	
}
