package com.test.question;

import java.util.Scanner;

public class Q076 {

	public static void main(String[] args) {
		
		//TODO 푸시오!!
		
		/*
		  
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String[][] score = new String [10][3];
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.print("국어 점수: ");
		kor = scan.nextInt();
		
		System.out.print("영어 점수: ");
		eng = scan.nextInt();
		
		System.out.print("수학 점수: ");
		math = scan.nextInt();
		
		for (int i=0; i<score.length; i++) {
			
			if (kor >= (i+1) * 10) {
				score[i][0] = "■";
			}
			if (eng >= (i+1) * 10) {
				score[i][1] = "■";
			}
			if (math >= (i+1) * 10) {
				score[i][2] = "■";
			}
			
		}
		
		
		for (int i=score.length-1; i>=0; i--) {
			for (int j=0; j<score[0].length; j++) {
				System.out.print(" " + score[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------");
		System.out.println("국어\t영어\t수학");
		
	}//main
	
	
}//class

//i변수가 증가함에 따라 10을 곱하여 네모를 추가하는 접근 방식과, 세로로 j와 i를 바꿔 접근하여 코드를 작성하는 방법이 있었다.
//출력값의 사이는 \t을 사용하여 깔끔하게 출력 가능!
