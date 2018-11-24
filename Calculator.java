package day2;

public class Calculator {

	
	
	
	public static void main(String[] args) {

		
		
		Calculator c = new Calculator();
		int a = c.sum(121, 1211);
		System.out.println("Sum of two numbers: " + a);

		int b = c.sub(12334, 1211);
		System.out.println("Sub of two numbers: " + b);

		int cs = c.div(1123, 10);
		System.out.println("Div of two numbers: " + cs);
		int d = c.mul(121, 1211);
		System.out.println("Mul of two numbers: " + d);

	}

	public int sum(int a, int b) {

		return a + b;
	}

	public int sub(int a, int b) {

		return a - b;
	}

	public int mul(int a, int b) {

		return a * b;
	}

	public int div(int a, int b) {

		return a / b;
	}

}
