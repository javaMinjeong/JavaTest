package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
		
			1. 입력 > scanner 생성
			2. 사용할 변수 선언 및 초기화
			3. 입력받은 변수로 add > date feild, 일수 수정
			4. printf로 출력
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		Calendar specialDay = Calendar.getInstance();
		
		String maleName = "";
		String femaleName = "";
		int year = 0;
		int month = 0;
		int date = 0;
		
		System.out.print("남자 이름: ");
		maleName = scan.nextLine();
		
		System.out.print("여자 이름: ");
		femaleName = scan.nextLine();
		
		System.out.print("만난날(년): ");
		year = scan.nextInt();
		
		System.out.print("만난날(월): ");
		month = scan.nextInt();
		
		System.out.print("만난날(일)");
		date = scan.nextInt();
		
		specialDay.set(year, month, date);
		System.out.printf("'%s'과(와) '%s'의 기념일\n", maleName, femaleName);
		
		specialDay.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n", specialDay);
		specialDay.add(Calendar.DATE, 200);
		System.out.printf("200일: %tF\n", specialDay);
		specialDay.add(Calendar.DATE, 300);
		System.out.printf("300일: %tF\n", specialDay);
		specialDay.add(Calendar.DATE, 500);
		System.out.printf("500일: %tF\n", specialDay);
		specialDay.add(Calendar.DATE, 1000);
		System.out.printf("1000일: %tF\n", specialDay);
		
	}
}
