package day5;

public class AbDemo {

	public static void main(String[] args) {

		SureshPhone s =  new SureshPhone();
		s.call();
		s.cook();
		s.dance();
		s.move();
		
	}

}

// Abstract class cannot instantiate the abstract class
abstract class MaheshPhone {

	public void call() { // Definition
		System.out.println("Calling..");
	}

	public abstract void move(); // Abstract Methods

	public abstract void dance(); 

	public abstract void cook();// Declaration of a method

}

abstract class RameshPhone extends MaheshPhone {

	public void move() {

		System.out.println("Moving...");
	}

}

class SureshPhone extends RameshPhone { // Concrete class so we can create object 

	public void dance() {
		System.out.println("Dancing...");
	}

	public void cook() {

		System.out.println("Cooking...");
	}

}
