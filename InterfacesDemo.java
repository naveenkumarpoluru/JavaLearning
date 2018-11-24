package day5;

public class InterfacesDemo {
	// Using interface: by third user
	public static void main(String args[]) {
		// In real scenario, object is provided by method e.g. getDrawable()
		Drawable d = new Circles();
		d.draws();
		d.msg();
		Rectangles r = new Rectangles();
		r.draws();
		r.paint();
		System.out.println(OilPainting.cube(3));

	}
}

interface Drawable  {

	// Interface declaration: by first user

	void draws();

	// Since Java 8, we can have method body in interface. But we need to make it
	// default method. Let's see an example:
	default void msg() {
		System.out.println("default method");
	}

}


interface OilPainting {

	// Since Java 8, we can have static method in interface. Let's see an example:
	static int cube(int x) {
		return x * x * x;
	}

	void paint();
}

interface paint{
	
}

// Implementation: by second user
class Rectangles implements Drawable, OilPainting {
	public void draws() {
		System.out.println("drawing rectangle ...");
	}

	public void paint() {
		System.out.println("Oil painting ...  ");

	}
}

class Circles implements Drawable  {

	public void draws() {
		System.out.println("drawing circle");
	}

	
}
