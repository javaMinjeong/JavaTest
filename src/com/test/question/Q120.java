package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {

	public static void main(String[] args) {
		
		
		//읽고 쓰고 작업 모두 필요 > BufferedReader, BufferedWriter
		
		try {
			
			
			
			//이름수정.dat 파일 읽기
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정.dat"));
			
			//이름수정_변환.dat 파일로 쓰기
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정_변환.dat"));
			
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				//System.out.println(line); //확인용
				
				//읽어들인 내용에서 '유재석' > '메뚜기'로 이름 변환
				//TODO 내가 놓친 것: line.replace한걸 line에 덮어 쓴다음 출력해야지...! line = 을 놓침..!!
				line = line.replace("유재석", "메뚜기");
				writer.write(line);
			
			}
			
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		} catch (Exception e) {
			System.out.println("at Q120.main");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//class
}//main
