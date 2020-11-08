package com.commonInterviewQuestions;
import java.util.Scanner;

//WAP to check if number is Armstrong number
// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
//370

public class ArmstrongNUmber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int actual= num;
		
		int result=0;
		
		while (actual!=0) {
          
			int n= actual%10;
			result = result+ n*n*n;
			actual = actual/10;
			
		}
		
		if (result==num) {
			System.out.println(num+ " is an armstrong number");
			
		}
		else {
			System.out.println(num+ " is not an armstrong number");
		}
		
		

	}

}
