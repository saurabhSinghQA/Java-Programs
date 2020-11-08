package com.commonInterviewQuestions;

//WAP to reverse a string

//String does not have predefined methods because it is immutable class

public class ReverseString {

	public static void main(String[] args) {
	
 		//1st way
		String s= "Selenium world"; //muineleS
		  int len = s.length();
		  //System.out.println(len);
		  
		  String rev= "";
		  
		  for (int i = len-1; i >=0; i--) {
			rev= rev+s.charAt(i);
		}
		  System.out.println(rev);
		  
		  //2nd way
		  StringBuffer sf= new StringBuffer(s);
		  
		  System.out.println(sf.reverse());

	}

}
