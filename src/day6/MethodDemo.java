package day6;
/*
 * 1) Method name is a user defined name
 * but it should display the intent of performing an action
 * 2) Method may or may not return any value
 * 3) Method may or may not accept parameters
 * 4) Method can be invoked through objects
 * 5) A Method is created to perform some action
 */
public class MethodDemo {

	// 1) No parameter no return
	public void methodOne() {
		System.out.println("Hey, we are learning method!");
	}

	// 2) No parameter but returns value
	public String methodTwo() {
		String a = "Hello.";
		String b = "How are you ?";
		return (a + b);
	}

	// Accepts parameter but does not return
	public void methodThree(String name) {
		System.out.println(name + " , how are you ? ");
	}
 // Accept parameters and return value
	public int add(int a, int b) {
		return (a + b);

	}

}
