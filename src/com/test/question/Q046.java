package com.test.question;

import java.util.Scanner;

public class Q046 {

	public static void main(String[] args) {

		/*
			요구사항]
			숫자 10개 입력받아 한글로 변환 후 출력
			
			1. 사용 변수 선언
				> int num
				> String result(한글 이어서 출력할 결과변수)
			2. 입력 > scanner 생성
			3. 숫자 10개를 입력받아 > for문 사용
			4. 각 숫자별 한글로 변환 > method 생성
			5. 변환한 한글을 모두 합쳐야 하므로 
				result += 메소드(); 후
				for문 끝나고 마지막에 result 출력
		
		*/
		
		//TODO 나중에 한번 더 풀어보세요!
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		String result = "";
		
		for (int i=1; i<=10; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			result += getKorean(num);
		}
		System.out.println(result);
		
	}//main
	
	public static String getKorean(int num) {
		
		if (num == 1) {
			return "일";
		} else if (num == 2) {
			return "이";
		} else if (num == 3) {
			return "삼";
		} else if (num == 4) {
			return "사";
		} else if (num == 5) {
			return "오";
		} else if (num == 6) {
			return "육";
		} else if (num == 7) {
			return "칠";
		} else if (num == 8) {
			return "팔";
		} else if (num == 9) {
			return "구";
		} 
		
		return "";
		
	}//getKorean

}
