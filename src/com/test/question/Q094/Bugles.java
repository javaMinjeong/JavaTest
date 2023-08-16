package com.test.question.Q094;

import java.util.Calendar;

class Bugles {
	private int price; //가격
	private int weight; //용량
	private Calendar creationTime; //생산일자
	private int expiration; //유통기한

	// getter, setter 구현

	//용량 > 쓰기 전용 > 300, 500, 850 유효성 검사
	public void setSize(int weight) {
		
		if (weight == 300 || weight == 500 || weight == 850) {
			this.weight = weight;
		} else {
			System.out.println("올바른 용량을 입력하세요.");
		}
		
	}//setWeight
	
	//가격 > 읽기 전용 > 각 용량 별 지정 가격 설정
	public int getPrice() {
		if (this.weight == 300) {
			price = 850;
		} else if (this.weight == 500) {
			price = 1200;
		} else if (this.weight == 850) {
			price = 1950;
		}
		return price;
		
	}//getPrice

	//생산일자 > 쓰기 전용 > "2023-07-28"양식으로 입력
	public void setCreationTime(String date) {
		Calendar c = Calendar.getInstance();
		//입력받은 년도, 월, 일 int 변환하여 요일 set
		c.set(Integer.parseInt(date.substring(0, 4)),
				Integer.parseInt(date.substring(5, 7)) - 1, //Calendar 월단위는 0~11
				Integer.parseInt(date.substring(8, 10)));
		
		this.creationTime = c;
	}

	//남은유통기한 > 읽기 전용 > 용량별 유통기한 상이
	//5: 먹을 수 있는 날짜가 5일 남음
	//-3: 먹을 수 있는 날짜가 3일 지남
	public int getExpiration() {
		//expiration 무게별로 설정
		if (this.weight == 300) {
			expiration = 7;
		} else if (this.weight == 500) {
			expiration = 10;
		} else if (this.weight == 850) {
			expiration = 15;
		}
		
		//현재 - 제조시간
		//먹을 수 있는 날짜 = 유통기한 - 현재 - 제조시간
		Calendar now = Calendar.getInstance();
		
		//ms > s > m > h > day
		return expiration - (int)(now.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24;
	}//getExpiration
	
	
	//값은 과자를 맛있게 먹습니다. or 유통기한이 지나 먹을 수 없습니다. if 절
	public void eat() {
		
		if (getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
		
		
	}//eat
	
	
	
	
}//class
