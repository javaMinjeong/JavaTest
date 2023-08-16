package com.test.question;

public class Q084 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			특정 단어가 문장내에 몇회 있는지 수를 세시오.
			
			조건)
			String content = "안녕~ 길동아~ 잘가~ 길동아~";
			String word = "길동";
		
			1. 사용 변수 선언
				> content, word, 카운트용 누적 변수, index
			2. 해당 문장 내에서 word 검색하여 카운트 하는 누적변수 이용 코드 작성
			3. 값 출력
		*/
		
		//사용 변수 선언
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int index = -1;
		int count = 0;
		
		//문장의 처음부터 '길동'을 찾아 해당 인덱스 반환 후, 인덱스+2 하여 해당 위치부터 길동을 찾는 반복문
		for (int i=0;; i++) {
			
			index = content.indexOf(word, index);
			//System.out.println(index);
			if (index > -1) {
				count += 1;
				index += 2;
			} else {
				break;
			}
		}
		//값 출력
		System.out.printf("'길동'을 총 %d회 발견했습니다.\n", count);
		
		
	
		
		
		
		
		
		
	}//main
	
	
}//class
