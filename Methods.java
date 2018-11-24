package day2;

//import java.util.Random;


public class Methods {
	// static String name = "aravind";
	String name = "avi";
	public static void main(String[] args) {
		myMethod();
		Methods m = new Methods();
		m.car(12, "BMW");
		m.car(20, "Nano");
		m.go();
		age(22, 22);
		myMethod();
		
	//	Math.
		
		int x = (int)(Math.random()*999999999);
	
		double ran = Math.random();
		// int ren = (int)ran;

		System.out.println("Random number " + x);
	}

	public void car(int a, String s) {
	//	String name = "Pradyumna";

		System.out.println("Car milage " + a);
		System.out.println("Car Brand " + s);
		// String name = "poonam";
		System.err.println(name);

	}

	public static int age(int a, int b) {

		System.out.println("Age " + a);
		int sumb = a + b;
		return sumb;
	}

	public static void myMethod() {
		System.out.println("THIS IS A STATIC METHOD");
	}
	public void go() {

		int r = 4;
		int a = 0;
		int w = r + a;
		System.out.println(w);

	}

}
