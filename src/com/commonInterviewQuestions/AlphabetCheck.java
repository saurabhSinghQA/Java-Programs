package com.commonInterviewQuestions;

//WAP to check whether a character is Alphabet or not
public class AlphabetCheck {

	public static void main(String[] args) {
		char c = 'c';
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println(c +" is an alphabet");
		}
		else {
			System.out.println(c +" is not an alphabet");
		}

	}

}
