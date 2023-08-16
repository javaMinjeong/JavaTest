package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {

		/*
			요구사항]
			입력횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
			
			1. 사용 변수 선언
				> 입력 횟수 int count
				> 입력 숫자 받을 int num
				> 짝수 개수 int even
				> 짝수 합 int evenSum
				> 홀수 개수 int odd
				> 홀수 합 int oddSum
			2. 횟수와 숫자를 입력받아 > scanner 생성
				횟수만큼 숫자 입력 반복 > for 문
			3. 짝수의 합과 홀수의 합 출력
				> 입력받은 숫자별 계산 필요하므로 for문 안 if문
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int num = 0;
		int even = 0;
		int evenSum = 0;
		int odd = 0;
		int oddSum = 0;
		
		System.out.print("입력 횟수: ");
		count = scan.nextInt();
		
		for (int i=1; i<=count; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
				if (num % 2 == 0) {
					even++;
					evenSum += num;
				} else if (num % 2 != 0) {
					odd++;
					oddSum += num;
				}
		}
		System.out.printf("짝수 %d개의 합: %d\n", even, evenSum);
		System.out.printf("홀수 %d개의 합: %d\n", odd, oddSum);
		
	}

}
