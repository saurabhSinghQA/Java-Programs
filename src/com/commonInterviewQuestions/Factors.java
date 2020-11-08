package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to find the factors of a given number
//10 = 1, 2, 5, 10  ---> factors are those which can be completely divided by the given number

public class Factors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <=num; i++) {
			
			if (num%i==0) {
				System.out.print(i+ " ");
				
			}
			
		}

	}

}
