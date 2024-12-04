package actionItem;
import java.util.HashMap;
public class Group {
	/*
	 * Create an Group class which group id and employees.
	 */
	public static void main(String[] args) {

		// Declaring HasMap object
		HashMap<Integer, String> grupId = new HashMap<Integer, String>();
		// Adding Group id and employee
		grupId.put(10123, "Ahamed Kabir");
		grupId.put(10234, "Jakie Chen");
		grupId.put(10345, "Nusrat Begum");
		grupId.put(10456, "Brandon Tylor");
		grupId.put(10567, "Abdul Jabor");
		// Printing the Employee list
		System.out.println(grupId);
		// finding the size of element
		System.out.println(grupId.size());
		// remove a pair of groupid and name from
		System.out.println(grupId.remove(10345));
		// get a pair of groupId and name from map
		System.out.println(grupId.get(10456));
		// get key and value separately
		System.out.println(grupId.keySet() + " " + grupId.values());
		// get key and value together
		System.out.println(grupId.entrySet());
		// Retrieving data from map with for each loop
		System.out.println();
		for (int i : grupId.keySet()) {
			System.out.println(i + "  " + grupId.get(i));
		}
		// removing all data
		grupId.clear();
		// checking if data available or not
		System.out.println(grupId.isEmpty());
	}

}
