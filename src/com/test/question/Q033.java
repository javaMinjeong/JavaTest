package com.test.question;

import java.util.Scanner;

public class Q033 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int year = 0;
		String result = "";
		
		System.out.print("년도 입력: ");
		year = scan.nextInt();
		
		if (year % 4 == 0) {
			
			if (year % 100 == 0) {
				
				if (year % 400 == 0) {
					result = "윤년";
				} else {
					result = "평년";
				}
				
			} else {
				result = "윤년";
			}
			
		} else {
			result = "평년";
		}
		
		System.out.printf("%d년은 '%s'입니다.\n", year, result);
		
	}

}
