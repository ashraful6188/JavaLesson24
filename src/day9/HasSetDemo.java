package day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetDemo {
	/*
	 * “HashSet” - is the class which implemented Set interface 
	 * 1) Heterogeneous data - allowed 2)Insertion order → Not preserved ( Index not
	 * supported ) but it uses hashing technique 3) Duplicate Element - Not allowed
	 * 4) Multiple nulls not allowed/ only single null is allowed
	 * 
	 */

	public static void main(String[] args) {

		// Declaration
		HashSet myset = new HashSet();
//		Set myset = new HashSet();
//		HashSet<Integer> myset = new HashSet<Integer>();

		// adding elements into the hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("Selenium");
		myset.add(true);
		myset.add('Y');
		myset.add(100);
		myset.add(null);
		myset.add(null);

		// Printing myset
		System.out.println("My set >>" + myset);

		// size of hashSet
		System.out.println("Size of hashset :" + myset.size());

		// Removing elements from the set by value
		myset.remove(10.5);
		System.out.println("Size of hashset :" + myset.size());

		// Inserting an element - is not possible
		// Accessing or reading specific element - not possible
		// work around by converting hashset into arraylist
		ArrayList a1 = new ArrayList(myset);
		System.out.println("Arraylist " + a1);
		System.out.println(a1.get(2));

		// Reading all the elements from hashset
		// using for each
//		 for( Object y : myset ) {
//			 System.out.print(y+ " ");
//		 }

		Iterator<Object> it = myset.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(" Clearing all the value : ");
		myset.clear();
		System.out.println(" My set is empty : " + myset.isEmpty());
		System.out.println("My set >> " + myset);

	}

}
