package com.test.java;

import java.util.Scanner;

public class Ex34_String {

	public static void main(String[] args) {

		//문자열, String
		// - JDK 제공하는 문자열 조작 기능
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6(); 7.28부터~
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		m13();
		
		
	}//main

	private static void m13() {

		//문자열 분리
		// - String[] split(String delimiter)
		// - 구분자를 기준으로 쪼개는 메소드
		
		String name = ",홍길동,아무개,유재석,,강호동,박명수,";
		
		String[] temp = name.split(","); //구분자는 사라진다.
		
		for (int i=0; i<temp.length; i++) {
			System.out.println(i + ":" + temp[i]);
		}
		
		
		
	}//m13

	private static void m12() {

		//문자열 치환(바꾸기)
		// - String replace(String old, String new)
		// - 문자열의 일부(old)를 다른 문자열(new)로 바꾸는 메소드
		
		String txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		
		//3등분하고 홍길동 지우고, 새로운거추가한 후 3개를 1개로 다시 합치는 방법 > 아! 일이 너무 커! 대체 > replace 활용
		int index = txt.indexOf("홍길동");
		
		String temp1 = txt.substring(0,index); //"안녕하세요. "
		String temp2 = txt.substring(index + 3); //"입니다."
		
		System.out.println(temp1 + "아무개" + temp2);
		
		//replace 활용
		System.out.println(txt.replace("홍길동", "아무개")); //txt에 수정 발생 시, 모두 반영 But 위에서 사용한 temp를 이용한 방식은 수정사항 발생 시, 다시 코드 작성 필요
		
		//*** replace로 무언가를 삭제하고 싶으면.. 찾아서 ""로 교체하면 된다.
		txt = "     하나     둘     셋     ";
		System.out.println(txt.trim()); //> 앞, 뒤 공백 제거
		System.out.println(txt.replace(" ", "")); //> 모든 공백 제거
		
	}//m12

