package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex26_DateTime {

		public static void main(String[] args) {
			
				/*
				 
				 	자바 자료형
				 	1. 값형
				 		- 8가지
				 	2. 참조형
				 		- 클래스
				 			- String
				 			- 날짜시간
				 			
				 	자바 날짜/시간 자료형
				 	1. Date 클래스
				 	2. Calendar 클래스
				 	3. 추가 클래스 > JDK 1.8(2014)
				 	
				 	
				 	- 시각
				 	- 시간
				 	
				 	
				 	시각 = 시간
				 	
				 	2023년 7월 20일 오후 4시 9분 15초 > 시각
				 	8시간 수업 > 시간
				 	
				 	시각 > 점시간의 흐름 > 포인트, 점
				 	
				 	시각, 시간 > 연산하는 경우 多
				 	
				 	시각 + 시각 = X
				 	시각 - 시각 = O(시간) 결과값의자료형은 -> "시간"
				 	
				 	시간 + 시간 = O(시간) //ex) 8시간 + 2시간 = 10시간
				 	시간 - 시간 = O(시간) //ex) 8시간 - 2시간 = 6시간
				 	
				 	시각 + 시간 = O(시각) //ex) 2023년 7월 20일 16시 21분 50초 + 3시간 = 3시간 후 특정 시각
				 	시각 - 시간 = O(시각) //ex) 2023년 7월 20일 16시 21분 50초 - 3시간 = 3시간 전 특정 시각
				 				 
				*/
			
			
			//	m1();
			//	m2();
			//	m3();
			//	m4();
			//	m5(); // 2023.07.21(금) m5부터 수업!!!
			//	m6();
			//	m7();
				m8();
				
		}//main

		private static void m8() {

			//현재 시간의 tick
			Calendar now = Calendar.getInstance();
			System.out.println(now.getTimeInMillis());
			
			//전용 메소드(현재 시간의 tick을 구하는 전용 메소드)
			System.out.println(System.currentTimeMillis());
			
			
		}

		private static void m7() {

			//연산
			//- 시간 + 시간 = 시간
			//- 시간 - 시간 = 시간
			
			//점심시간: 2시간
			//Calendar a = Calendar.getInstance();
			//a.set(Calendar.HOUR, 2);
			//System.out.printf("%tF %tT\n", a, a);
			//시간을 계산할 때 위 방법 쓰면 절대 안됨!!!
			
			//점심시간: 2시간 + 1시간
			int hour = 2;
			int add = 1;
			System.out.println(hour + add);
			System.out.println();
			System.out.println();
			System.out.println();

			//2시간 30분
			hour = 2;
			int min = 30;
			
			//2시간 30분 + 10분 = 2시간 40분
			min += 10;
			System.out.printf("%d시간 %d분\n", hour, min);
			
			//2시간 40분 + 30분 = 2시간 70분 -> 3시간 10분 (자리올림을 잘하라!)
			hour = 2;
			min = 40;
			
			min += 30;
			System.out.printf("%d시간 %d분\n", hour, min); //2시간 70분
			//몫을 구하는 계산식(시 자리올림), 나머지를 구하는 계산식(분 덮어쓰기)

			hour = hour + (min / 60);
			min = min % 60;
			System.out.printf("%d시간 %d분\n", hour, min); //3시간 10분
			
		}

		private static void m6() {

			//연산
			// - 시각 - 시각 = 시간
			
			//현재
			Calendar now = Calendar.getInstance();
			
			//종강일
			Calendar end = Calendar.getInstance();
			end.set(2023, 11, 27);
			
			//- epoch time
			//tick
			long nowTick = now.getTimeInMillis();
			System.out.println(nowTick); //1,689,898,935,359ms > 이 숫자가 바로 1970.01.01 00:00:00으로부터 now까지 흐른 시간
										 //기준점부터 흘러간 시간
			
			long endTick = end.getTimeInMillis();
			System.out.println(endTick); //1,703,636,725,293ms
			
			//우리 수업 남은 시간 계산
			long gap = endTick - nowTick;
			System.out.printf("수업 남은 시간: %,d\n"
								, gap / 1000 / 60 / 60 / 24);
									 //ms -> s -> m -> h -> d
			
			//----------------------지금으로부터 크리스마스까지 남은 날 구하기
			Calendar christmas = Calendar.getInstance();
			christmas.set(2023, 11, 25);
			
			long christmasTick = christmas.getTimeInMillis();
			
			System.out.printf("올해 크리스마스는 %d일 남았습니다.\n"
							, (christmasTick - nowTick) / 1000 / 60 / 60 / 24);
			
			//----------------------생일까지 남은 날 구하기
			Calendar birthday = Calendar.getInstance();
			birthday.set(1993, 6, 18);
			long birthdayTick = birthday.getTimeInMillis();
			
			System.out.printf("살아온 년: %,d년\n"
								, (nowTick - birthdayTick) / 1000 / 60 / 60 / 24 / 365);
			//1년은 365일이 아님!! 365일로 하면 근사치는 만들어낼 수 있으나, 정확하진 않음. 여기서는 일단 365로 계산!
			System.out.printf("살아온 월: %,d월\n"
								, (nowTick - birthdayTick) / 1000 / 60 / 60 / 24 / 30);
			//여기서도 월 일단 30일로 근사치로 계산!
			System.out.printf("살아온 일: %,d일\n"
								, (nowTick - birthdayTick) / 1000 / 60 / 60 / 24);
			System.out.printf("살아온 시: %,d시\n"
								, (nowTick - birthdayTick) / 1000 / 60 / 60);
			
		}

		private static void m5() {
			
			//어제 수업 복습
			
			//현재 시각
			Calendar now = Calendar.getInstance();
			
			//읽기 + 출력
			System.out.println(now.get(Calendar.YEAR));
			System.out.printf("%tF %tA %tT\n", now, now, now);
		
			//특정 시각
			Calendar start = Calendar.getInstance();
			start.set(Calendar.HOUR_OF_DAY, 9);
			start.set(2023, 6, 14);
			System.out.printf("%tF %tA %tT\n", start, start, start);

			//시각 + 시간
			start.add(Calendar.DATE, 3);
			System.out.printf("%tF %tA %tT\n", start, start, start);
			
		}
		
		


		private static void m4() {

			//연산
			//- 시각 + 시간
			//- 시각 - 시간
			
			//오늘 만난 커플 > 100일 
			//오늘(시각) + 100일(시간) = 기념일(시각)
			
			Calendar now = Calendar.getInstance(); //캘린더로 현재 시간을 먼저 만들고
			
			System.out.printf("1일차: %tF\n", now); //사실상 이건 0일차임 이 계산법은 금일로부터 다음날이 1일차(당일 미포함)
			
			now.add(Calendar.DATE, 100);
			System.out.printf("100일차: %tF\n", now);
			
			//------------------------------
			
			//돌잔치?
			Calendar birthday = Calendar.getInstance();
			birthday.set(1997, 6, 20);
			
			birthday.add(Calendar.YEAR, 1);
			System.out.printf("돌잔치: %tF\n", birthday);
			
			//12일 전?
			//앞에서 만든 now는 100일 뒤로 고쳐서 다시 초기화 필요
			
			now = Calendar.getInstance(); //현재시각 초기화
			
			now.add(Calendar.DATE, -12);
			System.out.printf("12일 전: %tF\n", now);
			
			//지금 > 3시간 25분 뒤에 약 복용
			
			now = Calendar.getInstance();
			
			now.add(Calendar.HOUR, 3);
			now.add(Calendar.MINUTE, 25);
			System.out.printf("약 복용 시간: %tT\n", now);
			
			
			
			
			
			
		}

		private static void m3() {
		
			//특정 시각을 생성하기 > 원하는 시각 생성 > 올해 크리스마스
			
			Calendar christmas = Calendar.getInstance(); //현재 시각
			
		//	System.out.printf("%tF\n", christmas); //특정 날짜를 바로 만드는 방법이 없어서 무조건 오늘을 만들고 그다음 다른날짜로 수정
			
			//수정
			// - void set(오버로딩) //주로 get method는 읽기 작업. set method는 쓰기 작업.
			
			//2023-07-20
		//	christmas.set(Calendar.MONTH, 11); //주의! 11이 12월이닷! -> 12하면 내년 1월 됨.
		//	christmas.set(Calendar.DATE, 25);
		//	System.out.printf("%tF\n", christmas);
			
			//-------------------------------------------------------
			System.out.printf("%tF %tT\n", christmas, christmas);
			christmas.set(Calendar.MONTH, 11); //주의! 11이 12월이닷! -> 12하면 내년 1월 됨.
			christmas.set(Calendar.DATE, 25);
			
			christmas.set(Calendar.HOUR_OF_DAY, 19);
			christmas.set(Calendar.MINUTE, 0);
			
			System.out.printf("%tF %tT\n", christmas, christmas);
			
			//--------------------------------------------------
			//내 생일
			Calendar birthday = Calendar.getInstance();
			
			birthday.set(1997, 3, 20);
			System.out.printf("%tF\n", birthday);
			
			birthday.set(1997, 4, 20, 10, 30);
			System.out.printf("%tF %tT\n", birthday, birthday);
			

			
		}

		private static void m2() {
			
			//두번째 예제
			
			//Calendar 클래스
			Calendar c1 = Calendar.getInstance(); //변수를 지정해야함. 그래야 그 시간에 시간을 지정할 수 있으니까!
			
			//java.util.GregorianCalendar[time=1689838479466,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=201,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=34,SECOND=39,MILLISECOND=466,ZONE_OFFSET=32400000,DST_OFFSET=0]
			//위에서 내가 원하는것만 뽑아내서 쓰면 됨!
			//System.out.println(c1);
			
			//집합 데이터 > 내가 원하는 항목만 추출
			// - int get(int)
			
			System.out.println(c1.get(1)); //2023
			System.out.println(c1.get(2)); //6
			System.out.println(c1.get(3)); //29
			System.out.println(c1.get(4)); //4
			System.out.println(c1.get(5)); //20
			System.out.println();
			
			//-----------------위의 방법보다 아래가 더 나음!!
			
			int year = 1;
			System.out.println(c1.get(year));
			//But 위 방법을 쓰려면 우리가 집합 데이터 안 항목이 각 몇번인지를 알아야 함..번거로워
			
			//어떤 항목을 추출 > 필요한 숫자 > 미리 상수로 제공 > Calendar 상수
			System.out.println(Calendar.YEAR); //상수의 표기법 > 전부 대문자
			
			System.out.println(c1.get(Calendar.YEAR));
			
			//-------------------------------------
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			//------------------------------------실제 사용 예제
			System.out.println(c1.get(Calendar.YEAR)); //2023 > 년
			System.out.println(c1.get(Calendar.MONTH)); //6 > 월(0~11) 월은 0부터 시작하니 주의!!!!!
			System.out.println(c1.get(Calendar.DATE)); //20 > 일
			System.out.println(c1.get(Calendar.HOUR)); //4 > 시(12H)
			System.out.println(c1.get(Calendar.HOUR_OF_DAY)); //16 > 시(24H)
			System.out.println(c1.get(Calendar.MINUTE)); //45 > 분
			System.out.println(c1.get(Calendar.SECOND)); //49 > 초
			System.out.println(c1.get(Calendar.MILLISECOND)); //5 > 밀리초(ms) **java에서 기본적으로 다루는 최소의 시간 단위 = ms**
			System.out.println(c1.get(Calendar.AM_PM)); //1 > 오전(0), 오후(1)
			System.out.println(c1.get(Calendar.DAY_OF_YEAR)); //201 > 일 > 올해 들어 201일 째
			System.out.println(c1.get(Calendar.DAY_OF_MONTH)); //20 > 일 > 이번달 들어 20일 째
			System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //5 > 요일 > 1(일) ~ 7(토) > 이번주 들어 5일째 //반환값이 int라 숫자로 돌려줌.
			System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); //29 > 주 > 올해들어 29주차
			System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); //4 > 주 > 이번달 들어 4주차
			System.out.println();
			
			
			//요구사항] "오늘은 2023년 7월 20일입니다."
			System.out.printf("오늘은 %d년 %d월 %d일입니다.\n"
					, c1.get(Calendar.YEAR)
					, c1.get(Calendar.MONTH) + 1
					, c1.get(Calendar.DATE));
			
			//요구사항] "지금은 17시 05분 50초입니다." - 24H
			//		 "지금은 오후 5시 05분 50초입니다." - 12H
			
			System.out.printf("지금은 %d시 %02d분 %02d초입니다.\n"
								, c1.get(Calendar.HOUR_OF_DAY)
								, c1.get(Calendar.MINUTE)
								, c1.get(Calendar.SECOND));
			
			System.out.printf("지금은 %s %d시 %02d분 %02d초입니다.\n"
								, c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
								, c1.get(Calendar.HOUR)
								, c1.get(Calendar.MINUTE)
								, c1.get(Calendar.SECOND));
			System.out.println();
			
			//printf() > 형식 문자 > 날짜시간
			System.out.printf("%tF\n", c1); //2023-07-20
			
			System.out.printf("%tT\n", c1); //17:15:48
			
			System.out.printf("%tA\n", c1); //목요일 > Locale > 지역 설정
		}
		
		
		
		
		
		private static void m1() {
			
			//첫번째 예제
			
			//Date 클래스
			
			//날짜시간을 저장하는 변수			
			Date date = new Date(); //컴퓨터의 시각을 가져온다.
			
			System.out.println(date);
			
			
		}
		
		
}
