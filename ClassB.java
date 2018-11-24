package day6;
/**
 * 
 * @author aravindanathdm
 * If you make any class constructor private, 
 * you cannot create the instance of that class from outside the class. For example:
 *
 *
 */
class ClassB {
	private ClassB() {
	}// private constructor

	void msg() {
		System.out.println("Hello java");
	}
}

class Simple {
	public static void main(String args[]) {
	//	ClassB obj = new ClassB();// Compile Time Error
	}
}