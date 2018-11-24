package day4;

public class TestPolymorphism {

	public static void main(String[] args) {

		Bank b;
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new Axis();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
	}

}
