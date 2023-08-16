package com.test.question;

public class Q018 {

	public static void main(String[] args) {

		/*
		 	요구사항]
		 	인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		 	-----------------
		 	1. 메소드 생성 > 반환 O , 인자 O
		 	2. 사용할 변수 선언 및 초기화
		 		> int count
		 		> int num1 ~ num5
		 	3. 반환할 값 식 작성
		 		>count = num1 >= 0 ? 1 : 0
		 		>return count;
		 	4. 출력 및 호출..?
		 		>count = positive(10);
		 		>printf("양수: %d개", count)
		 	5. 메소드 오버로딩 5개
		 */
		
		int count = 0;
		count = positive(10);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d개\n", count);
	
	}//main

	public static int positive(int num1) {
		
		int count = 0;
		count = num1 >= 0 ? 1 : 0;
		return count;
		
	}
	
	public static int positive(int num1, int num2) {
		
		int count = 0;
		count = (num1 >= 0 ? 1 : 0)
				+ (num2 >= 0 ? 1 : 0);
		return count;
	}
	
	public static int positive(int num1, int num2, int num3) {
		
		int count = 0;
		count = (num1 >= 0 ? 1 : 0)
				+ (num2 >= 0 ? 1 : 0)
				+ (num3 >= 0 ? 1 : 0);
		return count;
	}
	
	public static int positive(int num1, int num2, int num3, int num4) {
		
		int count = 0;
		count = (num1 >= 0 ? 1 : 0)
				+ (num2 >= 0 ? 1 : 0)
				+ (num3 >= 0 ? 1 : 0)
				+ (num4 >= 0 ? 1 : 0);
		return count;
	}
	
	public static int positive(int num1, int num2, int num3, int num4, int num5) {
		
		int count = 0;
		count = (num1 >= 0 ? 1 : 0)
				+ (num2 >= 0 ? 1 : 0)
				+ (num3 >= 0 ? 1 : 0)
				+ (num4 >= 0 ? 1 : 0)
				+ (num5 >= 0 ? 1 : 0);
		return count;
	}
	
	
}//class
