package com.commonInterviewQuestions;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		getFact(num);
		
		
	}
	public static void getFact(int num) {
            int fact=1;
		
		for (int i = 1; i <=num ; i++) {
			fact= fact*i;
			
		}
		System.out.println("factorial of " +num+ " is :" +fact);

		
	}

}
