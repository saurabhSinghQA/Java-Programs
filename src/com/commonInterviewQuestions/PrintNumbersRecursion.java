package com.commonInterviewQuestions;
//WAP to print number from 1 to 100 without for loop
//we will use recursion concept
//recursion means method is calling itself

public class PrintNumbersRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 1;
		printNum(n);
		

	}
	
	public static void printNum(int num) {
		// check num is less than or equal to 100
		if(num<=100) {
			System.out.println(num + " ");  //print the value of num
			
	              printNum(num+1);  //increment the num by 1
		}
	}
	

}
