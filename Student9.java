package day4;

//Program of changing the common property of all objects(static field). 
// Program for static method
public class Student9 {

	int rollno;
	String name;
	static String college = "ITS";

	static void change() {
		college = "BBDIT";
	}

	Student9(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		Student9.change();

		Student9 s1 = new Student9(111, "Pradyumna");
		Student9 s2 = new Student9(222, "Aravinda");
		Student9 s3 = new Student9(333, "Poonam");

		s1.display();
		s2.display();
		s3.display();
	}
}
