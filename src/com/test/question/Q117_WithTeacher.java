package com.test.question;

import java.io.File;

public class Q117_WithTeacher {

	public static void main(String[] args) {
		
		//재귀구조 사용! > 내용있는 폴더 삭제하기
		
		File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\폴더 삭제\\delete");
		
		//지우던 안지우던 일단 이 안에있는 모든 내용을 탐색하기!
		delete(dir);
		
		
	}

	private static void delete(File dir) {

		File[] list = dir.listFiles();
		
		//이 안에는 파일과 폴더가 있으니, 먼저 파일 먼저 볼러서 액션을 취하자~!
		for (File f : list) {
			if (f.isFile()) {
				f.delete();
			}
		}
		
		//폴더 불러와서 액션 취하자~
		for (File d : list) {
			if (d.isDirectory()) {
				delete(d);
				//count++; 지워지는 파일의 개수
			}
		}
		
		//여기까지 넘어오면 이제 폴더 아래 하위폴더는 없습니다 > 자기 자신 폴더 삭제
		dir.delete();
		//count++; > 지워지는 폴더의 개수
		
	}
}
