package com.test.question;

import java.util.Arrays;

public class Q064 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			- 1~20 사이의 난수를 담고 있는 배열 생성
			- 최댓값과 최솟값 출력
			
			조건)
			- 난수 20개 발생 후 배열에 넣는다
			- 난수는 1 ~ 20 사이
			
			1. 사용 변수 선언
			2. 배열 생성
			3. 난수 생성 > 루프 사용 > 배열에 난수 넣기
			4. 배열 오름차순 정렬
			5. 최솟값, 최댓값 출력
		
		*/
		
		int num = 0;
		int[] nums = new int[20];

		//난수 발생 > 20개(1~20)
		//+ 배열에 난수 넣기
		
		System.out.print("원본: ");
		
		for (int i=0; i<nums.length; i++) {
			num = (int)(Math.random()*20)+1;
			nums[i] = num;
			System.out.print(nums[i] + ", ");
		}
		
		//배열 오름차순 정렬
		Arrays.sort(nums);
		
		System.out.println();//행 분리
		System.out.printf("최댓값: %d\n", nums[19]);
		System.out.printf("최솟값: %d\n", nums[0]);
		
		
		
	}
}
