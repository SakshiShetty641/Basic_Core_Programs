package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To swap the two numbers
 *
 */
public class SwapNumber {
	public static void main(String[] args) {
		int x, y, swap;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X and Y");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before swapping numbers: " + x + "  " + y);

		/**
		 * Swapping of two numbers taken from user
		 */
		swap = x;
		x = y;
		y = swap;
		System.out.println("After swapping: " + x + "   " + y);
		System.out.println();
		sc.close();
	}
}
