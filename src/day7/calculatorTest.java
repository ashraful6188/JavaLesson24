package day7;

public class calculatorTest {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.sum(); // 1
		cal.sum(50, 34);// 2
		cal.sum(45, 30.50, 80);// 5
		cal.sum(50, 50.00);//1
		cal.sum(70.80, 60);
	
	
	
	
	}

}
