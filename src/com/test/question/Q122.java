package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q122 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			성적을 확인 후 합격자/불합격자 명단을 출력하시오.
			
			조건)
			- 합격 조건: 3과목 평균 60점 이상
			- 과락 조건: 1과목 40점 미만
			
			위 조건에 따른 수식을 걸기 위해선 일단
			1. 데이터를 가져와서
			2. 컴마로 구분된 모든 데이터를 활용 가능하게 분리 후
			3. 조건 코드 작성하여 결과 출력하기
		
		*/
		
		//성적 확인후 합격자/불합격자 명단 출력 > 합격자 이름이 적힌 합격자 배열, 불합격자 이름이 적힌 불합격자 배열 출력
		//합격자, 불합격자 배열을 만들어서 데이터를 불러와 가공하여 조건 해당여부 확인 후 해당 배열에 이름 집어넣기
		
		try {
			
			//파일 읽기
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\성적.dat"));
			
			//합격자 & 불합격자 이름을 집어넣을 배열 만들기(선언 시 따로 길이를 요구하지 않기에 배열보다 ArrayList가 적합!)
			ArrayList<String> pass = new ArrayList<String>();
			ArrayList<String> nonpass = new ArrayList<String>();
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				//System.out.println(line); //확인용
				String[] temp = line.split(",");
				
//				temp[0]; //이름
//				temp[1]; //국어
//				temp[2]; //영어
//				temp[3]; //수학

				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				
				int avg = (kor + eng + math) / 3;
				
				//합격 조건 해당 > 합격 명단 추가
				if (avg >= 60
						&& (kor >= 40 && eng >= 40 && math >= 40)) {
					
					pass.add(temp[0]);
					
				} else {
					nonpass.add(temp[0]);
				}
				
				//불합격 조건 해당 > 불합격자 명단 추가
//				if (kor < 40 || eng < 40 || math < 40){
//				}
//				
				//split으로 나눈 데이터를 어떻게 가공하지??
				//매 라인별로 콤마로 나눠진 데이터는 이름/국어/영어/수학으로 종류가 나뉨.
				//해당 데이터 별로 while 루프 돌아가는 동안 이름값은 이름 배열에, 국어값은 국어 배열에, 영어값은 영어 배열에, 수학값은 수학 배열에 넣기
//				for (int i=0; i<student.length; i++) {
//					System.out.println(student[i]);
//					if (student[i])
//				}
				
			}//while
			
			//합격자 명단 출력
			System.out.println("[합격자]");
			for(int i=0; i<pass.size(); i++) {
				System.out.println(pass.get(i));
			}
			
			System.out.println();
			
			//불합격자 명단 출력
			System.out.println("[불합격자]");
			for (int i=0; i<nonpass.size(); i++) {
				System.out.println(nonpass.get(i));
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("at Q122.main");
			e.printStackTrace();
		}
		
		
		
		
	}
}
//과락 먼저 거르고, 평균 60 거르는 메소드를 따로 생성 시 뒤의 연산 필요 없음!!
