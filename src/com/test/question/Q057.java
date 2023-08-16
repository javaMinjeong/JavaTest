package com.test.question;

public class Q057 {

	public static void main(String[] args) {

		/*
			요구사항]
			1 ~ 10: 55
			1 ~ (10 + 10) : sum
			1부터 10씩 증가하는 수의 합을 누적하여 구하라
			
			1. 사용 변수 선언
				> int end > 10의 배수
				> int sum > 누적 변수
			2. 최대 100까지의 합이 10부터 반복되므로, print출력물 10번 반복하는 반복문 생성
			3. 각 10의배수별 합을 누적하여 더해야 하므로 이중 반복문 생성	
			
			
		*/
		
		int end = 10;
		int sum = 0;
		
	
		while (end <=100) {
			
			for (int i=1; i<=end; i++) {
				sum+=i;
			}
			System.out.printf("1 ~ %3d: %4d\n", end, sum);
			sum = 0;
			end = end + 10;
		}
		
	}//main

}
