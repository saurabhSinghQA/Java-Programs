package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to count even and odd digits in a number

public class EvenandOddCount {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int even_count=0;
		int odd_count= 0;
		
		while(num>0) {
			int rem= num%10;
			if (rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
		
		System.out.println("number of even digits:"+even_count);
		System.out.println("number of even digits: "+odd_count);
		
		

	}

}
