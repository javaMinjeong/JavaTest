package com.test.java.calendar_Review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Data {

	//txt파일에 있는 정보를 ArrayList에 넣어줄 예정!
	
	public static ArrayList<Item> list;
	
	static {
		Data.list = new ArrayList<Item>();
	}
	
	public static void load() {
		
		//item.txt > ArrayList<Item>
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("data\\item.txt"));
			
			
			
			
			
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Data.load");
			e.printStackTrace();
		}
		
		
		
		System.out.println()
	}
	
	
	
}
