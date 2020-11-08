package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to add two numbers

public class AddTwoNumbers {

	public static void main(String[] args) {
//		int a= 10;
//		int b= 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a= sc.nextInt();
		
		System.out.println("enter Second number");
		int b= sc.nextInt();
		
		int sum = a+b;
		
		System.out.println("Addition is "+sum);

	}

}
