package com.commonInterviewQuestions;

//import java.util.Scanner;

//WAP to print sum of an array

public class SumofArray {

	public static void main(String[] args) {
		
		int[] a= {5,7,9,6,2};
		
		int sum= 0;
		/*for (int i = 0; i < =a.length-1; i++) {
			
			sum= sum+a[i];
		} */
		
		for(int value:a) {
			sum= sum+value;
		}
		System.out.println("The sum of an array is "+sum);

	}

}
