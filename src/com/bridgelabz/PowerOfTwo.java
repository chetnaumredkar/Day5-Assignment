package com.bridgelabz;

import java.util.Scanner;
public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n between 0 to 31 :");
		double n=obj.nextInt();
		double result=1;int base=2;
		for(double i=n;i!=0;i--) {
		result=result*base;
		System.out.println("2 to the power of "+i+"is :"+result);
		}
	}

}
