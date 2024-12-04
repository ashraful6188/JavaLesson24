package day8.exceptionDemo;

public class ThrowKeyword {

	public void checkSum(int num) {
		if (num < 1) {
			throw new ArithmeticException("Number is invalid, can not find the area of a square");
			
		} else {

			System.out.println(num * num);
		}

	}
	
	public static void main ( String[]args) {
		ThrowKeyword tk = new ThrowKeyword();
		tk.checkSum(-3);
		
		
		System.out.println("*** all the best ***");
	}

}
