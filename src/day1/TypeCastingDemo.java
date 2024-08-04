package day1;

public class TypeCastingDemo {
	public static void main(String[] args) {

		int myInt = 32800;
		short myShort = 10;
		myShort = (short) myInt;
		System.out.print(myShort);
		System.out.println();

		// large data type into small data type, call down casting and it need to put
		// pair
		// of parenthesis in front of variable
		long myLong = 2346L;
		myInt = (int) myLong;
		System.out.println(myInt);

		// small data type value assign into large data type call up-casting, It is
		// default casting and up-castting does not need
		// to put (long) pair parenthesis before variable
		myInt = 23459;
		myLong = myInt;
		System.out.println(myLong);

		// type casting for data type float and double
		double myDouble = 34.4589736598;
		float myFloat = 23.568f;
		// down casting
		// after float data type limit, it will trim rest of the value
		myFloat = (float) myDouble;
		System.out.println(myFloat);
		// up-casting
		myFloat = 23.54f;
		myDouble = myFloat;
		System.out.println(myDouble);

		// Define int variable
		int num = 5004;
		// Type casting int to double
		double doubleNum = num;
		// show output
		System.out.println("The value of " + num + " after converting to the double is " 
		+ doubleNum);
		// Type casting double to int
		int convertedInt = (int) doubleNum;
		// show output
		System.out.println("The value of " + doubleNum + 
				" after converting to the int again is " + convertedInt);

	}

}
