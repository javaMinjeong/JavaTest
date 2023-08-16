package com.test.question;

import java.io.File;

public class Q117 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			내용물이 있는 'delete' 폴더를 삭제하시오.
			
			조건)
			- 재귀 메소드 사용
			- 삭제된 파일과 자식 폴더 개수를 출력하시오.
		
		*/
		
		//출력용 삭제된 폴더, 파일 누적 변수 생성
		int dirCount = 0;
		int fileCount = 0;
		
		//해당 폴더 경로 String path 변수에 넣어주기
		String path = "C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\폴더 삭제\\delete";
		
		File dir = new File(path);
		
		
		
		
	}
}
