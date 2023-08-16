package com.test.question;

import java.util.Scanner;

public class Q027 {

	public static void main(String[] args) {

		/*
			요구사항]
			문자 1개를 입력받아 아래와 같이 출력하시오.
			-------------
			> 유효성 검사
				char == f, F, m, M, s, S, b, B
			> a 문자코드 = 97
			  z 문자코드 = 
			  A 문자코드 = 65
			  Z 문자코드 = 90
			  ???이거아니쟈나 모한거임
		*/
		

		Scanner scan = new Scanner(System.in);
		
		String input = "";

		//TODO 이거 input을 String으로 받아야 하는지 char로 받아야 하는지 고민해봐라!
		System.out.print("문자: ");
		input = scan.nextLine(); //TODO scan.nextLine()에서 1글자만 추출받는거 뭐였는지 찾아라
		
		if (input == "f"
			|| input == "F"
			|| input == "m"
			|| input == "M"
			|| input == "s"
			|| input == "S"
			|| input == "b"
			|| input == "B") {
			
			if(input == "f" || input == "F") {
				System.out.println("Father");
			} else if (input == "m" || input == "M") {
				System.out.println("Mother");
			} else if (input == "s" || input == "S") {
				System.out.println("Sister");
			} else {
				System.out.println("Brother");
			}
			
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
		
		
		
	}

}
