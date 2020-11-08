package com.commonInterviewQuestions;

import java.util.HashSet;

//WAP to check and find duplicates elements in an array

public class DuplicateArray {

	public static void main(String[] args) {
		
		
		String arr[]= {"java", "c", "python" ,"c#", "java"};
		
		HashSet<String> hs= new HashSet();
		boolean flag=false;
		for( String var:arr) {
			if(hs.add(var)==false) {
				System.out.println("found duplicate : "+var);
				flag= true;
			}
		}
		if (flag==false) {
			System.out.println("Not any duplicate");

		}
		
	}

}
