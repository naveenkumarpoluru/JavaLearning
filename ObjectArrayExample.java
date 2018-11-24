package day8;

public class ObjectArrayExample {

	public static void main(String[] args) {

								// Initialize the memory
		Object[] obj = new Object[4];
		
		obj[0]="Name";
		obj[1]=22;
		obj[2]=2333333333l;
		obj[3]=22.22f;
		
		for (Object object : obj) {
			System.out.println(object);
		}
		
	}

}
