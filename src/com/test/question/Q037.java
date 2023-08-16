package com.test.question;

import java.util.Scanner;

public class Q037 {

	public static void main(String[] args) {

		/*
			요구사항]
			숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.
			
			1. 사용 변수 선언
				> int num
				> 입력한 숫자까지의 합 > 누적변수 int sum
			2. 숫자 입력 받아 > scanner 생성
				> int num = scan.nextInt();
			3. 1부터 입력한 숫자까지의 합 출력 > 누적 변수
				> for (int i=1; i<=num; i++) {
					sum += i }
				  printf("%d ~ %d = %d\n", i, num, sum)
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		System.out.print("숫자: ");
		num = scan.nextInt();
		
		for (int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.printf("1 ~ %d = %d\n", num, sum);
		
	}

}
