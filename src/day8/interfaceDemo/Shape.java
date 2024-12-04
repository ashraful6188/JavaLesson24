package day8.interfaceDemo;

public interface Shape {

	int length = 10; // final and static
	int width = 20; // final and static

	void circle(); // abstract method

	default void sqaure() {
		System.out.println("Square belongs to default method");
	}

	public static void rectangle() {
		System.out.println("Rectangle belong to static method");
	}

}
