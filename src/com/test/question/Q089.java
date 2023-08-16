package com.test.question;

import java.util.Scanner;

public class Q089 {

	public static void main(String[] args) {
		
		/*
			요구사항
			입력받은 금액을 한글로 출력하시오.
			
			조건..
			입력 범위(원): 0 ~ 99,999,999
			입력..
			금액(원): 120 
			
			출력..
			일금 일백이십원
			입력..
			금액(원): 53216 
			
			출력..
			일금 오만삼천이백일십육원
			입력..
			금액(원): 12345678 
			
			출력..
			일금 일천이백삼십사만오천육백칠십팔원

		  
		 */
		
		//1. 사용할 변수 선언 및 초기화 > String으로 받아 charAt 사용
		String price = "";
		char c = ' ';
		String result = "";
		
		//2. 금액을 입력받아
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액(원): ");
		price = scan.nextLine();
		
//		for (int i=0; i<price.length(); i++) {
//			c = price.charAt(i);
//			if (price.length())
//			
//			result += "십"
//		}
//		
		
		
	}//main

	private static String getKorean(char c) {
		
		if (c == '1') {
			return "일";
		} else if (c == '2') {
			return "이";
		} else if (c == '3') {
			return "삼";
		} else if (c == '4') {
			return "사";
		} else if (c == '5') {
			return "오";
		} else if (c == '6') {
			return "육";
		} else if (c == '7') {
			return "칠";
		} else if (c == '8') {
			return "팔";
		} else if (c == '9') {
			return "구";
		} 
		
		return "";
		
	}//getKorean
	
	
	
	
}//class
