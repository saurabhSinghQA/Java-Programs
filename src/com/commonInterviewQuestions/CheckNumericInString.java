package com.commonInterviewQuestions;

//WAP to check that given String only contains digits

public class CheckNumericInString {

	public static void main(String[] args) {
		System.out.println(isNumeric(null));
		System.out.println(isNumeric(""));
		System.out.println(isNumeric(" "));
		System.out.println(isNumeric("test123"));
		System.out.println(isNumeric("1230"));

	}
   
	/*this method verifies null and blank values*/
	public static boolean isEmpty(CharSequence cs) {

		return cs == null || cs.length() == 0;
	}
   
	/* this method will verify alphanumeric and the digits String*/
	public static boolean isNumeric(CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}

		int len = cs.length();
		for (int i = 0; i < len; i++) {
			if (!Character.isDigit(cs.charAt(i))) {   //isDigit method return true if character is digit
				return false;
			}

		}
		return true;
	

	}
	
	

}
