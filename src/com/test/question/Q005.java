package com.test.question;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		
		/*
		
			요구사항] 
			- 자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 
			  사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
			
			조건]
			- 기어비 1:1 -> 페달 1회전 == 자전거 바퀴 1회전
			- 모든 출력 숫자는 천단위 표기하시오.
			
			입력]
			- 사용자가 페달을 밟은 횟수: 1000
			
			출력]
			사용자가 총 1,000회 페달을 밟아 자전거가 총 2,074.708m를 달렸습니다.
			------------------------------------------------------
			1. 입력 > scanner 생성
			2. 사용할 변수 선언 및 초기화 > int pedal, double result, int wheel
			3. 입력 문구 출력 > print
			4. 조건식
				> wheel(원의 둘레) = diameter(지름) * 3.14 -> 인치니까 결과값 m로 통일해줘야 함!
			5. 출력 > printf("%,d %,f, pedal, wheel\n")
			
		*/
		
			//입력 > scanner 생성
			Scanner scan = new Scanner(System.in);
			
			//사용할 변수 선언 및 초기화
			int pedal = 0;
			double wheel = 0; //자전거 바퀴 1회
			double result = 0; //페달 1회
			
			//입력 문구 출력
			System.out.print("사용자가 페달을 밟은 횟수: ");
			pedal = scan.nextInt();
			
			//조건식
			wheel = 26 * 0.0254 * 3.14; //inch to meter
			result = wheel * pedal;
			
			//출력
			System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.\n", pedal, result);
		
		
	}
}
