package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q124 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			이름을 입력받아 회원 주문 정보를 검색 후 출력하시오.
			
		
			검색_회원 > 회원번호, 이름, 주소(100명)
			검색_주문 > 일렬번호, 제품명, 개수, 회원번호(200개)
			
		*/
		
		String orderPath = "C:\\Users\\user\\Downloads\\파일_입출력_문제\\검색_주문.dat";
		String memberPath = "C:\\Users\\user\\Downloads\\파일_입출력_문제\\검색_회원.dat";
		
		try {
		
			
			BufferedReader orderReader = new BufferedReader(new FileReader(orderPath));
			BufferedReader memberReader = new BufferedReader(new FileReader(memberPath));
			
			Scanner scan = new Scanner(System.in);
			
			//파일 읽기용 문자열 변수 생성
			String line = null;
			
			//입력용 회원 이름 변수 선언
			String name = "";
			
			//결과값 출력용 변수 선언(memberReader에서 읽은거 저장할 용도)
			String num = ""; //회원번호
			String address = ""; //주소

			//이름 입력받기
			System.out.print("이름: ");
			name = scan.nextLine();
			
			//파일 읽기
			while ((line = memberReader.readLine()) != null) {
				
//				System.out.println(line); //확인
				//회원 번호, 이름, 주소
				String[] temp = line.split(",");
				
				if (temp[1].equals(name)) {
				//temp[0]: 회원번호
				//temp[1]: 이름
				//temp[2]: 주소
					
					num = temp[0];
					address = temp[2];
					break; //찾으면 멈췅!!!!!!!!!!!!!!???????
					//근데 못찾으면 계속 도는거아냥..? 아니구나..? 위에 null이 아닐경우에만 반복하라그래성..?
					
				}//if
			}//while
			
			
			//검색_주문 파일에서 '회원번호'로 해당 사람 찾아야 함
			if (!num.equals("")) {
				System.out.println("====구매내역=====");
				System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
				
				while ((line = orderReader.readLine()) != null) {
					
					String[] temp = line.split(",");
					//temp[0]: 일렬번호
					//temp[1]: 제품명
					//temp[2]: 개수
					//temp[3]: 회원번호
					
					if (temp[3].equals(num)) {
						
						System.out.printf("%s\t%s\t%s\t%s\t%s\n", num, name, temp[1], temp[2], address);
						
					}//안 if
					
				}//while
					
			}//밖 if
				
			scan.close();
			memberReader.close();
			orderReader.close();
				
		} catch (Exception e) {
			System.out.println("at Q124.main");
			e.printStackTrace();
		}
		
	}//main
}//class
