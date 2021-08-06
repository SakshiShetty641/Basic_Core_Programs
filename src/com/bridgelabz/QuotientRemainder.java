package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To compute the quotient and remainder
 */
public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Dividend: ");
		int dividend = sc.nextInt();
		System.out.println("Enter the value of Divisor: ");
		int divisor = sc.nextInt();
		int quotient = dividend / divisor; // To obtain quotient
		int remainder = dividend % divisor; // To obtain remainder
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
		sc.close();
	}
}
