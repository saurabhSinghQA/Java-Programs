package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to find prime numbers between two intervals

public class PrimeNumberIntervals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		 System.out.println("Enter first interval number");
		 int low = sc.nextInt();
		 System.out.println("Enter last  interval number");
		 int high= sc.nextInt();
		
		 while(low<high) {
			int temp=0; 
		 for (int i = 2; i < low-1; i++) {
			 
			 if(low% i==0) {
				 temp = temp+1;
			 }
			
		}
		 
		 if(temp==0) {
			 System.out.println(low+ " ");
		 }
		 
		 low++;
		 }
	}

	}

	