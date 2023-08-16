package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {

	public static void main(String[] args) {

		/*
			요구사항]
			배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
			
			조건)
			- 원본 배열 길이: 사용자 입력
			- 원본 배열 요소: 난수(1~9)
			- 결과 배열 길이: 사용자 입력 / 2
			
			1. 사용 변수 선언
				> int length (사용자 입력 배열 길이)
			2. 사용자로부터 배열 길이 입력받아 배열 생성
			3. 생성한 배열 안에 난수(1~9) 만들어 넣어주는 루프 생성
			4. 배열 오름차순 정열
			5. 요소를 순차적으로 2개씩 더한 값을 구하는 루프 생성
			6. 출력
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 선언
		int length = 0;
		
		//사용자로부터 배열 길이 입력받아 배열 생성
		System.out.print("배열 길이: ");
		length = scan.nextInt();
		
		int[] nums = new int[length];
		
		//생성한 배열 안에 난수(1~9) 만들어 넣는 루프 생성
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*9)+1;
		}
		
		//배열 오름차순 정렬
		Arrays.sort(nums);
		
		//원본 출력
		System.out.printf("원본: %s\n", Arrays.toString(nums));
		
		//결과 출력
		System.out.print("결과: [ ");
		if (length % 2 ==0) {
			for (int i=0; i<nums.length; i=i+2) {
				nums[i] += nums[i+1]; 
				System.out.print(nums[i] + ", ");
			}
			System.out.print("\b\b ]");
		} else {
			for (int i=0; i<nums.length; i=i+2) {
				if (i==nums.length-1) {
					nums[i] = nums[i];
					System.out.print(nums[i] + " ]");
				} else {
				nums[i] += nums[i+1];
				System.out.print(nums[i] + ", ");
				}
			}
			
		}
	
	
	
	}//main

}
