package com.test.question;

import java.util.Scanner;

public class Q013 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
			----------
			1. 입력 > scanner
			2. 사용할 변수 선언 및 초기화
			3. 입력 문구 출력
			
			1. 메소드 선언 > String test(int ~~) > 값 반환, 인자 O
			2. 메소드 내 매개변수 이용하여 반환할 값 작성
			
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String result = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.print("국어: ");
		kor = scan.nextInt();
		
		System.out.print("영어: ");
		eng = scan.nextInt();
		
		System.out.println("수학: ");
		math = scan.nextInt();
		
		result = test(kor, eng, math);
		System.out.printf("%s입니다.\n", result);
	}
	
	
	public static String test(int kor, int eng, int math) {
		
		int avg = 0;
		String result = "";
		
		avg = (kor + eng + math) / 3;
		
		result = avg >= 60 ? "합격" : "불합격";
		result = (kor < 40 || eng < 40 || math < 40) ? "불합격" : result;
		return result;
		
		
	}
	
		
	
	
	
	
}
