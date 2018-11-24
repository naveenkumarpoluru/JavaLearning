package day4;

public class StaticKeyWord {

	// Global static variable
	public static int q = 200;
	static String name = "poonam";

	// Global non-static variable
	public int p = 100;
	String name1 = "Pradyumna";

	public static void main(String[] args) {
		StaticKeyWord s = new StaticKeyWord();
//		System.out.println(s.p);
		System.out.println(s.name1);
		System.out.println(name);
		s.students("aravinda");
		students1("Poonam");
	}
	
	
	public  void students(String name) {
		System.out.println("Name: "+name);
	}

	public static void students1(String name) {
		System.out.println("Name: "+name);
	}
}
