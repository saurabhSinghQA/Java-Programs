package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to check whether a number is even or odd

public class EvenOdd {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter a number");
		
		int num= sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num + " is even");
		}
		else {
			System.out.println(num + " is odd");
		}
		

	}

}
