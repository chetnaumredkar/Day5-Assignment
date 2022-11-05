package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		int var1;
		Scanner s = new Scanner(System.in);
		System.out.println("Input the Year in YYYY format ");
		var1 = s.nextInt();

		if (((var1 % 4 == 0) && (var1 % 100 != 0)) || (var1 % 400 == 0)) {
			System.out.println("This is leap year");
		} else
			System.out.println("this is not a Leap year");
	}
}
