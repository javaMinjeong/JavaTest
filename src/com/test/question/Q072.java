package com.test.question;

public class Q072 {

	public static void main(String[] args) {
		
		/*
		요구사항]
		아래와 같이 출력
		
		(0,0) (1,0) (2,0) (3,0) (4,0)
		(0,1) (1,1) (2,1) (3,1) (4,1)
		...
		
		1. 사용 변수 선언 및 초기화
		2. 배열 생성
		3. for문 루트 > i는 1씩 증가하고
					> j는 i가 1증가할때 0그대로
					> list[i][j]쓸 때 순서를 바꿔주면 되겠다!
		4. 출력 메소드 생성
		5. 메소드 호출 > 값 출력
	
		 */
		
		//사용 변수 선언 및 초기화
		int n = 1;
		
		//배열 생성
		int[][] list = new int[5][5];
		
		//for문 루트 생성 list[j][i]로 변경
		for (int i=0; i<list.length; i++) {
			for (int j=0; j<list[0].length; j++) {
				list[j][i] = n;
				n++;
			}
		}
		
		//출력 메소드 호출 > 값 출력
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
//팀원 이견 없이 i와 j와 위치를 바꾸는것이 핵심!
