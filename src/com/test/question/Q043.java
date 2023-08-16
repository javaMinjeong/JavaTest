package com.test.question;

import java.util.Scanner;

public class Q043 {

	public static void main(String[] args) {

		/*
			요구사항]
			컴퓨터가 1~10사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램 구현
			- 시도 횟수가 10회가 넘어가면 프로그램 종료.
			 >for (int i=1, i<=10, i++) {
			 		print("숫자: ")
			 		num = scan.nextInt();
			 			if (num == 
			 	}
			  if (
			  
			--난수 생성 > 컴퓨터가 생각한 숫자 > random
			
		
		*/
		
		int num = 0;
		int random = 0;
		
		Scanner scan = new Scanner(System.in);
		
		random = (int)(Math.random() * 10);
		System.out.println(random);
		
		for (int i=1; i<=10; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			 
		}
		
		
	}//main

}
