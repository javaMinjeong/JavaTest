package com.test.question;

import java.util.Scanner;

public class Q012 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			숫자를 전달하면 '짝수' 혹은 '홀수'라는 단어를 반환하는 메소드를 선언하시오.
			
			1. 입력 > scanner 생성
			2. 사용할 변수 선언 및 초기화
			3. 입력 문구 요청 > print
			4. 입력받은 값 메소드 매개변수로 들어감
			5. 메소드 선언
			6. 매개변수 사용하여 반환할 식 작성
			7. 반환
			8. 출력
		*/
		
		Scanner scan = new Scanner(System.in);
				
		String result = "";
		int n = 0;
		
		System.out.print("숫자: ");
		n = scan.nextInt();
			
		result = getNumber(n);
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		
		
	}//main
	
	public static String getNumber(int n) {
		
		String result = n % 2 == 0 ? "짝수" : "홀수";
		return result;
		
	}
	
}
