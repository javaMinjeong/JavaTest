package com.test.question;

public class Q017 {

	public static void main(String[] args) {

		/*
			요구사항]
			인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
			-----------------
			1. 메소드 4개 선언 > return값은 없지만, 문자 인자는 있는
			2. 매개변수 사용하여 식 작성
				매개변수 String n1, n2, n3, n4
				String result: ? > 이거 필요 없는듯
				printf("사원: %s\n", n1)
			3. 메소드 호출
			
		*/
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
			
	}

	public static void position(String n1) {
		
		System.out.printf("사원: %s\n\n", n1);
	}
	
	public static void position(String n1, String n2) {
		
		System.out.printf("사원: %s\n대리: %s\n\n", n1, n2);
	}
	
	public static void position(String n1, String n2, String n3) {
		
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n\n", n1, n2, n3);
	}
	
	public static void position(String n1, String n2, String n3, String n4) {
		
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n부장: %s\n\n", n1, n2, n3, n4);
	}
	
	
	
}
