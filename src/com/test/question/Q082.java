package com.test.question;

import java.util.Scanner;

public class Q082 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
			
			1. 사용 변수 선언
			2. 입력한 숫자를 각각 한자리씩 찢어서
			3. 연산 후(char로 찢어서 int로 casting?)
			4. 출력하기
		
		*/
		
		//입력받을 스캐너 생성 및 임포트
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 선언 > 숫자를 입력받아 찢어야 하니 String
		String num = "";
		String result = "";
		int sum = 0;
		
		//숫자를 입력받자
		System.out.print("숫자: ");
		num = scan.nextLine();
		
		
		//입력받은 각 자리를 찢기
		//찢고 합한 누적 변수 sum
		//찢은글자를 +와 합쳐서 누적시킬 result 사용
		for (int i=0; i<num.length(); i++) {
			sum += Integer.parseInt(num.substring(i,i+1));
			result += num.charAt(i);
			if (i < num.length()-1) {
				result += "+";
			}
			
		}
	
		System.out.printf("결과: %s = %d\n", result, sum);
		
		
	}
	
}
