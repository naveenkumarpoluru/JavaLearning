package day5;

public class NormalClass extends Fruit   {

	public static void main(String[] args) {
	 
		NormalClass n= new NormalClass();
		n.juice();
		n.juice1();
//		n.juice21();
	 
	}



	void juice() {
		System.out.println("Mango Juice");
		
	}

	 
	void juice1() {
		System.out.println("Orange Juice");
		
	}

	 
	void juice21() {
		System.out.println("Papaya Juice");
	}

}
