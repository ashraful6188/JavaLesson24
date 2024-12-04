package day8.exceptionDemo;

public class HandleException {

	public static void main(String[] args) {
		
		System.out.println("Program stated .....");
		
	  // exampl 3
	String s = null;
	
	try {
		
	int len = s.length(); // NullPointerExection
		System.out.println(len);
		
	}catch(NullPointerException e) {
		System.out.println("Exception occured !!");
		e.printStackTrace();
	}
		
	
//		String  s ="Welcome";
//		try {
//			int num = Integer.parseInt(s); //NumberFormatException
//					System.out.println(num);
//			
//		}catch ( NullPointerException e) {
//			System.out.println("Exception occured !! ");
//		}catch (ArithmeticException e) {
//			System.out.println("Exception occured !! ");
//		} catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Exception occured !!");
//		} catch(NumberFormatException e) {
//	       System.out.println("Exception occured !! ");
//	    }
            System.out.println("**** End of the program ****");

	}

}
