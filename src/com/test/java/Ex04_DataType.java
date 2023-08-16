package com.test.java;

public class Ex04_DataType {

	public static void main(String[] args) {
		
		//변수 생성 방법, 주의할 점
		
		byte kor; //변수 선언
		kor = 100; //초기화
		System.out.println(kor); //출력
		
		//각 1줄 1줄을 문장(Statement) > 1개 이상의 표현식
		//문장 종결자 > ;
		
		byte eng;
		eng = 90;
		System.out.println(eng);
		
		byte math;
		math = 80;
		System.out.println(math);
		
		//Duplicate local variable kor
		// - 같은 이름의 변수명을 2개 이상 선언 불가능
		// - 변수명은 유일해야 한다.
		
		//변수명을 만들 때 규칙(*****) > 모든 것의 식별자를 만들 때 규칙
		//1. 영문자 + 숫자 + '_'만 사용한다. > 관습 + 물리
		//2. 숫자로 시작 불가능 > 물리
		//3. 예약어(키워드 > 자주색) 사용 불가능
		//4. 의미있게(******************) > 풀네임(*****) 생략 X
		//5. 대소문자 구분
		
		
		//age
		byte age;
		byte Age;
		
		
		
		byte kor1;
		byte kor_1;
		byte kor$; // JAVA에서는 $를 변수명으로 쓰는 일은 거의 없다.
		//byte kor1();
		//byte kor+;
		
		//byte 1kor;
		//byte byte;
		
		byte b1;
		b1 = 100;
		System.out.println(b1);
		
		//수정, 치환
		b1 = 50; //기존값 100을 가지고 있는 변수 b1에 새롭게 50을 대입
		System.out.println(b1);
		
		//변수(변하는 데이터) vs 상수(변하지 않는 데이터)
		// - 표현은 동일한데, 그 값이 변하는지? 안변하는지?
		// - 프로그래밍의 상수 > 데이터(***)
		
		System.out.println(100); //점수 100점 > 100
		System.out.println(100); //100
		System.out.println(100); //100
		
		byte score;
		score = 100;
		System.out.println(score); //100
		
		score = 90;
		System.out.println(score); //100 > 90
		
		score = 80;
		System.out.println(score); //100 > 80
		
		//국어 점수(100) > 화면에 출력
		//byte kor;
		kor = 100;
		System.out.println(kor); //국어 점수 출력 > 가독성 높음 > 변수명 = 의미
		
		System.out.println(100); //국어 점수 출력 > 가독성 낮음 > 상수는 데이터 표현 자체로는 의미가 없다....
		
		//프로그래밍 발전 방향 > 코드 재사용
		
		//변수 생성하기
		byte b2; //변수 선언문
		b2 = 100; //변수 초기식
		
		byte b3 = 100; //선언 + 초기화
		
		byte b4;
		byte b5;
		
		byte b6, b7; //위의 2 줄을 이렇게 줄여 쓸 수 있음!
		byte b8, b9, b10, b11;
		
		byte b12 = 100, b13 = 50, b14 = 90;
		
		byte b15 = 100, b16, b17; //일부는 초기화 하고 일부는 선언만도 가능!
		
		
		//지도 좌표(x, y)
		byte x1; //현재 x좌표
		byte y1; //현재 y좌표
		
		byte x2, y2; //마트 x좌표, 마트 y좌표 -> 주석 2:2로 달려서 수가 길어지면 불편
		
		byte x3, //마트 x좌표
			 y3; //마트 y좌표   -> JAVA는 enter를 인식하지 않기 때문에 두 줄 나눠서 사용하면 주석이 1:1로도 달리니 더 편안-
		
		
		//변수명 명명법 패턴
		//1. 헝가리언 표기법
		//2. 파스칼 표기법
		//3. 캐멀 표기법
		//4. 스네이크 표기법
		//5. 케밥 표기법
		
			//1. 헝가리언 표기법
			// - 식별자를 만들 때 식별자의 접두어로 자료형을 표시하는 방법
			// - 자바에서 많이 사용 안함
			// - 가끔 사용 > 인터페이스명
		
			byte weight; 
			byte byte_weight;
			byte byteWeight;
			byte bweight;
			byte bWeight;
			byte b_weight;
			
		 	// -> 개발 툴이 발전하면서 커서를 가져다 대도 자료형 확인이 가능하여 요즘 잘 사용 안함
			// 변수명 누르고 F3 또는 컨트롤 누르고 변수명 클릭 시, 해당 변수가 쓰인 상위로 이동하여 확인 가능
		
			//2. 파스칼 표기법
			// - 식별자 단어의 첫문자를 대문자 표기 + 나머지 문자는 소문자로 표기
			// - 2개 이상 단어로 만든 합성어 > 모든 단어 붙임 > 각 단어의 첫문자를 대문자
			// - 사용) 클래스명
			
			byte height;
			byte Height; //파스칼 표기법
			
			byte englishscore; //가독성 낮음
			byte EnglishScore; //파스칼 표기법
			
			//3. 캐멀 표기법
			// - 식별자 단어의 첫문자를 소문자 표기 + 나머지 문자는 소문자로 표기
			// - 2개 이상 단어로 만든 합성어 > 모든 단어 붙임 > 각 단어의 첫문자를 대문자
			// - 사용) 변수명, 메소드명
			
			byte mathscore;
			byte MathScore; //파스칼 표기법
			byte mathScore; //캐멀 표기법
			
			byte MapPositionLatitude; //파스칼
			byte mapPositionLatitude; //캐멀
			
			//코드 컨벤션
			
			//4. 스네이크 표기법
			// - 전부 소문자 표기
			// - 합성어 > 각 단어를 '_'로 연결
			//(JAVA에서는 딱히 스네이크 표기법이 어디에 쓰인다는 규칙은 없음)
			
			byte english_score; //스네이크 표기법
			
			//5. 케밥 표기법
			// - 전부 소문자 표기
			// - 합성어 > 각 단어를 '-'로 연결
			// - 자바에서는 사용 불가능 > minus 연산자로 인식해서
			// - 사용) HTML, CSS
			
			//byte english-score; //케밥 표기법
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
