package com.commonInterviewQuestions;

//WAP to find ascii value of a character

public class AsciiCharacter {

	public static void main(String[] args) {
		char c= 'a';
		int ascii= c; //first way
		
		int asciiNum = (int)c;
		System.out.println(asciiNum); //by typecasting
		
		System.out.println(ascii);
		 

	}

}
