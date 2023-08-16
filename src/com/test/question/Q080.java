package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			문장을 입력받아 역순으로 출력하시오.
			
			문장을 입력받아, 길이 계산
			0 ~ sentense.length-1까지 charAt(i)로 각 문자를 받아서
			출력할때 역순으로 charAt(sentense.length-1)부터 ~ charAt(0)까지 출력해준다.
			
			Procedure]
			1. 사용 변수 선언
			2. 문장을 입력받아
			3. 문장 문자열을 -> 문자로 받아서
			4. 역순으로 출력하기
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String sentense = "";
		
		System.out.print("문장 입력: ");
		sentense = scan.nextLine();
		
//		//문자열의 길이를 출력 ex)금요일입니다.(7)
//		System.out.println(sentense.length());
//		
//		//동일한 코드가 반복되니 for문에 넣기
//		for (int i=0; i<sentense.length(); i++) {
//			System.out.print(sentense.charAt(i));
//		}
//		
		
		System.out.print("역순 결과: \"");
		for (int i=sentense.length()-1; i>=0; i--) {
			System.out.print(sentense.charAt(i));
		}
		System.out.print("\"");
		
		
		
	}
}
