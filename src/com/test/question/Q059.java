package com.test.question;

public class Q059 {

	public static void main(String[] args) {

		/*
			조건]
			- 마지막 숫자가 100이 넘기 전까지 출력
				> 조건식 마지막 숫자<=100
			- 각 숫자는 1+2+3+4...규칙으로 앞 숫자에 더해진 결과
			- 마지막에는 누적 합계를 구할 것
			1. 사용 변수 선언
				> int sum > 누적 합계
				> int plus > 내부 루프 누적 합계
			2. 1씩 증가할 내부 루프 생성
				> 본 루프에 나온 값을 앞 숫자에 더하는것을 반복 예정
			3. 1씩 증가한수를 앞수에 더할 루프 생성
			4. 출력 > printf
		
		*/
		
		int sum = 0;
		int plus = 0;
//		
//		for (int i=1; i<=100; i=i+plus) {
//			
//			for (int j=1; j<=10; j++) {
//				sum+=j;
//				plus = sum;
//			}
//			System.out.println(plus);
//		}
//		
		
		for (int i=1;;i++) {
			plus += i;
		}
		
		
		
	}//main

}
