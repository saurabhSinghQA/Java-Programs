package com.commonInterviewQuestions;

//WAP to search  a string element in an array

public class LinearSearchStringArray {

	public static void main(String[] args) {
		
		String[] name= {"Tom","michael", "rita", "john"};
		String search_ele= "kate";
		boolean flag= false;
		
		for (int i = 0; i < name.length; i++) {
			
			if(name[i].equalsIgnoreCase(search_ele)) {
				System.out.println("Element found at "+i+"th position");
			flag= true;
			}
		}
		if (flag==false) {
			System.out.println("Element not found");
		}

	}

}
