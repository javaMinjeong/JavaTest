package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {

		/*
			요구사항]
			아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
			
			구해야 할 값
			: 딸 tick - 아빠 tick
			1. 입력 > scanner
			2. 변수 선언 및 초기화
				> dadYear, ~
				> daughterYear, ~
		
			3. 출력
				> gap = 딸틱 - 아빠틱 > 반대로 안하게 주의!
				>printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n", gap / 1000 / 60 / 60 / 24)
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int dadYear = 0;
		int dadMonth = 0;
		int dadDate = 0;
		int daughterYear = 0;
		int daughterMonth = 0;
		int daughterDate = 0;
		long dadTick = 0;
		long daughterTick = 0;
		long gap = 0;
		
		System.out.print("아빠 생일(년): ");
		dadYear = scan.nextInt();
		
		System.out.print("아빠 생일(월): ");
		dadMonth = scan.nextInt();
		
		System.out.print("아빠 생일(일): ");
		dadDate = scan.nextInt();
		
		System.out.print("딸 생일(년): ");
		daughterYear = scan.nextInt();
		
		System.out.print("딸 생일(월): ");
		daughterMonth = scan.nextInt();
		
		System.out.print("딸 생일(일): ");
		daughterDate = scan.nextInt();
		
		Calendar now = Calendar.getInstance();
		now.set(Calendar.YEAR, dadYear);
		now.set(Calendar.MONTH, dadMonth);
		now.set(Calendar.DATE, dadDate);
		
		dadTick = now.getTimeInMillis();
		
		now.set(Calendar.YEAR, daughterYear);
		now.set(Calendar.MONTH, daughterMonth);
		now.set(Calendar.DATE, daughterDate);
		
		daughterTick = now.getTimeInMillis();
		
		gap = daughterTick - dadTick;
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n", gap / 1000 / 60 / 60 / 24);
		
	}

}
