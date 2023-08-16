package com.test.question;

import java.util.Scanner;

public class Q081 {
	
	public static void main(String[] args) {
		
		/*
			요구사항]
			이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
			
			1) split을 사용하여 '@'구분자를 기준으로 쪼개어 추출
			2) indexOf 사용하여 '@' 위치 확인 후, substring 사용하여 추출
			
			1. 사용 변수 선언
			2. 스캐너 생성 및 이메일 조수를 입력받아
			3. 조건에 맞게 출력
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String email = "";
		
		System.out.print("이메일: ");
		email = scan.nextLine();
		
		//1) split 사용하여 '@' 구분자를 기준으로 쪼개어 출력하기
		
		String[] temp = email.split("@");
		
		System.out.printf("아이디: %s\n", temp[0]);
		System.out.printf("도메인: %s\n", temp[1]);
		
		
		
		//2) indexOf 사용하여 '@' 위치 확인 후, substring 사용하여 추출
		
		String id = "";
		String domain = "";
		
		//ex)skfo@gmail.com
		//일단 @가 몇번째 인덱스인지 확인
		System.out.println(email.indexOf("@"));
		
		//이제 아이디, 도메인 각 변수에 식 넣어주기
		id = email.substring(0, email.indexOf("@"));
		domain = email.substring(email.indexOf("@") + 1);
		
		//이제 값 출력해주기
		System.out.printf("아이디: %s\n", id);
		System.out.printf("도메인: %s\n", domain);
		
		
		
		
		
	}
}
