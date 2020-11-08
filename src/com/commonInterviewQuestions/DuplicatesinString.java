package com.commonInterviewQuestions;
//WAP to find count of duplicate words

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicatesinString {

	public static void main(String[] args) {
//
//		System.out.println("Enter the string :");
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
		String input = "java is java java";

		/* split the words */
		String[] words = input.split(" ");

		/* create HashMap class object(LinkedHashMap if we want preserve order) */

		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		
		/*add all words in a Map*/
		/*if word is already present in map then increment its value by 1*/
		/*or else just put 1 in its value*/
		
		for(String str: words) {
			
			if(wordMap.get(str)!=null) {   //if word is already exist
				wordMap.put(str, wordMap.get(str)+1);
			}
			else {
				wordMap.put(str, 1);
			}
		}
		
		/*convert map into key set*/
		
		Set<String> str2 = wordMap.keySet();
		
		/*iterate one by one and print the duplicate count*/
		for(String str:str2) {
			
			if(wordMap.get(str)>1) {
				System.out.println("words : "+str+ " repeated "+wordMap.get(str)+ " times ");
			}
		}
		

	}

}
