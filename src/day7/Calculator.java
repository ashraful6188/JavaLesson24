package day7;

public class Calculator {
	
	// compile time polymorphism or static binding or method overloading
   int a= 10, b= 20;
	//# 1 no param
	public void sum() {	
	System.out.println(a+b);	
	}
	
	// #2 two params
	public void sum(int x, int y) {
		System.out.println( x+ y);
	}
	//#3 two but data type is changed
	public void sum(double x, int y) {
		System.out.println( x+ y);
	}
	//#4 two params but the sequence is changed
	public void sum(int x, double y) {
		System.out.println( x+ y);
	}
	//# 5 the number of params are changed
	public void sum(int x, double y, int z) {
		System.out.println( x+ y);
	}
	
	
	
}
