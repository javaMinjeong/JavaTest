package com.test.question;

import java.util.Scanner;

public class Q090 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String sentense = "";
		int sum = 0;
		char c = ' ';
		
		System.out.print("입력: ");
		sentense = scan.nextLine();
		
		for (int i=0; i<sentense.length(); i++) {
			c = sentense.charAt(i);
		//	System.out.println((int)c);
			if (c >= '0' && c <= '9') {
				sum += c-48; //char 0은 int 48
			}
		}
		
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.\n", sum);
	
	}//main
}//class
