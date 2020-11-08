package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to check if the number is palindrome or not
//121- if we reverse this number then we will get the same number... so its a pallindrome number

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rev=0;
		
		int actualNUm= num;
		
		while(num!=0) {
			int n= num%10;  //123/10= 3
			rev= rev*10+n; //3
			num= num/10;  //123/10 
		}
		//System.out.println(rev);
		
		if(actualNUm==rev) {
			System.out.println(actualNUm+ " is a palindrome");
		}
		else {
			System.out.println(actualNUm+ " is not a palindrome");
			
		}
		

	}

}
