package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {

	public static void main(String[] args) {
		
		//요구사항] 숫자를 한글로 바꾼뒤 파일을 다른 이름으로 저장.
		
		//조건) 0~9 > 영~구
		//저장할 파일명: 숫자_변환.dat
		
		//BufferedReader로 읽고 > 숫자 한글로 변환 후 > BufferedWriter로 쓰기
		
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\숫자.dat"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Downloads\\파일_입출력_문제\\숫자_변환.dat"));
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				
				//System.out.println(line); //확인용
				//replace로 여러개를 바꿀려면 메소드로 빼는게 나을까?
				line = getKorean(line);
				//System.out.println(line); //확인용
				writer.write(line);
			}
			
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
			
		} catch (Exception e) {
			System.out.println("at Q121.main");
			e.printStackTrace();
		}
		
		
		
		
		
	}

	private static String getKorean(String line) {

		//배열을 이용해보자
		String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] kor = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		
		for (int i=0; i<num.length; i++) {
			line = line.replace(num[i], kor[i]);
		}
		
		return line;
	}
}
