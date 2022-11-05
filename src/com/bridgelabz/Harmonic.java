package com.bridgelabz;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = obj.nextInt();
		double sum = 0;
		if (n != 0) {
			for (double i = 1; i <= n; i++) {
				sum += (1 / i);
			}
			System.out.println("Nth harmonic value of Nth number is :" + sum);

		}
	}
}
