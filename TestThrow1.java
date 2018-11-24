package day5;

public class TestThrow1 {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid for voting!");
		  
		else
			System.out.println("welcome to vote");
		
	
	}

	public static void main(String args[]) {
		validate(100);
		System.out.println("rest of the code...");
		
	}
}
