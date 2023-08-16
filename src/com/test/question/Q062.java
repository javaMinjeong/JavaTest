package com.test.question;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {

		/*
			요구사항]
			이름 오름차순 정렬
			
			1. 사용 변수 선언 
			2. 학생 수 및 학생명 입력받아
				> scanner 생성
				> 입력받은 정보로 배열 생성 후 루프 돌려서 배열에 추가
			3. 배열 정렬(오름차순)
			4. 출력
		*/
		
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 선언
		int amount = 0;
		String name = "";
		
		//학생 수 입력받아
		System.out.print("학생 수: ");
		amount = scan.nextInt();
		
		//학생 수 입력때 받은 enter 입력값 지워주기
		scan.skip("\r\n");
		
		//입력받은 학생수 길이의 배열 생성
		String[] student = new String [amount];
		
		//학생명 입력받아 배열에 넣는 루프 x 학생수만큼
		for (int i=0; i<student.length; i++) {
			
			System.out.print("학생명: ");
			name = scan.nextLine();
			student[i] = name;
			
		}
		
		System.out.printf("입력한 학생은 총 %d명입니다.\n", amount);
		
		//문자열 오름차순 배열
		Arrays.sort(student); 
		
		//배열 순서대로 출력하는 루프
		for (int i=0; i<student.length; i++) {
			System.out.printf("%d. %s\n", i+1, student[i]);
		}
		
		
	}//main

}
