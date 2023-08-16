package com.test.question;

import java.io.File;

public class Q119_WithTeacher {

	public static void main(String[] args) {
		
		//파일을 폴더별로 분류/이동하시오.
		
		File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\직원");
		
		//목록 가져오기
		File[] list = dir.listFiles();
		
		for (File f : list) {
			
			//아무게_2014__17.txt
			//아무게_2016_67.txt
			
			String[] temp = f.getName().split("_");
			
			String name = temp[0];
			String year = temp[1];
			
			//목적: 위 두가지를 가지고 폴더를 생성 후, 해당 폴더로 이동시키기
			
			File nameDir = new File(dir.getAbsolutePath() + "\\" + name);
			nameDir.mkdir();
			
			File yearDir = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year);
			yearDir.mkdir();
			
			//이동할 애가 어디로 가면될 지 결과에 대한 참조 생성
			File dest = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year + "\\" + f.getName());
			
			f.renameTo(dest);
			
		}
	}
}
