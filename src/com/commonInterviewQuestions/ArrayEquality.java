package com.commonInterviewQuestions;

import java.util.Arrays;

//WAP to check the two arrays are equal or not

public class ArrayEquality {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5,6};
         int[] a2= {1,2,3,4,5,6};
         
//         boolean flag = true;
//         
//         if(a1.length==a2.length) {
//        	 
//        	 for (int i = 0; i < a1.length; i++) {
//				if(a1[i]!=a2[i]) {
//					flag= false;
//				}
//			}
//         }
//         else {
//        	 flag= false;
//         }
//         if(flag==true) {
//        	 System.out.println("Arrays are equal");
//         }else {
//        	 System.out.println("Arrays are NOT equal");
//         }
	    
         //approach2
         boolean flag = Arrays.equals(a1, a2);
         
         if (flag==true) {
        	 System.out.println("Arrays are equal");
			
		}
         else {
        	 System.out.println("Arrays are not equal");
         }
         
	}

}
