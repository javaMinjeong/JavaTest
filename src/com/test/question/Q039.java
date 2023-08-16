package com.test.question;

import java.util.Scanner;

public class Q039 {

	public static void main(String[] args) {

		/*
			요구사항]
			아래와 같이 출력하시오.
			시작숫자 + 연산자 ~~~연산과정 = 누적 합
			
			1. 사용 변수 선언
				> int start
				> int end
				> int sum
			2. 시작 숫자, 종료 숫자 입력받아 > scanner
				> start = nextInt();
				> end = nextInt();
			3. 출력
				> start 숫자에서 end 까지 반복
				> for문 사용
					> 
		
		
		*/
		
//		Scanner scan = new Scanner(System.in);
//		
//		int start = 0;
//		int end = 0;
//		int sum = 0;
//		
//		System.out.print("시작 숫자: ");
//		start = scan.nextInt();
//		
//		System.out.print("종료 숫자: ");
//		end = scan.nextInt();
//		
//		for (int i=start; i<=end; i++) {
//			System.out.print(i + " + ");
//			sum += i;
//				if (i == end) {
//					System.out.print("\b\b= ");
//					System.out.print(sum + "\n");
//				}
//		}
		
		Scanner scan = new Scanner(System.in);
		
		int start = 0;
		int end = 0;
		int sum = 0;
		
		System.out.print("시작 숫자: ");
		start = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		end = scan.nextInt();
		
		for (int i=start; i<=end; i++) {
			System.out.print(i);
			sum += i;
				if (i == end) {
					System.out.print(" = " + sum);
					break;
				}
			System.out.print(" + ");
		}
		
		
	}//main

}
