package day8.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
        // Create a single inheritance object
		B obj = new B();
		obj.a = 30;
		obj.b = 50;
		obj.display();
		obj.show();
		System.out.println();
         
		// Create a multi-level inheritance object
		C obj2 = new C();
		obj2.a = 100;
		obj2.b = 200;
		obj2.c = 300;
		obj2.show();
		obj2.display();
		obj2.print();
		System.out.println();
		
         // crate a hierarchy inheritance object
		Child1 c1 = new Child1();
		c1.display(1000);
		c1.show(700);
		Child2 c2 = new Child2();
		c2.display(2000);
		c2.print(3000);

	}

}
