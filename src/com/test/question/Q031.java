package com.test.question;

import java.util.Scanner;

public class Q031 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int odd = 0;
		int even = 0;
		
		System.out.print("숫자 입력: ");
		n1 = scan.nextInt();
		
		System.out.print("숫자 입력: ");
		n2 = scan.nextInt();
		
		System.out.print("숫자 입력: ");
		n3 = scan.nextInt();
		
		System.out.print("숫자 입력: ");
		n4 = scan.nextInt();

		System.out.print("숫자 입력: ");
		n5 = scan.nextInt();
	
		if (n1 % 2 == 0) {
			even = even + 1;
		} else {
			odd = odd + 1;
		}
		
		if (n2 % 2 == 0) {
			even = even + 1;
		} else {
			odd = odd + 1;
		}
		
		if (n3 % 2 == 0) {
			even = even + 1;
		} else {
			odd = odd + 1;
		}
		if (n4 % 2 == 0) {
			even = even + 1;
		} else {
			odd = odd + 1;
		}
		
		if (n5 % 2 == 0) {
			even = even + 1;
		} else {
			odd = odd + 1;
		}
		
		if (even > odd)	{
			System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.", even, odd);
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", even - odd);
		} else {
			System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.", even, odd);
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd - even);
			
		}
		
		
	}//main

}//class