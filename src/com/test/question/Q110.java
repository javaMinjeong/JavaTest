package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			파일의 경로를 입력받아 파일 정보 출력
			
			조건)
			- 파일 크기 단위 변환 출력(소수 이하 1자리까지)
			
			1. 파일의 경로를 입력받은 후
			2. 입력받은 경로로 File 객체 생성
			3. 해당 파일 존재유무 확인 후, 파일명/종류/크기 반환
		*/
		
		//1. 파일의 경로를 입력받은 후
		// - scanner 생성 및 String 입력받기
		// - String path 변수 선언
		// - int index, String extension 변수 선언 > 확장자값 불러올 용도
		// - > 파일 크기 단위 변환 출력용
		
		Scanner scan = new Scanner(System.in);
		
		String path = "";
		String extension = "";
		int index = 0;
		
		System.out.print("파일 경로: ");
		path = scan.nextLine();

		//2. 입력받은 경로로 File 객체 생성
		File file = new File(path);
		
		//3. 해당 파일 존재유무 확인 후, 파일명/종류/크기 반환
		// - getName/LastIndexOf/length 사용
		//내 컴퓨터에 가지고 있는 파일로 경로 입력해서 확인하기!
		
		index = file.getName().lastIndexOf(".");
		extension = file.getName().substring(index+1);
		
		if (file.exists()) {
			System.out.printf("파일명 : %s\n", file.getName());
			System.out.printf("종류 : %s 파일\n", extension);
//			System.out.printf("파일 크기 : %s\n", getSize(file.length()));
			//일단 크기 단위 변환 하기 전으로!!
			//TODO 파일 크기 단위 변환 처리만 하면 됨~~!!!
		}
		
		
		
		
	}

//	private static String getSize(long length) {
//		
//		//그냥 length는 > byte
//		//length가 < 1024 >> B
//		//length가 < 1024 * 1024 >> KB
//		//length가 < 1024 * 1024 * 1024 >> MB
//		//length가 < 1024 * 1024 * 1024 * 1024 >> GB
//		//length가 < 1024 * 1024 * 1024 * 1024 >> TB
//		
////		if (length < 1024) {
////			return length + "B";
////		}
//		
//		
//		
//		
//		
//	}
	
}
