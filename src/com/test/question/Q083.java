package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
			
			조건)
			확장자 제한
			- mp3
			- jpg
			- java
			- hwp
			- doc
			
			1. 사용 변수 선언
			2. 파일명을 입력 받아
			3. 입력받은 파일명에서 lastIndexOf(".") + substring 활용하여 파일명 추출하고
			4. 추출된 파일명별로 누적해서
			5. 값 출력
		
		*/
		
		//사용할 변수 선언
		//파일명을 입력받을용 String filename, 각 확장자별 누적 합계용 변수, 찾을 위치 index 변수
		String filename = "";
		int index = -1;
		int mp3Sum = 0, jpgSum = 0, javaSum = 0, hwpSum = 0, docSum = 0;
		
		//스캐너 생성 및 임포트
		Scanner scan = new Scanner(System.in);
		
		//파일명 입력받고, 파일명에 따라 확장자별로 누적시키는 작업 10번 반복
		for (int i=0; i<10; i++) {
			
			//파일명 입력받기
			System.out.print("파일명: ");
			filename = scan.nextLine();
			
			//파일명 전부 소문자로 변환
			filename = filename.toLowerCase();
			
			//파일명 뒤에서부터 '.'의 위치 찾기
			index = filename.lastIndexOf(".");
			
			//문자열은 =이 아니라 equals 사용!!
			if (filename.substring(index+1).equals("mp3")) {
				mp3Sum++;
			} else if (filename.substring(index+1).equals("jpg")) {
				jpgSum++;
			} else if (filename.substring(index+1).equals("java")) {
				javaSum++;
			} else if (filename.substring(index+1).equals("hwp")) {
				hwpSum++;
			} else if (filename.substring(index+1).equals("doc")) {
				docSum++;
			}
			
		}//for
		
		//값 출력
		System.out.printf("mp3 : %d개\n", mp3Sum);
		System.out.printf("jpg : %d개\n", jpgSum);
		System.out.printf("java : %d개\n", javaSum);
		System.out.printf("hwp : %d개\n", hwpSum);
		System.out.printf("doc : %d개\n", docSum);
		
		
	}//main
}//class
