package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the dividend and divisor");
		double dividend = obj.nextDouble();
		double divisor = obj.nextDouble();
		double quotient = (dividend / divisor);
		double remainder = dividend % divisor;
		System.out.println("The quotient is" + quotient);
		System.out.println("The remainder is" + remainder);

	}
}
