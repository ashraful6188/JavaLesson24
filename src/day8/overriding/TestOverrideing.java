package day8.overriding;

public class TestOverrideing {

	public static void main(String[] args) {

		BankOfAmerica ba = new BankOfAmerica();
		System.out.println("ROI of BA " + ba.roi());
		ChaseBank ca = new ChaseBank();
		System.out.println("ROI of Chas Bank " + ca.roi());

	}

}
