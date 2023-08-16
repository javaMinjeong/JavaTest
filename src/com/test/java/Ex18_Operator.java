package com.test.java;

import java.util.Scanner;

public class Ex18_Operator {

	public static void main(String[] args) {

		//요구사항] 사용자로부터 문자 1개 입력 > 영소문자인지 검사?
		//		 > 유효성 검사(Validation)
		
		//1. 스캐너 생성하기 > 사용자로부터 입력 받음
		//2. 안내 메시지 출력
		//3. 문자 입력
		//4. 영어 소문자 검사(어떻게 검사? > 문자코드값 사용)
		//5. 결과 출력
		
		Scanner scan = new Scanner(System.in); //1. 스캐너 생성 + import
		System.out.print("문자: "); //2. 안내 메시지 출력
		String input = scan.nextLine(); //글자 하나만 받는게 없어서 문장 값을 받아야 함.
		
		//입력한 문자의 문자코드값?
		//scanner는 입력한 값을 바로 문자코드로 얻어오는 게 없으므로!
		//참조형 <-> 값형간에는 casting이 안되므로 (int)input 형변환은 불가!!!
		//그럼 뭐해야 해요? > 아래처럼 해야해요. char는 int로 형변환이 가능하기 때문에~
		System.out.println((int)input.charAt(0)); //좌측 문장 의미: 0이 첫번째 글자를 의미. 빼온 첫번째 글자를 char로 반환하라!
		
		//-----------------------
		//A(65) ~ Z(90)
		//a(97) ~ z(122)
		//0(48) ~ 9(57)
		//가(44032) ~ 힣(55203)
		
		//한글
		//1. 완성형 한글 > 가, 강, 곽, 갑..
		//2. 조합형 한글 > ㄱ, ㄴ.. 초성, 중성.. > 현재는 존재하지않음..ㅠㅠ
		//------------------------
		
		int code = (int)input.charAt(0);
		System.out.println(code >= 97 && code <= 122); //좌측의 범위 안에 속하면 소문자! -> 값을 true, false 반환
		
		System.out.printf("입력한 문자 '%c'는 소문자가 %s\n"
							, code
							, (code >= 97 && code <= 122) ? "맞습니다." : "아닙니다.");
		
		
		//---------------------------------------
		
		System.out.println(code >= 97 && code <= 122); //숫자는 기억하기 힘드니까 조금더 알아보기 쉽게 표현하는 방법!
		//윗줄보다 아랫줄이 Best
		System.out.println(code >= (int)'a' && code <= (int)'z');
		
		//char는 숫자 자료형이기 때문에
		//int >= char (암시적 자료형 변환)
		//윗줄보다 아랫줄이 Best
		System.out.println(code >= 'a' && code <= 'z');
		
		
		
		
	}

}
