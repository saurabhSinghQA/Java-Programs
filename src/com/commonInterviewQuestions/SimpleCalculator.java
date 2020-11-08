package com.commonInterviewQuestions;

import java.util.Scanner;

//wAP to design a simple calculator by using switch case
public class SimpleCalculator {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number : ");
		double first = sc.nextDouble();
		
		System.out.println("Enter the second number : ");
		double second = sc.nextDouble();
		
		System.out.println("enter the operator (+,-,*,/)");
		 char operator = sc.next().charAt(0);
		 
		 double result= 0;
		 
		 switch (operator) {
		case '+':
			result= first+ second;
			
			break;
		case '-':
			result= first- second;
			
			break;

		case '*':
			result= first*second;
			
			break;

		case '/':
			result= first/second;
			
			break;


		default:
			System.out.println("invalid operator");
			break;
		}
		 if(operator=='+' || operator=='-' || operator=='*' || operator=='/') {
		 System.out.println(result);
	}
		
		
		
		
		
		

	}

}
