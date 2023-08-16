package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		
		/*
		 	요구사항]
		 	- 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		 
		 	조건]
		 	- 사각형 넓이 = 너비 * 높이
		 	- 사각형 둘레 = 너비 * 2 + 높이 * 2
		 	
		 	입력]
		 	- 너비(㎝): 20
		 	- 높이(㎝): 10
		 	
		 	출력]
		 	사각형의 넓이는 200㎠입니다.
		 	사각형의 둘레는 60㎝입니다.
		 	------------------------
		 	1. 입력 > scanner 생성
		 	2. 사용할 변수 선언 및 초기화 > area, perimeter, width, length
		 	3. 입력 받을 문구 출력 > print
		 	4. 조건식 만들기
		 		> 넓이 = 너비 * 높이
		 		> 둘레 = 너비 * 2 + 높이 * 2
		 	5. 출력 > printf
		 
		 */
		
		//입력 > scanner 생성
		Scanner scan = new Scanner(System.in);
		
		//사용할 변수 선언 및 초기화
		int width = 0;
		int length = 0;
		int area = 0;
		int perimeter = 0;
		
		//입력 받을 문구 출력
		System.out.print("너비(㎝): ");
		width = scan.nextInt();
		
		System.out.print("높이(㎝): ");
		length = scan.nextInt();
		
		//조건식 만들기
		area = width * length;
		perimeter = width * 2 + length * 2;
		
		//출력
		System.out.printf("사각형의 넓이는 %d㎠입니다.\n",area);
		System.out.printf("사각형의 둘레는 %d㎝입니다.\n", perimeter);
			
	}
	
	
}
