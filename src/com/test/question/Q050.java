package com.test.question;

import java.util.Scanner;

public class Q050 {

	public static void main(String[] args) {

		/*
			요구사항]
			행의 갯수 입력받아 출력
			- 별은 누적값 + 1 반복(시작값: 1, 최종값: row)
			- 공백은 누적값 - 1 반복(시작값: row -1, 최종값: 0)
			
			1. 사용 변수 선언
				> int row
			2. 행의 갯수 입력받아
				> scanner 생성
				> 입력 받은 변수 row = scan.nextInt();
			3. 루프 생성
				> 공백 루프 생성
				> 별 루프 생성
			4. 값 출력
				> 공백 루프 내 print(" ")
				> 별 루프 내 print("*")
				> 외부 루프 내 각 행 구분해줄 println() 추가
			
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int row = 0;
		
		System.out.print("행: ");
		row = scan.nextInt();
		
		//row개수만큼 행 만들기
		for (int i=1; i<=row; i++) {
			//1. 공백 출력
			for (int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			//2. 별 출력
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}//main

}//팀원 이견 없이 동일 코드 작성
