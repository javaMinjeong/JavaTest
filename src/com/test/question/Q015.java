package com.test.question;

import java.util.Scanner;

public class Q015 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			- 사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
		
			조건]
			- int getApple(int sunny, int foggy)
			- 사과 나무를 처음 심었을 때 나무의 길이: 0m
			- 맑은 날 사과 나무의 성장률: 5㎝
			- 흐린 날 사과 나무의 성잘률: 2㎝
			- 사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
			- 1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
		
			입력]
			맑은 날: 35
			흐린 날: 10
		
			출력]
			사과가 총 9개 열렸습니다.
			--------------------------
			1. 메소드 선언 > int getApple(int sunny, int foggy)
			2. 매개변수 선언  > int result, 
			3. 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int sunny = 0;
		int foggy = 0;
		int result = 0;
		
		System.out.print("맑은 날: ");
		sunny = scan.nextInt();
		
		System.out.print("흐린 날: ");
		foggy = scan.nextInt();
		
		result = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다.\n", result);
		
	}//main
	
	public static int getApple(int sunny, int foggy) {
		
		int result = 0;
		int height = 0;
		
		height = sunny * 5 + foggy * 2;
		result = height >= 100 ? (height - 100) / 10 : 0;
				
		return result;
	}
	
}
