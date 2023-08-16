package com.test.java.calendar;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		//일정 불러오기
		// - item.txt > Data.list
		Data.load();
		
		//- 새패키지 > "com.test.java.calendar"
		//- 파일 > "Main.java" > 달력 출력
		// 	    > "Item.java" > 일정(상자)
		//		> "Data.java" > 일정 처리(읽기)
		//- 	JavaTest > data > "item.txt"
		
		//달력 + 일정 출력
		
		//달력
		//1. 년월 > 1일 > 요일?
		//2. 년월 > 마지막 날짜?
		
		int year = 2023;
		int month = 8;
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1); //2023-08-01
		
		int lastDate = c.getActualMaximum(Calendar.DATE); //마지막 날짜
		int firstDay = c.get(Calendar.DAY_OF_WEEK); //1일의 요일(3)
		
		//System.out.println(lastDate); //31
		//System.out.println(firstDay); //3
		
		
		System.out.println("\t\t\t" + month + "월");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		
		//System.out.print("\t\t");
		//tap을 몇번 쳐야 하느냐? > 1일이 무슨 요일이냐에 따라 tap의 개수가 달라짐. 요일에 해당하는 숫자 -1이 tap의 개수
		
		//tap loop
		for (int i=0; i<firstDay-1; i++) {
			System.out.print("\t");
		}
		
		//loop 변수 == 날짜
		//1일을 화요일로 이동
		//토요일마다 println 내려줘야함!
		for (int i=1; i<=lastDate; i++) {
			System.out.printf("%3d\t",i);
			
			//8월의 토요일은 7로 나눴을 때 나머지가 5 > 단, 하단의 주석달린 조건은 매 달 달라짐. 고정 상수로 넣어버린 '5'가 잘못됨!
			//if (i % 7 == 5) {
			if ((i + firstDay) % 7 == 1) {
				System.out.println();
				
				//일정 출력 (날짜를 찍고, 해당 날짜가 배열안에 있는 날짜와 일치하는지 검사 필요)
				// - 위에 출력된 날짜와 동일한 날짜의 일정이 있는지 확인 > 루프
				//컬렉션을 탐색하는 루프
//				for (int j=0; j<Data.list.size(); j++) {
//					if (Data.list.get(j).getDate()
//							.equals(String.format("%d-%02d-%02d", year, month, i))) {
//						System.out.println(Data.list.get(j).getTitle());
//					}
//				}
				
				//현재 출력되는 날짜의 한 주
				for (int j=i+1-7; j<i+8-7 && j<=lastDate; j++) {
					System.out.printf("%s\t"
										, getItem(String.format("%d-%02d-%02d", year, month, j)));
				}
				System.out.println();
				System.out.println();
				
			}
		}//for
		
		
	}//main

	private static Object getItem(String date) {

		for (Item item : Data.list) {
			if (item.getDate().equals(date)) {
				return item.getTitle();
			}
		}
		
		return "";
	}
}//class
