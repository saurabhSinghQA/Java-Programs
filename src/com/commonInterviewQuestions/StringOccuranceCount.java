package com.commonInterviewQuestions;

import java.util.Scanner;

//WAP to count occurrences of character in a sTring

public class StringOccuranceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the sentence : ");
		String s = sc.next();
		System.out.println("Enter the character: ");
		String ch = sc.next();
		sc.close();
		
		int Total_length = s.length();
		int newLength = s.replace("ch", "").length();
		
		int count= Total_length-newLength;
		
		System.out.println("Number of occurance of given character is "+count);
		

	}

}
