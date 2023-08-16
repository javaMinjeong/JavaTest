package com.test.question;

public class Q074 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			아래와 같이 출력하시오.
			
			            (0,2)
			      (1,1) (1,2) (1,3)
			(2,0) (2,1) (2,2) (2,3) (2,4)
			
			      (3,1) (3,2) (3,3)
			            (4,2)
		
			1. 사용 변수 선언 및 초기화
			2. 배열 생성 int[5][5]
			3. for문 루프 활용하여 윗덩어리 완성
			4. for문 루프 활용하여 아랫덩어리 완성
			5. 출력 메소드 생성
			6. 메소드 호출하여 출력
		
		*/
		
		//사용 변수 선언 및 초기화
		int n = 1;
		
		//배열 생성
		int[][] list = new int[5][5];
		
		//for문 루프 활용하여 윗덩어리 완성
//		for (int i=0; i<list.length/2+1; i++) {
//			for (int j=2-i; j<=2+i; j++) {
//				list[i][j] = n;
//				n++;
//			}
//		}
//		
//		for (int i=3; i<list.length; i++) {
//			for (int j=i-2; j<=6-i; j++) {
//				list[i][j] = n;
//				n++;
//			}
//		}
//		
		
//코드 추가하기!!
//for문에 해당 배열의 위치가 증가하는 규칙을 반영하기!!
//해당 배열에 원하는 값이 올 수 있도록 계산 필요!!
//상수가 아닌 i,j 변수를 활용하여 코드 작성할 수 있도록!
		
		
		
		
		
		
		
		
		//TODO 이것좀 다시 풀어보렴
//		for (int i=0; i<list.length-2; i++) {
//			for (int j=0; j<list[0].length; j++) {
//				if (i==0 && j==2) {
//					list[i][j] = n;
//					n++;
//				} else {
//					return;
//				}
//				
//				if (i == 1 && j<4) {
//					list[i][j] = n;
//					n++;
//				} else {
//					return;
//				}
//				list[i][j] = n;
//				n++;
//			}
//		}
//		
//		//?????????????????????????????????//
		
		
		
		
		
		
		//출력 메소드 호출
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
