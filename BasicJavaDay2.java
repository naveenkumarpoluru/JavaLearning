package day1;

import day2.Calculator;

public class BasicJavaDay2 extends BasicJava {

	BasicJava b = new BasicJava();

	public static void main(String[] args) {
		Calculator avi = new Calculator();
		// avi.sub(22, 10);
		System.out.println("Avi is sub "+avi.sub(22, 10));
		Calculator ankush = new Calculator();
		System.out.println("Ankush is doing addition " +ankush.sum(22, 10));
		// b.test3();
	}

}
