package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To check if the number is odd or even
 */
public class EvenOddNos {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Declare a variable
		int num;
		System.out.println("Enter a number:");
		num = sc.nextInt();

		/**
		 * If number is divisible by 2 then it's an even number else its an odd number
		 */

		if (num % 2 == 0)
			System.out.println("The entered number is even");
		else
			System.out.println("The entered number is odd");
		sc.close();
	}

}
