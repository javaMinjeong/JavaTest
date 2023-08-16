package com.test.question;

import java.io.File;

public class Q113 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.
			
			조건)
			- '001'부터 3자리 형식으로 붙이시오.
		
		
		*/
		
		//해당 음악파일이 있는 경로로 file 객체 생성 및 임포트
		File file = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\음악 파일\\Music");
		
		//파일명을출력해볼까?
		String[] list = file.list();
		
		for (int i=0; i<list.length; i++) {
			System.out.printf("[%03d]%s\n", i+1, list[i]);
			
		}
	}
}
