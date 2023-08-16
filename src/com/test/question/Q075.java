package com.test.question;

public class Q075 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			아래와 같이 출력하시오.
			
			(0,0) (0,1) (0,2) (0,3) > (0,4)
			(1,0) (1,1) (1,2) (1,3) > (1,4)
			(2,0) (2,1) (2,2) (2,3) > (2,4)
			(3,0) (3,1) (3,2) (3,3) > (3,4)
			(4,0) (4,1) (4,2) (4,3) > (4,4)
		
		
			1. 사용 변수 선언 및 초기화
			2. 배열 생성 > new int[5][5]
			3.for문 루프
				> i=0; i<list.length; i++
				> j=0; j<list[0].length; j++
						list[i][j] = n;
						sum += n
						n++;
				> 내부 for문 if문 제어
					if (j==list[0].length-1)
						list[i][j] += sum
				> 외부 for문 if문 제어
			4. 출력 메소드 생성
			5. 메소드 호출하여 출력
			
		*/
		
		//사용 변수 선언 및 초기화
		int n = 1;
		int sum = 0;
		int sum2 = 0;
		
		//배열 생성
		int[][] list = new int[5][5];
		
		//for문 루프
		
		//TODO -0- 아래꺼 안댐.
//		for (int i=0; i<list.length; i++) {
//			
//			
//			for (int j=0; j<list[0].length; j++) {
//				if (j==list[0].length-1) {
//					list[i][j] += sum;
//				} else {
//					list[i][j] = n;
//					sum += n;
//					n++;
//				}
//				if (i==list.length-1) {
//					list[i][j] += sum;
//				}	
//				
//			}
//			sum = 0;
//			
//		}
		
		
		
		
		
		
		
		
		//위에거 해보고 안되면 아래거에서 수정해서 하기
//		for (int i=0; i<list.length; i++) {
//			for (int j=0; j<list[0].length; j++) {
//				if (j==list[0].length-1) {
//					list[i][j] += sum;
//				} else {
//					list[i][j] = n;
//					sum += n;
//					n++;
//				}
//			}
//			sum = 0;
//		}	
		
		for (int i=0; i<list.length; i++) {
			for (int j=0; j<list[0].length; j++) {
				if (j==list[0].length-1) {
					list[i][j] += sum;
				} else {
					list[i][j] = n;
					sum += n;
					n++;
				}
				if (i == list.length-1) {
					for (int k=0; k<list.length; k++) {
						for (int l=i; l<list[0].length; j++) {
							list[i][j] += sum2;
						}
					}
				}
			}
			sum = 0;
		}	
			
		
		
		
		
		
		//출력 메소드 호출하여 출력
		printArray(list);
		
		
		
		
	}//main

	private static void printArray(int[][] list) {

		for (int i=0; i<list.length; i++) {
			for (int j=0; j<list[0].length; j++) {
				System.out.printf("%5d", list[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
}//class
