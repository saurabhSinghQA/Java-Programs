package com.commonInterviewQuestions;

import java.util.Scanner;

// WAP to calculate the power of a number
//2^3=8;
// 3^4= 81  //3 is base and 4 is exponent 

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = sc.nextInt();
		System.out.println("Enter the exponent");
		int exponent = sc.nextInt();
		
//		long Result=1;
//		
//		while(exponent!=0) {
//			Result= Result*base;
//			--exponent;
//		}
		System.out.println("Your power is  " + Math.pow(base, exponent));

	}

}
