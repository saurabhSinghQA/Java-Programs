package com.commonInterviewQuestions;

//WAP  to swap two numbers 

public class SwapNumbers {

	public static void main(String[] args) {
     //using third/temporary variable
		
		int a= 10;
		int b= 20;
		
//		System.out.println("before Swapping");
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		
//		System.out.println("After Swapping");
//		
//		int temp;
//		temp= a;
//		a=b;
//		b= temp;
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		
		//without temp variable
		
		System.out.println("before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("After Swapping");
		
		a= a-b;//-10
		b= a+b; //10
		a= b-a; //20
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
		
		
		
		
		

	}

}
