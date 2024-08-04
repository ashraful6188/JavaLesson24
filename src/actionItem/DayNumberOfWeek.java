package actionItem;

public class DayNumberOfWeek {
	/*
	 * Q3. Print day number of week based on day name (Use Switch case).
	 */
	public static void main(String[] args) {

		String dayNumber = "Wednesday";
		
		switch(dayNumber) {
		
		case "Monday": { System.out.println(" This is day 1"); break;}
		case "Tuesday": { System.out.println(" This is day 2"); break;}
		case "Wednesday": { System.out.println(" This is day 3"); break;}
		case "Thusday": { System.out.println(" This is day 4"); break;}
		case "Friday": { System.out.println(" This is day 5"); break;}
		case "Saturday": { System.out.println(" This is day 6"); break;}
		case "Sunday": { System.out.println(" This is day 7"); break;}
		default: { System.out.println(" This is no day number of as week");}
		
		}	
	}
}
