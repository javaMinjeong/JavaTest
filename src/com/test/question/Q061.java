package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q061 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			숫자 5개를 입력받아 배열에 담은 뒤 역순 출력
			
			- 조건
			int[] nums = new int[5];
			
			1. 사용 변수 선언
			2. 배열 만들기
			3. 숫자 5개 입력 받아
				> scanner 생성
				> 입력 받고, 받은 변수 배열에 담는 행위 5번
			4. 배열 역순으로 루프 돌며 출력
			
		*/
		
		//입력 위한 Scanner 생성
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 선언 및 배열 생성
		int num = 0;
		int[] nums = new int[5];
		
		//5개의 숫자 입력받고 입력받은 숫자 변수 배열 인덱스에 넣어주기
		for (int i=0; i<nums.length; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			nums[i] = num;
		}
		
		//배열 역순으로 루프 돌며 출력하기
		for (int i=nums.length-1; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
	}//main
	
}//class
