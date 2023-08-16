package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			배열에 요소를 삽입하시오.
			
			조건)
			- 배열 길이: 10
			- 마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
			
			1. 사용 변수 선언
			2. 배열 생성 > 배열에 요소 삽입
			3. 삽입 위치 입력받아
			4. 해당 인덱스에 입력받은 값 삽입
			5. 나머지 숫자 뒤로 당기는 루프 생성
			6. 공간 없으면 삭제 후 출력
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 선언
		int index = 0;
		int value = 0;
		String temp = "";
		
		//배열 생성
		int[] nums = {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		
		//삽입 위치 및 값 입력받아
		System.out.print("삽입 위치: ");
		index = scan.nextInt();
		
		System.out.print("값: ");
		value = scan.nextInt();
		
		//원본값 출력
		System.out.printf("원본: %s\n", Arrays.toString(nums));

		//해당 위치 전 결과값 출력, 해당 위치 후 결과 변경값 출력 > 루프 사용
		System.out.print("결과: [");
		for (int i=0; i<index; i++) {
			temp += nums[i] + ", ";
		}
		System.out.print(temp);
		
		//TODO 여기 수정 필요
		for (int i=index; i<nums.length; i++) {
			if (i == index) {
				nums[index] = value;
			} else {
				nums[i] = nums[i-1]; 
			}
			temp += nums[i] + ", ";
		}
		System.out.print(temp);
		
		
		
		
		
	}//main

	
}//class
