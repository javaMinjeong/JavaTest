package com.test.question;

import java.util.Scanner;

public class Q049 {

	public static void main(String[] args) {

		/*
			요구사항]
			행의 갯수를 입력 받고
			해당 행의 개수만큼 별의 갯수 입력 및
			1행까지 내려갈수록 별의 갯수는 1개씩 줄어듬
			
			1. 사용 변수 선언
				>입력받을 행의 갯수: int row
			2. 행의 갯수를 입력받아
				> scanner 생성
				> 입력 받은 변수 row = scan.nextInt();
			3. 루프 생성
				> 외부 루프: 행의 갯수 row개만큼 반복(시작값: 1, 끝값: row)
				> 내부 루프
					>공백 (시작값: 0, 끝값: row-(row-1)
					>별 -1 반복(시작값: row, 끝값: row-(row-1))
			3. 값 출력
				각 내부 루프마다 print(" "); 및 print("*"); 출력
				외부 루프 내 입력이 끝나면 행 변경을 위해 println(); 출력
			
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int row = 0;
		
		System.out.print("행: ");
		row = scan.nextInt();
		
		for (int i=1; i<=row; i++) {
			
			//공백 반복
			for (int j=0; j<=row; j++) {
				System.out.print(" ");
			}
			//별 반복
			for (int j=1; j<=row; j++) {
				System.out.println("*");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		for (int i=column; i>0; i--) {
//			for (int j=0; j<column-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j=0; j<1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
	}

}
