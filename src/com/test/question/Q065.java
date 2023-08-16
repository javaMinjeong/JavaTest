package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q065 {

	public static void main(String[] args) {

		/*
			요구사항]
			난수를 담고 있는 배열 생성한 뒤 출력
			
			조건)
			- 난수 20개 발생(난수: 1~20 사이)
			- 배열을 탐색하여 범위에 만족하는 숫자만 출력.
			
			1. 사용 변수 선언
			2. 배열 생성
			3. 난수 생성 및 배열에 넣기
		XX	4. 배열 정렬(오름차순) XX > 정렬할 필요가 없음!
			5. 입력받은 범위 값 탐색
				> scanner 생성
				> nums[i] 의 값이 최소~최대 범위 내 있는 것 추출 > 조건문/반복문 사용하여 전체 수에서 검색
			6. 출력
		
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 선언 및 배열 생성
		int num = 0;
		int max = 0;
		int min = 0;
		int[] nums = new int[20];
		
		//난수 생성 및 배열에 넣기
		for (int i=0; i<nums.length; i++) {
			num = (int)(Math.random()*20)+1;
			nums[i] = num;
		}
		
		
		//입력 받기
		System.out.print("최대 범위: ");
		max = scan.nextInt();
		
		System.out.print("최소 범위: ");
		min = scan.nextInt();
		
		//결과값 출력

		System.out.print("원본: ");
		for (int i=0; i<nums.length; i++) {
			
			System.out.print(nums[i]);
			if (i != nums.length-1) {
				System.out.print(", ");
			}
			//System.out.print(nums[i] + ", ");
			
		}
		
		
		
		System.out.println();
		System.out.print("결과: ");
		for (int i=0; i<nums.length; i++) {
			
			if (nums[i] >= min && nums[i] <=max) 
				
				System.out.print(nums[i] + ", ");
		}
		
		
	}//main

}//class
