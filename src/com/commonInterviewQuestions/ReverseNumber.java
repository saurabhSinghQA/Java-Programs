package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to reverse a number 

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to be reversed : ");
		int num = sc.nextInt();
		
		int rev= 0;
		
		while(num!=0){
		  int n= num%10;
		  rev= rev*10 +n;
		  num = num/10;
		}
		System.out.println("Reverse number is "+ rev);
	

	}

}
