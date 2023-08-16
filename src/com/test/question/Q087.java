package com.test.question;

import java.util.Scanner;

public class Q087 {

	public static void main(String[] args) {
//		요구사항
//		영단어를 입력받아 분리하시오.
//
//		조건..
//		합성어를 입력한다.
//		합성어는 파스칼 표기법으로 입력한다.
//		출력은 각 단어를 공백으로 구분한다.
//		입력..
//		단어: StudentName 
//
//		출력..
//		결과: Student Name
		
		//대문자 A-Z: 65-90
		//소문자 a-z: 97-122
		
		Scanner scan = new Scanner(System.in);
		
		String word = "";
		char temp =' ';
		
		
		System.out.print("단어: ");
		word = scan.nextLine();
		
		System.out.print("결과:");
		for (int i=0; i<word.length(); i++) {
			temp = word.charAt(i);
			if (temp >= 'A' && temp <= 'Z' && i != 0) { //대문자 앞은 공백처리 할거지만, 첫글자 대문자 앞에는 공백처리 불요하므로
				System.out.print(" ");
				System.out.print(temp);
			} else {
				System.out.print(temp);
			}
		}
		
		
		
		
		
		
	}//main
}//class
