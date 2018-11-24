package day6;

import java.io.IOException;
import java.util.Scanner;

public class Streams {

	public static void main(String[] args) throws IOException {

		/*
		 * Let's see the code to print output and error message to the console.
		 */
		System.out.println("simple message");
		 
		System.err.println(" error message");

		/*
		 * Let's see the code to get input from console.
		 */
		Scanner sc =  new Scanner(System.in);
		String text = sc.nextLine();
		System.out.println(text);
		int i = System.in.read();// returns ASCII code of 1st character
		System.out.println((char) i);// will print the character
	}

}
