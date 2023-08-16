package com.test.question;

public class Q053 {

	public static void main(String[] args) {

		/*
		 	요구사항]
		 	구구단 출력
		 	- n x 1 = n*1 > (n+1) x 1 = (n+1)*1 > ...
		 	
		 	1. 사용 변수 선언
		 	2. 루프 생성
		 		> 윗덩어리 > 앞 값 +1
		 
		 */
		
		//행 만들어주기
		for (int i=1; i<=9; i++) {
			
			for (int j=2; j<=i; j++) {
				System.out.printf("%d x %d = %d", j, i, j*i);
			}
			System.out.println();
			
		}
		
		
		
	}

}
