package com.test.question;

import java.util.Arrays;

public class Q066 {

	public static void main(String[] args) {

		/*
			요구사항]
			중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
			
			조건)
			- 난수 범위: 1~45
			- 오름차순 정렬
			
			1. 사용 변수 선언
			2. 배열 생성 > 길이 6의 배열
			3. 난수 생성 및 배열에 넣기
			4. 배열 정렬(오름차순)
			5. 출력 > Arrays.toString
		
			Q1. 중복되지 않는 난수는 어떻게 만드는가?
		
		
		*/
		
		//사용 변수 선언 및 배열 생성
		int num = 0; //난수 받을 변수
		int[] nums = new int[6];
		
		//난수 생성 및 배열에 넣기 *중복되지 않는 난수 6개*
		for (int i=0; i<nums.length; i++) {
			
			num = (int)(Math.random()*45)+1;
			nums[i] = num;
			//TODO 보류! 중복되지 않는 난수 어떻게 생성할까?
			
			
			System.out.println(num);
			
		}
		
		
		
		//배열 정렬(오름차순)
		Arrays.sort(nums);
		
		//출력
		System.out.println(Arrays.toString(nums));
		
		
		
		
		
	}//main

}//class
