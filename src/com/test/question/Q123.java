package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q123 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			이름을 입력받아 회원 정보를 검색 후 출력하시오.
			
		
			회원정보 검색 > 파일 읽기
		*/
		
		String path = "C:\\Users\\skfoc\\Downloads\\파일_입출력_문제\\단일검색.dat"; //우리집에서 해당 폴더 경로
		
		try {
			//회원정보 파일 읽기 > BufferedReader 생성
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			//스캐너 생성 > 이름 입력받기
			Scanner scan = new Scanner(System.in);
			
			String name = "";
			
			System.out.print("이름: ");
			name = scan.nextLine();
			
			//파일 읽기
			String line = null;
			while ((line = reader.readLine()) != null) {
				
				//해당 파일은 컴마로 구분되며 [일렬번호, 이름, 주소, 전화번호]로 구성됨.
				//일단 split으로 컴마 기준으로 나누기
				String[] temp = line.split(",");
				
				//System.out.println(line); // 확인용
				//temp[1]은 이름. 이름이 입력받은 이름"name"과 같을 경우, 번호, 주소, 전화를 출력하는 루트를 데이터의 모든 line을 읽을때까지 반복 > 만약 동명이인이 있을 경우 에러발생..? 없다는 가정하에 진행해보기!
				if (temp[1].equals(name)) {
					System.out.printf("[%s]\n", temp[1]); //이름
					System.out.printf("번호: %s\n", temp[0]); //번호
					System.out.printf("주소: %s\n", temp[2]); //주소
					System.out.printf("전화: %s\n", temp[3]); //전화
					
				}
				
				//temp[0]: 일렬번호
				//temp[1]: 이름
				//temp[2]: 주소
				//temp[3]: 연락처
				
			}
			
			
		} catch (Exception e) {
			System.out.println("at Q123.main");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}//main
}//class
