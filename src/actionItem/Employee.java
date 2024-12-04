package actionItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Employee {
	/*
	 * 1) Create an Employee class which contains id and name.
	 */

	public static void main(String[] args) {

		// Declaring HasMap object
		HashMap<Integer, String> idName = new HashMap<Integer, String>();
		// Adding id and name
		idName.put(101, "Ahamed Kabir");
		idName.put(102, "Jakie Chen");
		idName.put(103, "Nusrat Begum");
		idName.put(104, "Brandon Tylor");
		idName.put(105, "Abdul Jabor");

		// Printing the Employee map
		System.out.println(idName);
		// finding the size of element
		System.out.println(idName.size());
		// remove a pair of id and name from
		System.out.println(idName.remove(103));
		// get a pair of id and name from map
		System.out.println(idName.get(104));
		// get key and value separately
		System.out.println(idName.keySet() + " " + idName.values());
		// get key and value together
		System.out.println(idName.entrySet());
		// Retrieving data from collection with for each loop
		System.out.println();
		for (int i : idName.keySet()) {
			System.out.println(i + "  " + idName.get(i));
		}
		System.out.println();
		// By iterator technique, Retrieving data with Entry and Iterator interface
		Iterator<Entry<Integer, String>> it = idName.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> idName2 = it.next();
			System.out.println(idName2.getKey() + " " + idName2.getValue());
		}

	}

}
