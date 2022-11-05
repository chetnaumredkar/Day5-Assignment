package com.bridgelabz;

public class LargestAmongThree {
	public static void main(String[] args) {
		int a = 12;
		int b = 13;
		int c = 1;
		if (a > b && a > c) {
			System.out.println("THe largest number is " + a);
		} else if (b > a && b > c) {
			System.out.println("THe largest number is " + b);
		} else {
			System.out.println("THe largest number is " + c);
		}
	}
}
