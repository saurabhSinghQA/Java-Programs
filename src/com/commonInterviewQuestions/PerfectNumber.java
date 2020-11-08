package com.commonInterviewQuestions;
//WAP to check whether number is perfect number or not
//example : 6 = 1+2+3   (sum of factorials of a number is equal to the number)
//        : 28= 1+2+4+7+14

public class PerfectNumber {

	public static void main(String[] args) {
		int n = 28;
		boolean b= isPerfect(n);
		if(b) 
			System.out.println("its a perfect number");
		else
			System.out.println("its not");
		

	}
	
	public static boolean isPerfect(int n) {
		int sum=0;
		for (int i = 1; i <= n/2; i++) {
			if(n%i==0)
			sum= sum+i;
			
		}
		if(n==sum)
			return true;
		
		return false;
		
		
	}

}
