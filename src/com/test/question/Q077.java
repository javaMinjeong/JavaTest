package com.test.question;

public class Q077 {

	public static void main(String[] args) {
		
		
		//TODO 푸시오!!
		/*
			요구사항]
			아래와 같이 출력하시오.
			
		
		
		*/
		
		//사용 변수 선언 및 초기화
		int n = 1;

		//배열 생성
		int[][] list = new int[5][5];
		
		//for문 루트 생성_2중 for문으로 나눠서 윗덩어리 & 아래덩어리 작성 가능?
//		for (int i=0; i<list.length; i++) {
//			for (int j=i; j>=0; j--) {
//				list[i-j][j] = n;
//				n++;
//			}
//		} //윗덩어리 까지만 완료
//		
//		for (int i=1; i<list.length; i++) {
//			for (int j=list[0].length-1; j<=i; j--) {
//				list[i][j-i+1] = n;
//				n++;
//			}
//		}
		
		
		
		//3중 for문으로 작성
        for(int k = 0; k <list.length; k++)
        {
           for (int i=0; i<list.length; i++) 
           {
               for (int j=i; j>=0+k; j--) 
               {
                    if( list[i-j+k][j] == 0 )
                    {
                        list[i-j+k][j] = n++;
                    }
               }
           }
        }

		
		
		//출력 메소드 호출하여 출력
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
