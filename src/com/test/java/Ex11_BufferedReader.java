package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11_BufferedReader {

	public static void main(String[] args) throws Exception {
		
		//BufferedReader 클래스
		
		//Ctrl + Shift + O(영어)
		
		//int a;
		//reader > 콘솔 입력 도구
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//자료형 변수이름;
		//클래스는 자료형중 하나
		//대부분의 클래스는 바로 쓸 수 없고, 이 클래스를 제가 사용하겠습니다. 라고 선언해줘야 함! (보통 package 밑에 적음 - import 구문)
		//어느 패키지 안에 들어있는지까지 같이 써줘야 함.
		
		//System.out.println("문자 입력: ");
		
		//int code = reader.read(); //글자 하나를 입력받아 문자코드값을 돌려줌. + 한글 입력이 가능해짐!!!!
		//System.out.println(code);
		//System.out.printf("%c\n", code);
		
		
//		String line = reader.readLine();
//		System.out.println(line);
		
		//------------------------------------5교시---------------------------------------------------
		
//		System.out.print("이름 입력: ");
		
		//readLine() : 입력 버퍼에서 처음부터 ~ 엔터(\r\n)를 만나기 전까지 모두 읽어오는 메소드
		// - 엔터는 자동으로 삭제
//		String name = reader.readLine();
		
//		System.out.printf("안녕하세요. %s님\n", name);
		
		
		
		//Wrapper Class(Utility Class)
		// - 원시형 데이터를 도와주는 기능을 제공하는 클래스
		
		//byte > Byte 클래스
		//short > Short 클래스
		//int > Integer 클래스
		//long > Long 클래스
		//float > Float 클래스
		//double > Double 클래스
		//boolean > Boolean 클래스
		//char > Character 클래스
		
		
		
		
		
//		System.out.print("숫자 입력: ");
//		String num = reader.readLine(); //100 > 100을 입력해도 "100"으로 돌려줌. "문자열 100을 돌려준다!"
		
		//int num2 = Integer.parseInt(num); //"100" > 100 int type으로 변경하여 값을 돌려줌.
//		double num2 = Double.parseDouble(num);
		
//		System.out.println(num2 * 2); //"홍길동" * 2 -> 자료형의 문제. 문자열에 곱하기 연산은 안됨!
		
		
		//요구사항] 숫자 2개 입력 > + 연산 > 연산 과정과 결과를 모두 출력
		
		//숫자1: 5
		//숫자2: 3
		//5 + 3 = 8
		
//		System.out.print("첫번째 숫자: ");
//		String input1 = reader.readLine(); //문자열 "5"
		
//		System.out.print("두번째 숫자: ");
//		String input2 = reader.readLine(); //문자열 "3"
		
//		int n1 = Integer.parseInt(input1); //문자열 "5" > 숫자 5
//		int n2 = Integer.parseInt(input2); //문자열 "3" > 숫자 3
		
//		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		
		
		
		
		System.out.print("숫자: ");
		
		String input = reader.readLine();
		
		int num = Integer.parseInt(input);
		
		//java.lang.ArithmeticException: / by zero
		//피제수(나눠진수) / 제수(나뉜수)
		//제수는 0이 될 수 없다.
		System.out.println(100 / num); 
		
		
		/*
		
		
			에러, Error
			- 오류, 버그(Bug), 예외(Exception) 등..
			
			1. 컴파일 에러
				- 컴파일 작업 중에 발생하는 에러
				- 컴파일러가 발견!! (javac.exe) > 번역하다가.. > 문법이 틀려서!!
				- 발생!! > 컴파일 작업 중단 > 프로그램 생성 불가!! > 반드시 해결
				- 이클립스 연동 > 빨간 밑줄
				- 난이도 가장 낮음 > 발견이 쉽다. > 컴파일러가 알려줌 > 고치기도 쉬움.
				- 오타!!
				
			2. 런타임 에러
				- 런타임(Runtime) > 프로그램 실행 중..
				- 컴파일 작업 중에는 에러가 없음 > 실행 중에 발생하는 에러
				- 문법에는 오류가 없는데.. 다른 원인으로 발생하는 에러
				- 예외(Exception)
				- 난이도 중간 > 발견O, 발견X > 복불복(찾을 수도, 못 찾을 수도..) -> 잠재적인 에러.
				- 충분히 사전에 테스트 (시간, 돈을 들이면 됨. 많은 사람들이 다양한 작업을 하면서 테스트)
				- 게임 출시 > 클로즈드 알파, 클로즈드 베타 > 오픈 알파, 오픈 베타
			
			3. 논리 에러
				- 컴파일 성공!! + 실행 성공!! > 결과가 이상;; (최종 결과가 원하는 결과가 아닌 경우)
				- 난이도 최상 > 발견 최악 + 수정 최악
		
		
		*/

	}

}
