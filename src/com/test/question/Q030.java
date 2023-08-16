package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {

		/*
		 	요구사항]
		 	영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
		 	
		 	- 유효성 검사(영문자만 입력 가능 > 문자코드 사용하여 nested if문)
		 	--------------------
		 	1. 입력 scanner 작성
		 	2. 사용 변수 선언 > char letter
		 	3. 입력 문구 출력 
		 	4. 조건식 작성
		 		> a ~ z (97 ~ 122)
		 		> A ~ Z (65 ~ 90) **주의 중간에 91~96 제외해야함
		 		> 32 차이
		 		> 유효성 검사: "영문자만 입력하시오."
		 */
		
		Scanner scan = new Scanner(System.in);
		
		char letter = 0;
		
		System.out.print("문자: ");
		letter = scan.nextLine().charAt(0);
		
		if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
			
			if (letter >= 65 && letter <= 90) {
				System.out.printf("'%c'의 소문자는 '%c'입니다.\n", letter, letter + 32);
			} else {
				System.out.printf("'%c'의 대문자는 '%c'입니다.\n", letter, letter - 32);
			}
			
		} else {
			System.out.println("영문자만 입력하시오.");
		}
		
		
	}

}
