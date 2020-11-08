package com.commonInterviewQuestions;

//WAp to find even and odd numbers from an array

public class EvenandOddArray {

	public static void main(String[] args) {
		
		int[] a ={1,2,3,4,5,6};
		
		System.out.println("Even numbers are--->");
		
		for(int value: a) {
			if(value%2==0)
				System.out.println(value);
		}
		
	System.out.println("Odd numbers are--->");
		
		for(int value: a) {
			if(value%2!=0)
				System.out.println(value);
		}

	}

}
