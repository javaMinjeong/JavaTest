package com.test.question;

import java.util.Scanner;

public class Q086 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			숫자를 입력받아 3자리마다 ,를 붙이시오.
			
			조건)
			printf("%,d") 사용 금지
			
		
		*/
		
		//스캐너 생성 및 임포트
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 선언 및 초기화
		String num = "";
		String result = "";
		
		//숫자를 입력받아
		System.out.print("숫자: ");
		num = scan.nextLine();
		
		//입력받은 숫자가 1000 이상인 경우 
		
		//for (int i=num.length(); i>0)
		
		
		
		

//		아래 풀이는 오류 있음 ㅠㅠ!
//		if (num.length() % 3 == 0) {
//			for (int i=0; i<num.length()/3; i++) {
//				System.out.print(num.substring(i,i+3));
//				System.out.print(",");
//			}
//			System.out.print("\b");
//			
//		} else if (num.length() % 3 == 1) {
//			System.out.print(num.substring(0, 1));
//			System.out.print(",");
//			
//			for (int i=0; i<num.length()/3; i++) {
//				System.out.print(num.substring(i+1,i+4));
//				System.out.print(",");
//			}
//			System.out.print("\b");
//			
//		} else if (num.length() % 3 == 2) {
//			System.out.print(num.substring(0, 2));
//			System.out.print(",");
//			
//			for (int i=0; i<num.length()/3; i++) {
//				System.out.print(num.substring(i+2,i+5));
//				System.out.print(",");
//			}
//			System.out.print("\b");
//		}
		
		
		
		
		
		
	}//main
}
