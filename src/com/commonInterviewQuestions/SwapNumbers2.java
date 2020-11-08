package com.commonInterviewQuestions;
//WAP to swap two numbers in different logics

import java.util.Scanner;

public class SwapNumbers2 {

	public static void main(String[] args) {
       
      Scanner sc = new Scanner (System.in);
       System.out.println("enter the value of A");
       int a= sc.nextInt();
       System.out.println("enter the value of B");
       int b = sc.nextInt();
       
//       int temp= a;
//       a=b;
//       b=temp;
       
//       a= a*b; //20*10=200  //this logic is only applicable for non zero values
//       b= a/b; //200/10= 20
//       a= a/b; //200/20 =10
       
       b= a+b-(a=b);
       
       System.out.println("A is "+a+ " B is "+b);
       
       
       
	}

}
