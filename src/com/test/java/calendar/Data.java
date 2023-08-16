package com.test.java.calendar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//파일에 있는 데이터를 자주 접속해서 데이터를 읽어야할 경우, 보통 메모리(배열 or 컬렉션)에 옮겨놓는다.
//item.txt > 조작 클래스(*****)

public class Data {
	
	//static이니까 객체를 만들지 않아도 어디서든 접근할 수 있다는 얘기!
	public static ArrayList<Item> list; //전체 일정
	
	//정적 생성자 > static 멤버 전용 초기화 > main method 실행되기 전 초기화 되어야함!
	static {
		Data.list = new ArrayList<Item>();
	}

	public static void load() {

		//item.txt > ArrayList<Item>
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("data\\item.txt"));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				//System.out.println(line);
				//1,2023-08-02,회의
				
				String[] temp = line.split(",");
				
				Item item = new Item(temp[0], temp[1], temp[2]);
				Data.list.add(item);
				//위의 과정을 통해 외부 파일을 배열에 옮겨담아서 더이상 외부 파일에 접근할 일이 없음!
			}
			
			
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Data.load");
			e.printStackTrace();
		}
		
		
	}
}
