package day5;

public class DemoEncapsulation {

	public static void main(String[] args) {
		EncapsulationDemo e = new EncapsulationDemo();

		e.setAge(25);
		e.setName("shreya");
		e.setCity("Bangalore");

		System.out.println(e.getName());
		System.out.println(e.getCity());
		System.out.println(e.getAge());

		// e.setAge(30);
		// System.err.println(e.getAge());
		// e.setCity("Bangalore");
		// System.err.println(e.getCity());

	}

}
