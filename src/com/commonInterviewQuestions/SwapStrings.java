package com.commonInterviewQuestions;

// Swap string without third variable and with third variable

public class SwapStrings {

	public static void main(String[] args) {
		
		String a= "hello";
		
		String b= "world";
		
		System.out.println("before swapping");
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);
		
		//1st way
//		String temp;
//	    temp= a;
//	    a=b;
//	    b=temp;
//	    
//	    System.out.println(" After swapping");
//		System.out.println("the value of a is "+a);
//		System.out.println("the value of b is "+b);
//	    
		
		//2nd way
		
		a= a+b; //helloworld
		
		b= a.substring(0, a.length()-b.length());
		
		a= a.substring(b.length());
		
		System.out.println("---------------");
		System.out.println("After swapping");
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);
		

	}

}
