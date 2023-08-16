package com.test.question;

import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {
		
		/*
		
			요구사항]
			- 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
			
			조건]
			- 대문자와 소문자의 문자 코드값의 관계
			
			입력]
			- 문자 입력: a
			
			출력]
			소문자 'a'의 대문자는 'A'입니다.
			------
			입력]
			- 문자 입력: g
			
			출력]
			소문자 'g'의 대문자는 'G'입니다.
			-----------------------------------
			1. 입력 > scanner 생성
			2. 사용할 변수 선언 및 초기화 > String smallLetter, int largeLetter > data type char or String?
			3. 입력 문구 출력 > print
			4. 연산
				> largeLetter = smallLetter - 32
				> smallLetter는 연산을 해야 하니 문자 숫자값->문자코드값. Stirng -> int
				> largeLetter도 int 숫자값->문자코드값
				> 출력하면서 문자코드값을 character로 보여줘야 함.(char)largeLetter
			5. 출력 > printf('%s' '%s', smallLetter, (char)largeLetter
		*/
		
		
			Scanner scan = new Scanner(System.in);
			
			//사용할 변수 선언 및 초기화
			int largeLetter = 0;
			String smallLetter = "";
			
			//입력 문구 출력
			System.out.print("문자 입력: ");
			smallLetter = scan.nextLine();
			System.out.println((int)(smallLetter).charAt(0)); //입력한 소문자의 문자코드값 반
			
			largeLetter = (int)smallLetter.charAt(0) - 32;
			
			//출력
			System.out.printf("소문자 '%s'의 대문자는 '%s'입니다.", smallLetter, (char)largeLetter);
			
			
			
			
		
		
		
	}
	
	
}
