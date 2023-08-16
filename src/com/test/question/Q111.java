package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {

	public static void main(String[] args) {
		
		/*
			요구사항] 지정한 폴더의 특정 파일(확장자)만을 출력하시오
			
			조건)
			- 확장자 대소문자 구분없이 검색 가능
			
			1. 지정한 폴더를 입력받아
			2. 입력받은 경로로 File 객체 생성 후
			3. 해당 경로에서 특정 확장자와 일치하는 파일명 출력
		*/
		
		//1. 지정한 폴더를 입력받아
		// - scanner 생성
		// - 입력받을 변수 선언 String path, String extension
		
		Scanner scan = new Scanner(System.in);
		
		String path = "";
		String extention = "";
		int index = 0;
		
		//폴더 입력받기
		System.out.print("폴더: ");
		path = scan.nextLine();
		
//		//확장자명 입력받기
//		System.out.print("확장자: ");
//		extention = scan.nextLine();
		
		//2. 입력받은 경로로 File 객체 생성 후
		// - 폴더 존재 여부 확인후, 해당 폴더 내 file 여부 if절로 필터링
		File dir = new File(path);
		
		String[] filename;
		//입력받은 폴더 존재 여부 확인
		if (dir.exists()) {
			
			//해당 폴더에서 파일만 출력하기
			File[] file = dir.listFiles();
			for (File f : file) {
				if (f.isFile()) {
					//System.out.println(f);
					//여기까지가 일단 파일.
					//여기서 확장자 필터링해야하는딩
					filename = f.list();
				}
			}
		}
		
//		for (int i=0; i<filename.length; i++) {
//			index = filename[i].lastIndexOf(".");
//			
//			
//		}
		
//			for (int i=0; i<file.length; i++) {
//				System.out.println(file[i]);
//			}
			
//			//파일만 추출하기
//			if (file.isFile()) {
//				System.out.println(file.getName());
//			}//일단 파일명들만 쭉 불러보쟈
		
		//3. 해당 경로에서 특정 확장자와 일치하는 파일명 출력
		//출력한 파일명에서 LastIndexOf로 확장자명 일치하는 것 확인하기
		
		
		
		
		
	}
}
