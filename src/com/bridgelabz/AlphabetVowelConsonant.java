package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To Check Whether an Alphabet is Vowel or Consonant
 */
public class AlphabetVowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a alphabet to check whether it is vowel or consonant: ");
		char ch = sc.next().charAt(0);
		
		/**
		 * Checking whether the entered alphabet is a vowel or consonant
		 */

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		{
			System.out.println("Alphabet " + ch + " is a Vowel");
		} else {
			System.out.println("Alphabet " + ch + " is a Consonant");
		}
		sc.close();

	}

}


