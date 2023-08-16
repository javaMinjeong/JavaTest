package com.test.question;

import java.util.Scanner;

public class Q036 {

	public static void main(String[] args) {

		/*
			요구사항]
			시작 숫자, 종류 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
			----------
			1. 사용 변수 선언
				> 시작 숫자 = int start
				> 종료 숫자 = int end
				> 증감치 = int add
			2. 입력 > scanner 생성
			3. 시작, 종료, 증감치 입력받아
				> print
				> nextInt();
			4. 출력
				> for (int i=start; i<=end; i=i+add)
					println(i);	 
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int start = 0;
		int end = 0;
		int add = 0;
		
		System.out.print("시작 숫자: ");
		start = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		end = scan.nextInt();
		
		System.out.print("증감치: ");
		add = scan.nextInt();

		for (int i=start; i<=end; i=i+add) {
			System.out.println(i);
		}
		
		
	}

}
