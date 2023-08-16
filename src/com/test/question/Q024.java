package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {

	public static void main(String[] args) {


		/*
			뿌엥...날아가뮤ㅠㅠㅠ
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		Calendar time = Calendar.getInstance();
		int hour = 0;
		int min = 0;
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시: ");
		hour = scan.nextInt();
		
		System.out.print("분: ");
		min = scan.nextInt();
		
		time.set(Calendar.HOUR_OF_DAY, hour);
		time.set(Calendar.HOUR_OF_DAY, min);
		
		//TODO 이거 해결해
//		time.add(Calendar.MINUTE, -10);
//		System.out.println(time.get(Calendar.HOUR_OF_DAY));
//		System.out.print("짜장면: %d시 %d분", );
//		System.out.print("치킨: %d시 %d분", );
//		System.out.print("피자: %d시 %d분", );
		
		
		
	}

}
