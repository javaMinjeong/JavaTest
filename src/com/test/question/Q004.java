package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		
		/*
		 	요구사항]
		 	- 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		 	
		 	조건]
		 	- ℉ = ℃ * 1.8 +32
		 	- 소수 입력 가능
		 	- 소수 이하 1자리까지 출력하시오.
		 	
		 	입력]
		 	섭씨(℃): 29
		 	
		 	출력]
		 	섭씨 29.0℃는 화씨 84.2℉입니다.
		 	--------------------
		 	1. 입력 > scanner 생성
		 	2. 사용할 변수 선언 및 초기화 > 소수 입력 가능 및 출력 > double cTemperature, fTemperature
		 	3. 입력 받을 문구 출력 > print
		 	4. 조건식
		 		> fTemperature = cTemperature * 1.8 + 32
		 	5. 출력 > printf(%.1f)
		
		*/

			//입력 > scanner 생성
			Scanner scan = new Scanner(System.in);
			
			//사용할 변수 선언 및 초기화
			double cTemperature = 0;
			double fTemperature = 0;
			
			//입력 받을 문구 출력
			System.out.print("섭씨(℃): ");
			cTemperature = scan.nextDouble();
			
			//조건식
			fTemperature = cTemperature * 1.8 + 32;
			
			//출력
			System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.\n", cTemperature, fTemperature);

		
		
	}
	
	
	
	
}
