package day2;

public class TernaryOperatorDemo {

	public static void main(String[] args) {

		// Conditional or ternary operator ?
		int age = 25;
		String result = (age >= 18) ? "Eligible to vote " : " Not eligible !";

		System.out.println(result);
		System.out.println((age >= 18) ? "Eligible to vote " : " Not eligible !");

		int a = 25, b = 10;
		// System.out.println(" initial value of a is " + a + " and b is :" + b);
		System.out.printf("Initial value of a %d and b %d", a, b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.printf("  \nFinal value of a %d and b %d", a, b);
		// System.out.println(" Final value of a is:" + a + " and b is : " b);

	}

}
