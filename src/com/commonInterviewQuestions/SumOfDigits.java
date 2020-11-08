package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to count sum of digits in a number

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int sum=0;
		
		while(num>0) {
			int rem=num%10;
			sum= sum+rem;
			num=num/10;
		}
		
		System.out.println("Sum of digits is "+sum);

	}

}
