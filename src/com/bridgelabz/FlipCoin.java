package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		float t;
		int countT = 0, countH = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of times to flip coin");
		t = obj.nextInt();
		for (int i = 0; i < t; i++) {
			if (Math.random() < 0.5) {
				System.out.println("Tails");
				countT++;
			} else {
				System.out.println("Head");
				countH++;
			}
		}
		System.out.println("tail count" + countT);
		System.out.println("head count" + countH);
		double percentage = countT / t;
		System.out.println("Percentage of Tail is" + percentage * 100);
		System.out.println("percentage of Head" + (1 - percentage) * 100);
	}
}
