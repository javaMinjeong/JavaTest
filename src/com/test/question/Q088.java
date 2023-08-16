package com.test.question;

import java.util.Scanner;

public class Q088 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			금지어 마스킹 처리
			
			조건) 금지어
			- 바보
			- 멍청이
		
		
		*/
		
		//scanner 생성 및 import
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 생성
		String txt = "";
		int sum = 0;
		
		//입력받기
		System.out.print("입력: ");
		txt = scan.nextLine();
		
		if (txt.contains("바보")) {
			txt = txt.replace("바보", "**");
			sum++;
		}
		
		if (txt.contains("멍청이")) {
			txt = txt.replace("멍청이", "***");
			sum++;
		}
		System.out.println(txt);
		System.out.printf("금지어를 %d회 마스킹했습니다.\n", sum);
		
		
		
		
		
	}

}
