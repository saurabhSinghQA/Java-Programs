package com.commonInterviewQuestions;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
	
		Random num= new Random();
		for (int i = 0; i <=10; i++) {
			int rNum = num.nextInt(100);
			System.out.println(rNum);

		}
		
	}

}
