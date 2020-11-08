package com.commonInterviewQuestions;

public class ReverseParticularString {

	public static void main(String[] args) {
		
		String s= " i love java";
		
		String[] ch = s.split(" ");
		
		String rev= "";
		
		for(String w:ch) {
			
			if(w.equals("java")) {
				StringBuffer sb = new StringBuffer(w);
				sb.reverse();
				rev= rev + sb.toString()+" ";
			}
			
		}
		System.out.println("i love "+ rev);

	}

}
