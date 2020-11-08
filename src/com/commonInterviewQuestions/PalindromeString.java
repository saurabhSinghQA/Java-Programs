package com.commonInterviewQuestions;
//WAP to check if String is palindrome or not
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		
		String oStr= str;
		
		 int len = str.length();
		  //System.out.println(len);
		  
		  String rev= "";
		  
		  for (int i = len-1; i >=0; i--) {
			rev= rev+str.charAt(i);
		}
		  System.out.println(rev);
		  
		  if(oStr.equalsIgnoreCase(rev)) {
			  System.out.println("its a palindrome string");
		  }
		  else {
			  System.out.println("not a palindrome");
		  }
		  

	}

}
