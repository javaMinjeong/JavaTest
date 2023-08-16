package com.test.question;

import java.util.Scanner;

public class Q026 {

	public static void main(String[] args) {

		/*
			요구사항]
			학생의 국어 점수를 입력받아 성적을 출력하시오.
			-----------------
			if score >= 0 && score <= 100
				(score >= 90)
				(score >= 80)
				(score >= 70)
				(score >= 60)
				(score >= 0)
			else "점수가 올바르지 않습니다.~~"
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		char grade = 0;
		
		System.out.print("점수: ");
		score = scan.nextInt();
		
		if (score >= 0 && score <= 100) {
			
			if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else if (score >= 0) {
				grade = 'F';
			} 
			
			System.out.printf("입력한 %d점은 성적 %c입니다.", score, grade);
			
			
		} else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}
		
		
	}

}