	private static void m11() {

		//문자열 검색
		// - indexOf(), lastIndexOf()
		// - startsWith(), endsWith()
		
		// - boolean contains(String) > 있으면 true, 없으면 false > 가장 단순 패턴
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.contains("아무개"));
		
		
	}//m11

	private static void m10() {

		//문자열 추출 > 여러글자를 뽑아오는 아이
		// - String substring(int beginIndex, int endIndex)
		// - String substring(int beginIndex)
		// - beginIndex: 포함(inclusive)
		// - endIndex: 미포함(exclusive)
		
		//*** 자바에서는 범위를 나타낼 때 > 시작(포함) ~ 끝(미포함)
		
		
		String txt = "가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(3, 7));
		System.out.println(txt.charAt(5)); //'바' > charAt 써야할 때는 > 문자코드값 변환 O
		System.out.println(txt.substring(5, 6)); //"바" > 문자코드값 변환 X > 1글자를 가져올 수도, 여러글자를 가져오는것도 모두 가능!
		System.out.println(txt.substring(3)); // endIndex가 없으면 문자열이 끝날때까지 추출해라!
		System.out.println();
		
		//charAt() > 한글자를 뽑아오는 아이
		
		//주민등록번호
		String jumin = "970728-1012345";
		
		//성별?
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7,8).equals("1") ? "남자" : "여자");
		
		//몇년생?
		System.out.println(jumin.charAt(0) + jumin.charAt(1)); //값: 112 > 문자코드값 더하기 연산 > '9'(57) + '7'(55) = 112
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1)); //앞에 "" 추가하여 문자열 더하기로 바꿔서도 불러올 수 있지만, 번거로우니 substring 사용
		System.out.println(jumin.substring(0,2));
		
		//몇월생?
		System.out.println(jumin.substring(2,4));
		
		//몇일생?
		System.out.println(jumin.substring(4,6));
		System.out.println();
		
		//---------------------------------------------------------
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		//1. 파일명 추출 > "Ex34_String.java"
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index + 1);
		System.out.println(filename);
		
		//2. 확장자 없는 파일명 추출 > "Ex34_String"
		index = filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0, index);
		System.out.println(filenameWithoutExtension);
				
		//3. 확장자 추출 > ".java"
		String extension = filename.substring(index);
		System.out.println(extension);
		
	}//m10

	private static void m9() {

		//패턴 검색
		// - boolean startWith(String)
		// - boolean endsWith(String)
		
		String txt = "자바 프로그래밍";
		
		System.out.println(txt.startsWith("자바"));
		System.out.println(txt.startsWith("프로그래밍"));
		//특정 문자열로 시작하는 패턴을 가지고 있으면 > true
		//							 아니면 > false
		
		System.out.println(txt.endsWith("자바"));
		System.out.println(txt.endsWith("프로그래밍"));
		//특정 문자열로 끝나는 패턴을 가지고 있으면 > true, 아니면 false
		
		String name = "홍길동";
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍') == 0);
		
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.indexOf("동") == name.length() - 1);
		System.out.println();
		
		//파일 경로
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		//해당 파일이 '자바 소스 파일' 입니까? > 확장자 검사
		if (path.endsWith(".java")) {
			System.out.println("자바 소스 파일");
		} else {
			System.out.println("다른 파일");
		}
		
		
		
		
	}//m9

	private static void m8() {

		//대소문자 변경
		// - String toUpperCase()
		// - String toLowerCase()
		
		String content = "오늘 수업은 Java입니다.";
		String word = "java";
		
		
		System.out.println(content);
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
		//대소문자 구분(Case sensitive)
		// - 정확도 높음
		// - 검색율 낮음
		if (content.indexOf(word) > -1) {
			System.out.println("결과 O");
		} else {
			System.out.println("결과 X");
		}
		
		
		//대소문자 구분X(Case insensitive)
		// - 정확도 낮음
		// - 검색율 높음
		
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("결과 O");
		} else {
			System.out.println("결과 X");
		}

		
	}///m9

	private static void m7() {

		//주민등록번호 > '-' 기입
		String jumin = "970728-2012345";
		
		if (jumin.charAt(6) == '-') {
			System.out.println("O");
		} else {
			System.out.println("X");
		}

		//indexOf 사용 > 문자열로 여러글자를 조작할 수 있다는 특징때문에 훨씬 더 활용도가 높음!!!!!
		if (jumin.indexOf("-") == 6) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		//게시판 글쓰기 > 관리자 > 금지어!!!
		
		String word = "바보";
		String content = "안녕하세요. 반갑습니다~ 자바를 공부하고 있어요.";
		
		if (content.indexOf(word) > -1) {
			System.out.println("금지어 발견!!");
		} else {
			System.out.println("글쓰기 진행~");
		}
		
		String[] words = {"바보", "메롱", "멍청이", "ㅂㅏㅂㅗ"};
		
		for (int i=0; i<words.length; i++) {
			
			if (content.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견!!");
				break;
			} 
		}
		
		
	}//m7

	private static void m6() {

		//문자열 조작
		//1. int length()
		//2. char charAt(int)
		//3. String trim()
		
		
		//문자열 검색
		// - int indexOf(char)
		// - int indexOf(String)
		// - int indexOf(char, int)
		// - int indexOf(String, int)
		
		// - int lastindexOf(char)
		// - int lastindexOf(String)
		// - int lastindexOf(char, int)
		// - int lastindexOf(String, int)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = -1; //위치가 0번째 혹은 마지막 번째 일텐데, 못찾으면 숫자를 돌려줘야하니 음수로 반환
		//때문에 초기값을 음수로 정해줘야 함!!!! 양수일경우 다른 위치출력 결과와 중복될 수 있으니!!
		
		index = txt.indexOf('하');
		System.out.println(index);
		
		index = txt.indexOf('홍');
		System.out.println(index);
		
		index = txt.indexOf('김');
		System.out.println(index);
		
		index = txt.indexOf("홍길동");
		System.out.println(index); //여러 글자를 찾더라도 결과값은 첫번째 문자의 위치를 반환
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
		
//		index = txt.indexOf("홍길동", 0); // 뒤에 0이 입력되어 있다고 생각! 검색 시작 위치!!
//		System.out.println(index); //값: 7 > 첫번째 길동이 위치를 반환
//		
//		index = txt.indexOf("홍길동", 10);
//		System.out.println(index); //값: 22 > 시작위치부터 나오는 홍길동의 위치
//		
//		index = txt.indexOf("홍길동", 25);
//		System.out.println(index); //값: 38
		
		//for문 활용
//		for (int i=0; i<3; i++) {
//		index = txt.indexOf("홍길동", index);
//		System.out.println(index);
//		
//		index +=3;
//		}
		
		//while로 고쳐보기
		index = -1;
		
//		while (true) {
//			index = txt.indexOf("홍길동", index);
//
//			if (index == -1) { //홍길동을 못찾았니?
//				break;
//			}
//			
//			System.out.println(index);
//			
//			index =+3;
//			
//			System.out.println(index);
//			
//			index +=3;
//		}
		
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		
		//검색 방향: 왼쪽 > 오른쪽
		System.out.println(txt.indexOf("홍길동")); //7
		
		//검색 방향: 오른쪽 > 왼쪽
		System.out.println(txt.lastIndexOf("홍길동")); //22

		
		
		
		
		
		
	}//m6

	private static void m5() {

		//공백 제거
		// - String trim()
		// - 문자열내의 공백(Whitespace > (3종류) 스페이스, 탭, 개행)문자를 제거
		// - 문자열의 시작과 끝에 존재하는 공백을 제거한다.(***) > 대부분의 검색엔진, 게시판 검색창들이 트림처리 적용.
		
		String txt = "     하나     둘     셋     ";
		
		System.out.printf("[%s]\n",txt);
		System.out.printf("[%s]\n",txt.trim());
//		[     하나     둘     셋     ]
//		[하나     둘     셋]
		
		
		
	}

	private static void m4() {

		//주민등록번호: 970727-1000001
		
		String jumin = "970727-1000001";
		
		//System.out.println(jumin.charAt(6));
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
			
			if (jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
			
		} else {
			System.out.println("올바르지 않은 주민번호");
		}
		
		
	}

	private static void m3() {

		Scanner scan = new Scanner(System.in);
		
		//요구사항] 회원 가입 > 아이디 입력 > 영어 소문자만 입력
		
		System.out.print("아이디: ");
		String id = scan.nextLine();
		
		//아이디: hong > 덩어리 째로는 검사가 불가능 하고, h o n g 따로 나눠야 한다.
		
		for (int i=0; i<id.length(); i++) {
			
			char c = id.charAt(i);
			//System.out.println(c);
			
			//영소문자가 아니냐?
			if (c < 'a' || c >'z') {
				System.out.println("잘못된 문자가 발견되었습니다.");
				break;
			} 
			
		}
		System.out.println("종료");
		
		
		
	}//m3

	private static void m2() {

		//문자열 추출
		// - char charAt(int index)
		// - 자바: Zero-based Index (서수. 순서를 매길 때 0부터 시작한다.)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		//Returns the char value at thespecified index. An index ranges from 0 to length() - 1. The first char value of the sequenceis at index 0, the next at index 1,and so on, as for array indexing. If the char value specified by the index is a surrogate, the surrogatevalue is returned.

		char c = txt.charAt(7);
		System.out.println(c);
		
		c = txt.charAt(13);
		System.out.println(c);
		
		//java.lang.StringIndexOutOfBoundsException: index 14,length 14
//		c = txt.charAt(14);
//		System.out.println(c);
		
		//마지막 문자
		c = txt.charAt(txt.length()-1);
		
		
	}//m2

	private static void m1() {

		//문자열(String), 문자(char)
		//문자열 == 문자의 집합
		//String == char[]
		
		//문자열 조작 기능 == 배열 조작 기능 유사
		
		//문자열 길이
		// - int length()
		// - 문자열의 글자수
		
		//홍길동입니다.
		char[] clist = {'홍', '길', '동', '입', '니', '다', '.'};
		System.out.println(clist.length); //값: 7
		
		String str = "홍길동입니다.";
		System.out.println(str.length()); //값: 7
		
		//변수가 아닌 상수에 .을 찍어도 length 기능 사용 가능
		System.out.println("홍길동".length()); //값: 3
		
		//영어, 한글, 공백, 숫자, 특수문자 모두 1글자로 취급
		System.out.println("A1가$ ".length()); //값: 5
		
		//요구사항] 회원 가입 > 이름 입력 > 이름을 2자~5자 이내로 작성하시오.
		//     - 유효성 검사
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if (name.length() >= 2 && name.length() <= 5) {
			System.out.println("올바른 이름~");
		} else {
			System.out.println("이름을 2자~5자 이내로 작성하시오.");
		}
		
	}//m1

}//class
