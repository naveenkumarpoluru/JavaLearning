package day5;

public class NewClass {
	public static void main(String[] args) {
		NewClass3 ne = new NewClass3();
		ne.metod();
		
		NewClass2 n =  new NewClass2();
		n.metod();
	}
	
	
}

class NewClass2 {

	void metod() {
		System.out.println("New class 2");
	}
}

class NewClass3 {
	void metod() {
		System.out.println("New class 3");
	}
}
