package com.test.java.dummy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex75 {

	public static void main(String[] args) throws IOException {
		
		
		
		/*
			프로그램 제작 > 데이터
			1. 테스트용 데이터 > 10%
			 - 진짜 데이터
			 - 사람이 직접 기입
			
			2. 더미 데이터 > 90%
			 - 양만 채우는 용도
			 - 프로그램으로 작성
		
			게시판
			- "게시판입니다." x 200개
			
			회원 가입 + 목록
			a. JavaTest > data > "member.txt" > 파일 만들기
			b. 1,홍길동,20,010-1234-4567,서울시 강남구 역삼동 > 규칙 만들기
			c. 규칙 하에 데이터 생성하기
		
		
		
		*/
		
		//회원 100명 만들기 난수로
		
		Random rnd = new Random();
		
		//숫자가 아닌 데이터(회원명) 난수만들기용 문자열 배열
		String[] name1 = {"김", "이", "박", "최", "정", "현", "길", "조", "신", "허"}; //성 으로 쓸 것
		String[] name2 = {"진", "민", "인", "지", "명", "정", "재", "석", "길", "동", "현", "훈", "원", "혜"}; //이중에 2개 뽑아서 이름으로 쓸 것
		
		//주소는 시/구/동 3파트로 나눠짐
		String[] address1 = {"서울시", "부산시", "대전시", "광주시", "제주시"};
		String[] address2 = {"강동구", "강남구", "강서구", "강북구", "중구"};
		String[] address3 = {"역삼동", "대치동", "압구정동", "천호동", "방배동"};
		
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("data\\member.txt"));
		
		
		
		for(int i=0; i<100; i++) {
			
			//회원 번호 > 일련번호 > 루프 사용
			int no = i + 1;
			
			//회원명 > 사람이름
			String name = name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)] + name2[rnd.nextInt(name2.length)];
//			System.out.println(name);
			
			//나이(20~60)
			int age = rnd.nextInt(41) + 20; //0~40 뽑고 20 더하면 20~60
			
			//연락처
			String tel = "010-" 
						+ (rnd.nextInt(9000) + 1000) + "-" + (rnd.nextInt(9000) + 1000); //"010-" + 4자리 + "-" + 4자리
//			System.out.println(tel);
			
			//주소
			String address = 
							 address1[rnd.nextInt(address1.length)]
							+ " "
							+ address2[rnd.nextInt(address1.length)]
							+ " "
							+ address3[rnd.nextInt(address1.length)]
							+ " "
							+ (rnd.nextInt(100) + 20)
							+ "번지";
//			System.out.println(address);
			
			//1,홍길동,20,010-1234-4567,서울시 강남구 역삼동
			
			writer.write(String.format("%d,%s,%d,%s,%s\r\n"
										, no
										, name
										, age
										, tel
										, address));
		}//for
		
		writer.close();
		
		System.out.println("더미 데이터 생성 완료");
		
		//파일끼리 서로 연관된 데이터를 만들 땐 무조건적인 난수로 더미 데이터를 생성하면 안되고 기존에 있던 데이터 배열에서 가져와서 난수화 해야함을 유의!!
		
		
		
		
	}//main
}//class
