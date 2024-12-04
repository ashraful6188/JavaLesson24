package day8.interfaceDemo;

public class InterfaceTest implements Shape {

	@Override
	public void circle() {
		System.out.println("Circle belongs to abstract method");
			}
	public void triangle() {
		System.out.println("Traiangle belongs to InterfaceTest class");
	}
	
	public static void main ( String[]args) {
		
		InterfaceTest iobj = new InterfaceTest();
		iobj.circle();// abstract method implemented in this class
		iobj.sqaure(); // default method
	    Shape.rectangle(); // static method
	    iobj.triangle(); // current class method
	    
	    System.out.println("Area is " + Shape.length* Shape.width);
		
	}

}
