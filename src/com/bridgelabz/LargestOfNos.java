package com.bridgelabz;
import java.util.Scanner;

/**
 * @author Sakshi Shetty
 * Purpose - To print the largest of three numbers
 */
public class LargestOfNos {
	public static void main(String[] args) {
		int a, b, c, largest, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter the third number:");
		c = sc.nextInt();
		/**
		 * Using a ternary operator to find largest of three numbers
		 */
		temp = a > b ? a : b;
		largest = c > temp ? c : temp;
		System.out.println("The largest number is: " + largest); 
		sc.close();
		
	}
}

