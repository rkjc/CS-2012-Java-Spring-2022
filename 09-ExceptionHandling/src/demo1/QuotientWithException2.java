package demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuotientWithException2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		int[] myNum = { 10, 20, 30, 40 };

		try {
			
			System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));

			System.out.println(myNum[5]);

		} catch (ArithmeticException ex) {
			System.out.println(ex);
			System.out.println("Exception: an integer " + "cannot be divided by zero ");
		}

		System.out.println("Execution continues ...");
		// do other stuff
	}
}
