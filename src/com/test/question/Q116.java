package com.test.question;

import java.io.File;

public class Q116 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			Music A폴더와 Music B폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.
			
			조건)
			- 중복 파일을 찾아내시오.
			
			폴더 목록 확인하여 중복 파일 찾아내기.
			file.list() 사용
			두 폴더간의 list String 배열 비교하여 일치 시 출력
			
			중복 파일 찾아내어 출력하기
		 
		*/
		
		//각 폴더별 객체 생성하기
		File A = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\동일 파일\\MusicA");
		File B = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\동일 파일\\MusicB");
		
		if (A.exists() && B.exists()) {
			
			String[] listA = A.list();
			String[] listB = B.list();
			
			for (String a : listA) {
//				if 
			}
			
			
			
			if (listA.equals(listB)) {
				
				
				
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
	}//main
}//class
