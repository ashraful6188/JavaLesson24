package day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HasMapDemo {
	/*
	 * “HashMap” is the class which implemented Map interface 1)Data can be stored
	 * in the form of key, value pairs. 2)Key is Unique. But we can have duplicate and null
	 * values 3) Insertion order not preserved (Index not followed ) but use hashing
	 * technique
	 */
	public static void main(String[] args) {
		// declaration
//	HashMap hm = new HashMap();
//		Map hm = new HashMap();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding pairs
		hm.put(101, "Smith");
		hm.put(102, "Scott");
		hm.put(103, "Jain");
		hm.put(104, "jain");
		hm.put(102, "David");
		hm.put(105, null);
		hm.put(106, null);

		// Printing hashmap
		System.out.println("Hashmap" + hm);

		// finding out size
		System.out.println("Pair size >> " + hm.size());

		// removing a pair by key
		hm.remove(104);
		System.out.println("Hashmap >> " + hm);

		// accessing or reading  a value from a key
		System.out.println(hm.get(101)); // Smith

		// get all the keys of a hasmap
		System.out.println(hm.keySet());//[101, 102, 103, 105, 106]

		// get all the values
		System.out.println(hm.values());// [Smith, David, Jain, null, null]
		//get the all key and value 
		System.out.println("All the entries : " + hm.entrySet());//[101=Smith, 102=David, 103=Jain, 105=null, 106=null]

		// reading or retrieving  all the elements of a hashmap
		for (int k : hm.keySet()) {
			System.out.println(k + " " + hm.get(k));

		}

		// Reading elements by Iterator interface technique with Entry interface
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
		// Removing all data
		hm.clear();
		System.out.println(hm.isEmpty());

	}

}
