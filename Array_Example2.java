package day8;

public class Array_Example2 {

	public static void main(String[] args) {

		String aa = "Abhi";
		String bb = "Poonam";
		String cc = "Avi";
		String dd = "Pradyumna";

		// String Array

		String[] str = new String[5];
		str[0] = "Abhi";
		str[1] = "Poonam";
		str[2] = "Avi";
		str[3] = "Pradyumna";
		str[4] = "Jay";
		// str[5] = "Ankush";

		System.out.println("String Compare: "+ str[2].equals("Arv"));
		System.err.println("String Lower to Upper case: " + str[3].toUpperCase());
	//	System.err.print( str[3].toUpperCase());
		
		System.out.println("String count: "+str.length);
		
		for(int i=0; i<str.length;i++) {
			System.out.println("Printing all the obj in the string array :"+str[i]);
		}
		
		for (String string : str) {
			System.out.println(string);
		}

		// Int array

		int[] intArray = new int[5];
		intArray[0] = 2;
		intArray[1] = 22;
		intArray[2] = 222;
		intArray[3] = 232;
		intArray[4] = 224;
		
		
		for (int i : intArray) {
			++i;
			System.out.println(i);
		}

		// Char array

		char[] c = new char[4];
		c[0] = 'a';
		c[2] = 'b';
		c[1] = 'c';
		c[3] = 'f';

		for (char d : c) {
			System.out.println(d);
		}
	}

}
