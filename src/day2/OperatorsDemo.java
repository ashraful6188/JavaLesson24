package day2;

public class OperatorsDemo {
	
  public static void main ( String[] args) {	
	
	   // Arithmetic operator + - * / %
       int a = 20, b = 10;
	  
       System.out.println("Sum of a and b is :" + (a+b));//30
	   System.out.println("Diff of a and b is :" + (a-b));//10
	   System.out.println("Mul of a and b is :" + (a*b));//200
	   System.out.println("Div of a and b is :" + (a/b));//2
	   System.out.println("Modulous of a and b is :" + (a%b));//0
	   
	   /* Relational / comparison operators > < >= <= != ==
	   Returns boolean value - true or false
	   */
	   
	   System.out.println(" ==== Relatoional Operators ====".repeat(3));
	   
	   
	   System.out.println(a>b); //true
	   System.out.println(a<b); // false
	   System.out.println(a>=b);// true
	   System.out.println(a<=b);// false
	   System.out.println(a==b);// false
	   System.out.println(a!=b);// true
	   
	   // Logical Operators && || !(not)
	   // returns a boolean value
	   // works between 2 boolean values 
	   System.out.println(" ==== Logical Operators ====".repeat(3));  
	   boolean x = true, y = false;
	   System.out.println(x && y ); // false
	   System.out.println(x || y);// true
	   System.out.println(!x); // false
	   System.out.println( !y); // true
	   
  }
	
	

}
