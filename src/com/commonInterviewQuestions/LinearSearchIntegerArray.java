package com.commonInterviewQuestions;

//WAP to search an element in an array using linear search(integer)

public class LinearSearchIntegerArray {

	public static void main(String[] args) {
		
		int[] a= {10, 20, 30, 40};
		
		int search_ele= 100;
		boolean flag= false;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==search_ele ) {
				System.out.println("Element found at "+i+"th position");
			flag= true;
			}
		}
		if (flag==false) {
			System.out.println("Element not found");
		}

	}

}
