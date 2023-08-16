// 주석, Comment
// - 컴파일 작업 때 제외하는 영역

// 단일 라인 주석. 엔터까지 주석 영역 → 한줄짜리 주석

/*
	다중 라인 주석
	하나
	둘
	셋
	**별표 줄마다 안붙이려면 '/*, 별슬래시' 입력하고 따로 줄바꿈해서 닫고 중간에 입력해야 함.
*/

// 단축키 사용
// - 단일 라인: Ctrl + / → 기 입력된 내용에 커서 대고 단축키 입력 시 해당 줄 주석처리 됨. 재 입력 시 주석 해제 (java에선 단일 라인 위주 사용)
// - 다중 라인: Ctrl + Shift + /, Ctrl + Shift + \→ 기 입력된 내용 드래그 후 단축키 입력시 선택 영역 주석처리 됨. 

// 패키지 선언
// - 현재 자바 파일이 어떤 패키지 내에 위치하는지 표현
package com.test.java;

// 클래스, Class
// - 코드의 집합
// - public class Ex01 : 클래스 선언부(Header)
// - {} : 클래스 몸통(Body), 구현부

// "Ex01이라는 클래스입니다."
public class Ex01 {

	// 메소드, Method
	// - 코드의 집합
	public static void main(String[] args) {
			
		// 명령어 > 문장 단위 구성
		
		// 문장입니다.
		// 자바의 문장 종결자: ';' → java 뿐만 아니라 많은 프로그램이 문장 종결자로 세미콜론 사용.
		
		// - System: 클래스
		// - . : 멤버 접근 연산자(Member Access Operator) → 부모.자식
		// - out: 필드(field)
		// - println(): 메소드 호출
		// - "안녕하세요.": 문자열
		System.out.println("안녕하세요.");
		
		/*
		
			특수문자(영문 표현)
			- ~, !, @, #, $, %, ^(caret, xor), &, *, -, _, +, =
			- ;, :, ", ', ?, /(slash), \(back slash)
			- `(역따옴표, back quote, back tick)
			- |(pipe, vertical bar, or)
			- (): 소괄호
			- {}: 중괄호
			- []: 대괄호
			- <>: 화살표 괄호
			
			폰트 > 프로그래밍 폰트 추천 > Consolas Font 좋아용 > Hack도 좋아용 > 나눔고딕코딩, D2 Coding Font도 좋아용(by Naver)
								 > Monaco도 좋아용
			- 1, l, I, |, i
			- 0, o, O, D
			- ", ''
			
			이클립스 > 코드 자동 완성 > Ctrl + Space
			- 현재 상태에서 사용 가능한 문법만 보여준다.(중요★★★★) → Error 날 일이 없음! + 도움말도 같이 제공 해줌!
			
			코드 자동 완성 후 '녹색바' 위치 자세히 보기!! > 녹색바간의 이동은 Tab키 사용
			
		*/
		
		// 단축어: syso + Ctrl + Space
		// 복붙: 해당 줄(특정 블럭 단위 copy도 가능)에 커서 대고 Ctrl + Alt + 방향키(위/아래)
		// 이동: 해당 줄(특정 블럭 단위 이동도 가능)에 커서 대고 Alt + 방향키(위/아래)
		System.out.println(100);
		System.out.println(200);
		System.out.println(300);
		
		//특정 영역 선택(블럭 잡기): Shift + 방향키(위,아래,좌,우,Home,End)
		
		//라인 삭제: 해당 줄에 커서 대고 Ctrl + D -> 해당 라인 삭제
		//단축키 목록 보여주는 단축키: Ctrl + Shift + L
		//탭전환: Ctrl + F6 > Ctrl + Tab으로 변경해주는게 더 편함~~
		//단축키 설정은 어디서 해용? > Window-Preference-Keys 에서~~
		
		
	}
	
}
