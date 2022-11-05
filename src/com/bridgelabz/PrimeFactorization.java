package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactorization {
	public void PrimeFact() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int temp = 0;
		int n = obj.nextInt();
		for (int div = 2; div * div <= n; div++) {
			while (n % div == 0) {
				n = n / div;
				System.out.println(div);
			}
		}
		if (n != 1) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		PrimeFactorization obj = new PrimeFactorization();
		obj.PrimeFact();
	}
}