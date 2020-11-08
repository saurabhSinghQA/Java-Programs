package com.commonInterviewQuestions;

//WAP to find  sum of natural numbers using Recursion

public class NaturalNumberRecursion {

	public static void main(String[] args) {
		//int num =5;
		int sum = addUp(2);
		System.out.println(sum);

	}
	
	public static int addUp(int num) {
		
		if (num!=0) {
			return num + addUp(num-1);
		}
		else {
			return num;
		}
	}

}
