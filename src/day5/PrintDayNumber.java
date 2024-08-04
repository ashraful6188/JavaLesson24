package day5;

public class PrintDayNumber {
	/*
	 * Q3. Print day number of week based on day name (Use Switch case).
	 */
	public static void main(String[] args) {

		String dayNumber = "Wednesday".toLowerCase();
		
		switch(dayNumber) {
		
		case "monday": { System.out.println(" This is day 1"); break;}
		case "tuesday": { System.out.println(" This is day 2"); break;}
		case "wednesday": { System.out.println(" This is day 3"); break;}
		case "thusday": { System.out.println(" This is day 4"); break;}
		case "friday": { System.out.println(" This is day 5"); break;}
		case "saturday": { System.out.println(" This is day 6"); break;}
		case "sunday": { System.out.println(" This is day 7"); break;}
		default: { System.out.println(" invalid day name");}
		
		}	
	}
}
