package day4;

public class WhilLoop {

	public static void main(String[] args) {

		// Every loop has three operation which is
		// initialization/start point; condition/logic; increment/decrement

		System.out.println("**** Using for loop ****".repeat(2));
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			System.out.println("***Jhon***");
		}

		// print 1 to 5 using while loop
		System.out.println("**** Using while loop****".repeat(2));
		int num = 1;
		while (num <= 5) {
			System.out.println(num);
			System.out.println("***Jhon***");
			num++;
		}

		// print 1 to 5 using do while loop
		System.out.println("**** Using for do while loop ****".repeat(2));
		int number = 1;
		do {
			System.out.println(number);
			System.out.println("***Jhon**");
			number++;
		} while (number <= 5);

		System.out.println("***Situation 1***".repeat(2));
		// situation 1 : Print all the numbers less 5
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			// Keeping the code intact, exclude printing 6-10
			if (i == 5) {
				// Jumping statement
				break;
			}
		}

		System.out.println("***Situation 2***".repeat(2));
		// situation 2 : Print all the numbers without 5
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// skip the current sequence
				continue;
			}
			System.out.println(i);
		}

	}

}
