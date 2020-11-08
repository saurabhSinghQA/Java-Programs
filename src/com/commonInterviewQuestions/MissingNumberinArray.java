package com.commonInterviewQuestions;

//WAP to find missing number in an array
//logic: int a[]={1,2,4,5}
//1+2+4+5=12
//1+2+3+4+5=15
//15-12= 3--> missing number

public class MissingNumberinArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5 };

		int sum = 0; // temporary variable
		for (int i = 0; i < a.length; i++) { // addition without missing number
			sum = sum + a[i];

		}
		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 5; j++) { // addition with missing number
			sum1 = sum1 + j;
		}
		System.out.println(sum1);

		System.out.println("missing number is " + (sum1 - sum));
	}

}
