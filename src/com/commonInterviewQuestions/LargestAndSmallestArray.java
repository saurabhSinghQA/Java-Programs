package com.commonInterviewQuestions;
//WAP to find largest and smallest number in a given array 

public class LargestAndSmallestArray {

	public static void main(String[] args) {

		int number[] = { -9 ,-10, -20, 30, 40, 50 ,51};

		int largest = number[0];
		int smallest = number[0]; /* initializing with first array */

		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			} else if (number[i] < smallest) {
				smallest = number[i];
			}

		}
		System.out.println("largest number is --: "+largest);
		System.out.println("smallest number is--: "+smallest);

	}

}
