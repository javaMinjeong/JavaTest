package com.test.question;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			지하철 탑승 소요시간 구하라.
			지나가는 역의 개수, 환승역의 횟수, 시간대를 전달받아 총 걸리는 시간을 반환하는 메소드 선언하시오.
			
			----------------------
			
			1. 입력 > scanner
			2. 사용할 변수 선언 및 초기화 > station, change, time, result
			3. 입력 문구 출력 > print
			4. 입력 받은 문구 변수로 치환
			5. 메소드 선언 > 총 걸리는 시간 반환 > return 값
			6. 반환할 값 식 작성
			7. 값 반환
			8. 반환된 값 출력
			
		
		
		*/
		Scanner scan = new Scanner(System.in);
		
		int station = 0;
		int change = 0;
		int time = 0;
		int result = 0;
		
		System.out.print("역의 개수: ");
		station = scan.nextInt();
		
		System.out.print("환승역의 횟수: ");
		change = scan.nextInt();
		
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		time = scan.nextInt();
		
		result = getTime(station, change, time);
		System.out.printf("총 소요 시간은 %d분입니다.", result);
		
	}
	
	public static int getTime(int station, int change, int time) {
		
		int result = 0;
		result = station * 2  + change * (time == 1 ? 3 : time == 2 ? 4 : 5);
		return result;
		
		
		
	}
}
