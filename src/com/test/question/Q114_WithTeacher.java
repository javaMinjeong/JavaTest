package com.test.question;

import java.io.File;
import java.util.HashMap;

public class Q114_WithTeacher {

	public static void main(String[] args) {
		
		//이미지파일 확장자별로 카운팅 및 추가 파일 생성 시, 확장자 추가
		
		//목록
		File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\확장자별 카운트");
		
		File[] list = dir.listFiles();
		
//		int count = 0; //jpg
//		int count2 = 0; //png
//		int count3 = 0; //gif
		
		//키 > 확장자
		//값 > 카운트
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		
		//파일명 확보
		for (File f : list) {
			//System.out.println(f.getName());
			
			//확장자 추출하기
			String ext = getExtension(f.getName());
			
			//HashMap은 중복값을 덮어쓰기 하기 때문에 누적되어 카운팅 될 수 있도록 설정
			if (!count.containsKey(ext)) { //확장자가 맵에 존재하는지?
				count.put(ext, 1); //새로운 확장자 등록
			} else { //기존 등록 확장자가 나오면 숫자를 증가시키기
				count.put(ext, count.get(ext) + 1); //count = count + 1 누적
				
			}
			
		}
		
		System.out.println(count);
		
		
	}

	private static String getExtension(String name) {

		//확장자 추출 메소드로 빼기
		
		//test.png
		//test.test.png
		
		String[] temp = name.split("\\.");
		//System.out.println(temp.length);
		
		//내가 필요한건 마지막 덩어리(확장자)이니까
		String ext = temp[temp.length-1].toLowerCase();
		
		//System.out.println(Arrays.toString(temp));
		//System.out.println(ext);
		
		
		return ext;
		//return name.split("\\.")[temp.length-1].toLowerCase();
	}
}
