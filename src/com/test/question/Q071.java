package com.test.question;

public class Q071 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			아래와 같이 출력
			
			25 24 23 22 21
			20 19 18 17 16
			15 14 13 12 11
			10  9  8  7  6
			 5  4  3  2  1
			 
			0,0 = 25
			0,1 = 24
			0,2 = 23
			0,3 = 22
			0,4 = 21
			
			1,0 = 20
			1,1 = 19
			1,2 = 18
			1,3 = 17
			1,4 = 16
			
			~~
			
			4,0 = 5
			4,1 = 4
			4,2 = 3
			4,3 = 2
			4,4 = 1
		
		*/
		
		int[][] list = new int[5][5];
		
		int n = 1;
		
		
		for (int i=list.length-1; i>=0; i--) {
			for (int j=list[0].length-1; j>=0; j--) {
				list[i][j] = n;
				n++;
			}
		}
		
		printArray(list);
		
		
		
		
		
	}//main

	private static void printArray(int[][] list) {

		for (int i=0; i<list.length; i++) {
			for (int j=0; j<list[0].length; j++) {
				System.out.printf("%5d", list[i][j]);
			}
			System.out.println();
			
		}
		
		
		
		
	}//printArray
	
	
}//class
