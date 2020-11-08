package com.commonInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

//WAP to sort array in ascending and descending order using built-in methods.

public class SortingArrayUsingBuiltinMethods {

	public static void main(String[] args) {

		// approach1
//		int[] a= {10,30,50,40,20};
//		System.out.println("Array before sorting "+Arrays.toString(a));
//		
//		Arrays.parallelSort(a);
//		System.out.println("Array After sorting "+Arrays.toString(a));
//		

		// approach2
//		int[] a= {10,30,50,40,20};
//		System.out.println("Array before sorting "+Arrays.toString(a));
//		
//		Arrays.sort(a);
//		System.out.println("Array After sorting "+Arrays.toString(a));
//		

		// descending order(using Integer wrapper class)
		Integer[] a = { 10, 30, 50, 40, 20 };
		System.out.println("Array before sorting " + Arrays.toString(a));

		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array After sorting " + Arrays.toString(a));

	}

}
