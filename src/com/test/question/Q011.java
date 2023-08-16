package com.test.question;

import java.util.Scanner;

public class Q011 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			- 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
			--------------------------
			1. 입력 > scanner 생성
			2. 사용할 변수 선언 및 초기화
				>int n1, int n2, String result
			3. 메소드 선언
			4. 매개변수 이용 메소드 작성
				> int result = n1 + n2
				> printf("%d + %d = %d\n", n1, n2, result)
			5. 값 반환
			6. 반환값 프린트
		*/
		Scanner scan = new Scanner(System.in);
				
		int n1 = 0;
		int n2 = 0;
		String result = "";
		
		System.out.print("첫번째 숫자: ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		n2 = scan.nextInt();
				
		result = add(n1, n2); 
		System.out.println(result);

		result = subtract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);

		result = divide(n1, n2);
		System.out.println(result);

		result = mod(n1, n2);
		System.out.println(result);
		
		
	}//main
	
	public static String add(int n1, int n2) {
	
		int result = 0;
		String output = "";
		
		result = n1 + n2;
		output = n1 + " + " + n2 + " = " + result;
		return output;
		
	}
	
	public static String subtract(int n1, int n2) {
		
		int result = 0;
		String output = "";
		
		result = n1 - n2;
		output = n1 + " - " + n2 + " = " + result;
		return output;
	}
	
	public static String multiply(int n1, int n2) {
		
		int result = 0;
		String output = "";
		
		result = n1 * n2;
		output = n1 + " * " + n2 + " = " + result;
		return output;
		
	}
	
	public static String divide(int n1, int n2) {
		
		double result = 0;
		String output = "";
		
		result = (double)n1 / n2;
		output = n1 + " / " + n2 + " = " + result;
		return output;
	}
	
	public static String mod(int n1, int n2) {
		
		int result = 0;
		String output = "";
		
		result = n1 % n2;
		output = n1 + " % " + n2 + " = " + result;
		return output;
	}
}
