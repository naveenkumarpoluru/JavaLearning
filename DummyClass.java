package day5;

public  class DummyClass implements Dummy {

	
	public static void main(String[] args) {
		DummyClass d = new DummyClass();
		d.circle();
		d.draw();
	}
	 
	public void draw() {
		System.out.println("draw");
		
	}

	 
	public void circle() {
		System.out.println("circle");
		
	}

	

}
