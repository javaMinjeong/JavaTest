package com.test.question;

public class Q070 {

	public static void main(String[] args) {

		/*
			요구사항]
			아래와 같이 출력하시오.
			
			출력)
			0,0	 0,1  0,2  0,3  0,4
			1,4  1,3  1,2  1,1  1,0
			2,0  2,1  2,2  2,3  2,4
			3,4  3,3  3,2  3,1  3,0
			4,0  4,1  4,2  4,3  4,4
			
			j가 +1, -1 반복
		
			0. 사용 변수 선언 및 초기화
			1. 배열 생성
			2. 루프 돌려서 배열내 값 넣어주기
			3. 루프 내 값 출력
		*/
		
		
		//2차원 배열 생성
		int[][] nums = new int[5][5];
		
		//배열에 연산한 값을 넣어줄 변수 생성
		int n = 1;
		
		//루프 돌려서 배열 내 값 넣어주기
		for (int i=0; i<nums.length; i++) {
			
			if (i % 2 == 0) {
				for (int j=0; j<nums[0].length; j++) {
					nums[i][j] = n;
					n++;
				} 
			} else {
				for (int j=nums[0].length-1; j>=0; j--) {
					nums[i][j] = n;
					n++;
				}
			}
		}
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
		
		
//짝수/홀수 나누는것은 동일하며 출력할 때 list[i][4-j]로 출력 시, 상단 for문에서 수정 없이 출력이 가능하다.	
		
		
		//TODO 답지보고 다시 익히기
		
		
		
		
		
		
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<5; j++) {
//				nums[i][j] = n;
//				
//				if (n != 4) {
//					n++;
//				} else {
//					break;
//				}
//			}
//			for (int j=4; i>=0; j--) {
//				nums[i][j] = n;
//				n++;
//			}
//			
//		}
//		
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<5; j++) {
//				System.out.printf("%5d", nums[i][j]);
//			}
//			System.out.println()	;
//		}
//		
//		int n = 1;
//		
//		int[][] nums = new int[5][3];
//		
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<3; j++) {
//				nums[i][j] = n;
//				n++;
//			}
//		}
//		//---------------
//		
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<3; j++) {
//				System.out.printf("%5d", nums[i][j]);
//			}
//			System.out.println();
//		}
		
		
	}//main

}//class
