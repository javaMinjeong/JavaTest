package com.test.question;

public class Q073 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			아래와 같이 출력하시오.
			
			(0,0) (0,1) (0,2) (0,3) (0,4)
			(1,0) (1,1) (1,2) (1,3)
			(2,0) (2,1) (2,2)
			(3,0) (3,1)
			(4,0)
		
			1. 사용 변수 선언 및 초기화
				> int n = 1;
			2. 배열 생성
				> int [5][5]
			3. for문 루프 사용하여 해당 인덱스에 값 넣어주기
				> 값이 없는 인덱스는 자동 0으로 초기화
			4. 출력 메소드 생성
			5. 메소드 호출하여 출력
		*/
		
		
		//사용 변수 선언 및 초기화
		int n = 1;
		
		//배열 생성
		int[][] list = new int[5][5];
		
		//for문 루프 사용하여 해당 인덱스에 값 넣어주기
		//외부 for문은 0부터 시작하여 1씩 증가 i<list.length
		//내부 for문은 0부터 시작하여 1씩 증가하나, j<list[0].length-i
		for (int i=0; i<list.length; i++) {
			for (int j=0; j<list[0].length-i; j++) {
				list[i][j] = n;
				n++;
			}
		}
		
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
		
		
		
	}//printArray
	
}//class
