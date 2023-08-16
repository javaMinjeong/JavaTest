package com.test.question;

import java.util.Scanner;

public class Q051 {

	public static void main(String[] args) {

		/*
			조건]
			행의 갯수를 입력받아 해당 행의갯수 만큼 행을 늘려가며
			시작값 1부터 별의개수 2개씩 증가
			
			- 별의 개수는 1부터 시작 ~ 2개씩 증가 > (n=1부터) 2n -1
			- 공백의 개수는 행의 갯수-1부터 시작 ~ 2개씩 감소 > (row=1부터)row -1
			
			공백 출력
			별 출력
			공백 출력의 순서
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int row = 0;
		
		System.out.print("행: ");
		row = scan.nextInt();
		
		for (int i=1; i<=row; i++) {
			
			for (int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}//공백 반복
			for (int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}//별 반복
			System.out.println();
			
		}
		
		
		
		
		
		
		
//		for (int i=1; i<=row; i++) {
//			
//			for (int j=0; j<row-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j=0; j<i*2-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		
		
		
		
		
	}//main

}
