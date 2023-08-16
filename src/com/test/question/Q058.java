package com.test.question;

public class Q058 {

	public static void main(String[] args) {

		/*
			1. 사용 변수 선언 > 변수 3가지
				> 1 ~ 10 > 시작값 ~ 끝값까지의 누적 합계 계산
				> int start, end
				> 1st ~ 10th까지 합을 더한 누적 변수 > sum
			2. 루프를 돌린다
			3. 공통적으로 10단위 변화 > 10단위 증가하는 내부 루프 > 누적합 구하기
			4. 결과 출력 > printf
		
		*/
		
		int start = 1;
		int end = 10;
		int sum = 0;
		
		for(int j=1; j<=10; j++) {
			
			for (int i=start; i<=end; i++) {
				//System.out.println(i);
				sum+=i;
				
			}
			System.out.printf("%2d ~ %3d: %3d\n", start, end, sum);
			sum = 0;
			start = start + 10;
			end = end + 10;
		}
		
		
		
		
		
		
		
	}//main

}
