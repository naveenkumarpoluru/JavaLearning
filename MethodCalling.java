package day3;

public class MethodCalling {

	public static void main(String[] args) {
		MethodCalling m = new MethodCalling();
		m.car();
		m.door();
		m.engine();
		m.gear();

		wheel();

	}

	public void car() {
		door();
		System.out.println("car is calling");
	}

	public void engine() {
		wheel();
		System.out.println("engine is calling");
	}

	public void door() {

		System.out.println("door is calling");
	}

	public void gear() {
		door();
		System.out.println("gear is calling");
	}

	public static void wheel() {
		 
		System.out.println("Wheel is calling");
	}
}
