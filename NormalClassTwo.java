package day5;

public class NormalClassTwo  extends Fruit{

	public static void main(String[] args) {
		NormalClassTwo n = new NormalClassTwo();
		n.juice();
		n.juice1();
		n.juice21();

	}

	@Override
	void juice() {
	 
		System.out.println("Apple");
	}

	@Override
	void juice1() {
		System.out.println("Lemon");
		
	}

	@Override
	void juice21() {
		System.out.println("Kiwi");
		
	}

}
