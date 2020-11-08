package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to find largest among three numbers

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number : ");
		int x = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int y = sc.nextInt();
		
		System.out.println("Enter the third number : ");
		int z= sc.nextInt();
		
		
//		if(x>y && x>z) {
//			System.out.println("first number is greater");
//		}
//		else if (y>z) {
//			System.out.println("second number is greatest");
//		}
//		else {
//			System.out.println(" third number is greater");
//		
//		}
		
		//2nd approach using ternary operator
		
		int largest= (x>y?x:y)>z?(x>y?x:y):z;
		System.out.println(largest + " is a largest");
		
		
	
		

	}

}
