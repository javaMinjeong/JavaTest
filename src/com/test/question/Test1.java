package com.test.question;

import java.util.Scanner;

public class Test1 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int start=0;
		
		for(int i=0; ;i++) {
		
			int inputWon=0;
			int inputNum=0;
			String enter="";
			
			int m1=700;
			int m2=600;
			int m3=500;
			
			System.out.println("================");
			System.out.println("    자판기");
			System.out.println("================");
			System.out.println("1. 콜라 : 700원");
			System.out.println("2. 사이다 : 600원");
			System.out.println("3. 비타500 : 500원");
			System.out.println("----------------");
			System.out.print("금액 투입(원) : ");
			inputWon=scan.nextInt();
			System.out.print("음료 선택(번호) : ");
			inputNum=scan.nextInt();
			
			switch(inputNum) {
				case 1 : select("콜라", inputWon, m1); break;
				case 2 : select("사이다", inputWon, m2); break;
				case 3 : select("비타500", inputWon, m3); break;
				default : System.out.println("잘못 선택");
			}
			
			System.out.println("계속하시려면 엔터를 입력하세요");
			scan.nextLine();
			enter=scan.nextLine();
			continue;
			
			
		}
		
	}//main

	private static void select(String ch, int inputWon, int m1) {
		System.out.printf("+%s를 제공합니다\n",ch);
		System.out.printf("+잔돈 %d원을 제공합니다\n",inputWon-m1);
		System.out.println();
		
	}
}
