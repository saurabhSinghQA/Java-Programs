package com.commonInterviewQuestions;

//WAP to remove white spaces in a given string

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String s = "java is a programming language";

		// Approach 1
			//char chars[] = s.toCharArray();
		//		String str="";
		//		for (int i = 0; i < chars.length; i++) {
		//			if(chars[i]!=' ') 
		//				str= str+chars[i];
		//			
		//			
		//		}
		//		System.out.println(str);
		//		
		
		//approach2
		
		String s1= s.replaceAll(" ", "");
		System.out.println(s1);
		
		

	}

}
