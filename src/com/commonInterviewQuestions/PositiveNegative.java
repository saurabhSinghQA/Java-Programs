package com.commonInterviewQuestions;

//wap to check whether a number is positive or negative

public class PositiveNegative {

	public static void main(String[] args) {
		
		double number = 100;
		
		if(number<0.0) {
			System.out.println("its a negative number");
		}
		else if (number>0.0) {
			System.out.println("its a positive number");
		}
		else {
			System.out.println("its a zero");
		}

	}

}
