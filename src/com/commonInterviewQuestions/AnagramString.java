package com.commonInterviewQuestions;

import java.util.Arrays;

//WAP to check the string is anagram of another string.
//two strings are anagram if they contain same characters in different order.

public class AnagramString {

	public static void main(String[] args) {
		 String s1= "guava";
		String s2 = "avaj";
		
		System.out.println(checkAnagram(s1, s2));

	}

	public static boolean checkAnagram(String s1, String s2) {

		char[] arrayofString1 = s1.toCharArray();
		char[] arrayofString2 = s2.toCharArray();
		
		Arrays.sort(arrayofString1);
		Arrays.sort(arrayofString2);

		return Arrays.equals(arrayofString1,arrayofString2 );

	}

}
