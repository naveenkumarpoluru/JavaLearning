package day6;

/**
 * 
 * @author aravindanathdm In this example, we have created two classes A and
 *         PrivateModifierExample. A class contains private data member and
 *         private method. We are accessing these private members from outside
 *         the class, so there is compile time error.
 *
 */

class A {
	private int data = 40;

	/*
	 * This method prints the hello java
	 */
	private void msg() {
		System.out.println("Hello java");
	}
	
	public void msgs() {
		System.out.println("Hello java");
	}
}

public class PrivateModifierExample {
	public static void main(String args[]) {
		int data = 40;

		A obj = new A();
		// Compile Time Error
		// System.out.println(obj.data);
		// Compile Time Error
		// obj.msg();
		obj.msgs();

	}
}
