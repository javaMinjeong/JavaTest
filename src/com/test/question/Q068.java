package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {

	public static void main(String[] args) {

		/*
			요구사항]
			배열의 요소를 삭제하시오.
			
			조건)
			- 배열 길이: 10
			- 마지막 요소는 0으로 채우시오.
			
			1. 사용 변수 선언
				> 입력받을 위치 int index
			2. 배열 생성
			3. 삭제 위치로부터 배열 한칸씩 앞으로 당기는 루프 생성
			4. 출력
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 선언
		int index = 0;
		
		//배열 생성
		int[] nums = {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		
		//사용자로부터 삭제 위치 입력받아
		System.out.print("삭제 위치: ");
		index = scan.nextInt();
		
		//원본 출력
		System.out.printf("원본: %s\n", Arrays.toString(nums));
		
		//삭제 위치
		System.out.print("결과: [");
		for (int i=0; i<index; i++) {
			System.out.print(nums[i] + ", ");
		}
		
		for (int i=index; i<nums.length-1; i++) {
			nums[i] = nums[i+1];
			System.out.print(nums[i] + ", ");
		}
		System.out.print("0]");
		
		
		
	}

}
