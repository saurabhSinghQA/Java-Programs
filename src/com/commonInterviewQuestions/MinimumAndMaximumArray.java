package com.commonInterviewQuestions;

//WAP to find min and max element from an array

public class MinimumAndMaximumArray {

	public static void main(String[] args) {
		
//		int[] a = {10, 20 , 30, 40, 60};
//		
//		int max= a[0];
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			if(a[i]>max) {
//				max= a[i];
//			}
//		}
//		System.out.println("The maximum element is "+ max);

          int[] a = {10, 20 , 30, 40, 60};
		
		int min= a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<min) {
				min= a[i];
			}
		}
		System.out.println("The minimum element is "+ min);

	}

}
