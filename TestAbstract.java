package day5;

public class TestAbstract extends Shapes {

	public static void main(String[] args) {
		// In real scenario, object is provided through method e.g. getShape() method
		Shapes s = new Circle();
		
		s.draw();
		
		Shapes s1 = new Rectangle();
		s1.draw();
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}

}
