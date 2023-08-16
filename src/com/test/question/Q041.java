package com.test.question;

public class Q041 {

	public static void main(String[] args) {

		/*
			요구사항]
			- 출력
			- 반복횟수: 모름
			- 누적값: 1000 넘어가면 루프 종료
			
			1. 사용 변수 선언 및 초기화
				> int sum = 0;
			2. 조건식 생략 > for문 루프 설정
			3. sum += i;
		
		*/
		
		int sum = 0;
		
		for (int i=1;;i++) {
			System.out.print(i);
			sum += i;
				if (sum >= 1000) {
					System.out.print(" = " + sum);
					break;
				}
			System.out.print(" + ");
		}
		
		
	}

}
