package com.test.question;

import java.io.File;

public class Q115 {

	public static void main(String[] args) {
		
		/*
			요구사항] 파일의 크기가 0byte인 파일만 삭제하시오.
			
			1. 파일 객체 생성 > 폴더 경로 설정 > 폴더 내용보기
			2. 파일의 크기가 0byte인 경우 삭제 조건 코드 작성
			3. 조건에 해당하는 파일 삭제
		
		*/
		
		//폴더 경로 String path 변수에 입력
		String path = "C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\파일 제거";

		//삭제한 개수 출력할 누적 변수 선언
		int count =0;
		
		//path 경로로 File 객체 생성
		File dir = new File(path);
		
		//해당 폴더의 내용 보기 > file클래스의 length 사용 필요
		// listFiles() 사용
		File[] list = dir.listFiles();
		
		//파일의 크기가 0byte인 파일 확인
		if (dir.exists()) {
			
			for (File f : list) {
				
				if (f.length() == 0) {
					f.delete();
					count++;
				}
			}
		}
		
		//총 삭제 개수 출력
		System.out.printf("총 %d개의 파일을 삭제했습니다.\n", count);
		
		
		
		
	}//main
}//class
