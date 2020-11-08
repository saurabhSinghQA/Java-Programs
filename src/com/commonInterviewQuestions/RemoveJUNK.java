package com.commonInterviewQuestions;

//WAP to remove junk/special characters or unwanted characters from the String

public class RemoveJUNK {

	public static void main(String[] args) {
		
		
		String s= "@##$$$$ testing ##### Application";
		
		    s = s.replaceAll("[^a-zA-Z0-9]", "");
		    
		    System.out.println(s);

	}

}
