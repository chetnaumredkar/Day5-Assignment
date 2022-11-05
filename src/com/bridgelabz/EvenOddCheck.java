package com.bridgelabz;

import java.util.Scanner;

public class EvenOddCheck {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = obj.nextInt();
		if (a % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");

		}
	}
}
