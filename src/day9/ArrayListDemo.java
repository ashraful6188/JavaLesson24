package day9;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	/*
	 * “ArrayList” – is the class which implemented List interface.
	 * 1)Heterogeneous data - allowed 2)Insertion Order- Preserved(Index) 3)
	 * Duplicate elements -allowed 4) Multiple nulls – allowed
	 */

	public static void main(String[] args) {

		// Declaration
		ArrayList myList = new ArrayList();
//		List myList = new ArrayList();
//		ArrayList <String> myList = new ArrayList<String>();

		// Adding data into an arraylist
		myList.add(100);
		myList.add(10.5);
		myList.add("Welcome");
		myList.add('A');
		myList.add(false);
		myList.add(100);
		myList.add(null);
		myList.add(null);
		myList.add(100);

		// size of arraylist
		System.out.println(" The size of the mylist is : " + myList.size());// 9

		// Printing arraylist
		System.out.println("My list >> " + myList);

		// Remove elements from the list
		myList.remove(8);// index of element
		System.out.println("My list >> " + myList);

		//  add a new element in the arraylist
		myList.add(700);
		System.out.println("My list >> " + myList);

		// Insert or add a new element in the arraylist with specific index
		myList.add(2, "Selenium"); // 10th one in the list
		System.out.println("My list >> " + myList);

		// modify or change or replace a value
		myList.set(3, "Java");
		System.out.println("My list >> " + myList);

		// Reading a specific element from the ArrayList
		System.out.println(myList.get(1));

//		// ***Retrieving or reading all the elements from the arraylist**
//		// Using traditional for loop
//		for( int i=0; i<myList.size(); i++) {
//			System.out.print(myList.get(i)+ " ");
//		}

//		// Using for each loop
//		for( Object x:myList) {
//			System.out.print(x+ " ");
//		}

		// Using Iterator interface
		Iterator <Object> it = myList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}

		// checking if the list is empty or not
		System.out.println("My list empty : " + myList.isEmpty());

		// removing multiple elements from the list
		ArrayList myList2 = new ArrayList();
		myList2.add(100);
		myList2.add(10.5);
		myList2.add("Selenium");

		// remove data from arraylist
		myList.removeAll(myList2);
		System.out.println("My list " + myList);

		// to clear the entire arraylist
		myList.clear();
		System.out.println("My list empty : " + myList.isEmpty()); // true
		System.out.println("my list >> " + myList);

	}

}
