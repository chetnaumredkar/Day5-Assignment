package com.bridgelabz;

import java.util.Scanner;

public class AlphabetCheck {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = obj.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Character is Vowel ");
		} else {
			System.out.println("Character is Consonant");
		}

	}
}
