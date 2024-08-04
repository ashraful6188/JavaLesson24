package day2;

public class IncrementOperatorDemo {

	public static void main(String[] args) {

		// Increment operators ++
		int a = 10;
		System.out.println(a); // 10
		// a = a + 1;
		a++;
		System.out.println(a); // 11

		// post increment
		int x = 10;
		int result = x++;
		System.out.println(result); // 10

		// pre increment
		int b = 20;
		int res = ++b;
		System.out.println(res);// 21

	}

}