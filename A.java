package day5;

public class A extends B {

	public static void main(String[] args) {
		A a = new A();
		a.test1();
		B b = new B();
		b.test1();
		// A s = (A) new B();
		// s.method();
		// B b = new B();
		// b.test1();
		// b.test2();
		//
		// C c = new C();
		// c.test3();
		// c.test4();
		//
		D d = new D();
		d.testMethod();

	}

	void method() {
		System.out.println("Method");
	}

}

class D {

	void testMethod() {
		System.out.println("Test method!");
	}

}
