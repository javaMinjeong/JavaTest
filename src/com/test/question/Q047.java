package com.test.question;

import java.util.Scanner;

public class Q047 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int price = 0;
		int num = 0;
		int input = 0;
		
		System.out.println("====================");
		System.out.println("        자판기");
		System.out.println("====================");
		System.out.println("1. 콜라 : 700원");
		System.out.println("2. 사이다 : 600원");
		System.out.println("3. 비타500 : 500원");
		System.out.println("--------------------");
		
		System.out.print("금액 투입(원) : ");
		input = scan.nextInt();
		
		System.out.println("--------------------");
		System.out.print("음료 선택(번호) : ");
		num = scan.nextInt();
		
		//TODO 하는중입니당
		switch (num) {
			case 1: 
			price = 700;
			break;
			
			case 2:
			price = 600;
			break;
			
			case 3:
			price = 500;
			break;
		}
		
		
	}//main


}
