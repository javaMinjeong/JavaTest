package com.test.question;

import java.util.Scanner;

public class Q035 {

	public static void main(String[] args) {

		/*
		 	요구사항]
		 	사용자의 이름과 인사할 횟수를 입력받아 출력하시오.
		 	
		 	1. 사용 변수 선언
		 		>String name, int count
		 	2. 이름, 횟수 입력 받아
		 		> scanner 생성
		 		> print
		 	3. 사용자 입력 횟수만큼 반복하여 출력
		 		> for (i=1; i<=count;i++)
		 	
		 				
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		int count = 0;
		
		System.out.print("이름: ");
		name = scan.nextLine();
		
		System.out.print("횟수: ");
		count = scan.nextInt();
		
		for (int i=1; i<=count; i++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}
		
	}

}
