package day4;

public class ParmConstructor {
	int id;
	String name;

	ParmConstructor(int i, String n) {
		id = i;
		name = n;
	//	System.out.println(id + " " + name);
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		ParmConstructor s1 = new ParmConstructor(111, "Pradymna");
		ParmConstructor s2 = new ParmConstructor(222, "Poonam");
		s1.display();
		s2.display();
	}
}
