package day2;

import java.util.Scanner;

public class TernaryOperatorExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of number 1: ");
		int number1 = sc.nextInt();

		System.out.println("Enter the value of number 2: ");
		int number2 = sc.nextInt();

		int minimum;
		int maximum;

		minimum = (number1 < number2 ? number1 : number2);
		maximum = (number1 < number2 ? number2 : number1);

		System.out.println("Minimum: " + minimum);
		System.out.println("Maximum: " + maximum);
		sc.close();
	}

}
