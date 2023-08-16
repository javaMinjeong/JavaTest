package com.test.java;

public class Ex08_Escape {

	public static void main(String[] args) {

		//특수 문자 > Escape Sequence
		// - 컴파일러가 번역을 할 때, 소스상에 있는 문자를 그대로 출력하지 않고, 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		// 앞에 역슬래시 + 뒤에 문자
		
		//1. \n
		// - new line, line feed
		// - 개행 문자(엔터)
		
		char c1 = '\n'; //1글자로 취급
		String s1 = "\n";
		
		//요구사항] "안녕하세요. 홍길동입니다." 출력해주세요.
		//수정사항] "안녕하세요."과 "홍길동입니다." 각각 다른 줄에 출력   ***문자열 리터럴 내에는 엔터 사용 불가*** 이때 \n 사용
		//변수를 만들어서 저장하고, 변수를 사용하여 여러가지 행동을 하는것이 나중을 봤을 때 좋은 코드가 될 확률이 높아짐. 데이터 상수 바로 사용 지양.
		
		System.out.println("안녕하세요. 홍길동입니다.");
		
		String msg = "안녕하세요.\n홍길동입니다.";
		System.out.println(msg);
		System.out.println();
		
		//2. \r
		// - carriage return
		// - 캐럿의 위치를 현재 라인의 맨 앞으로 이동
		// - 키보드 > Home 키 역할
		// - 이클립스에서는 정상 동작X **콘솔에는 삽입모드 없이 무조건 덮어쓰기 됨.**
		msg = "안녕하세요. \r홍길동님"; // -> 홍길동님요.
		System.out.println(msg);
		
		//CR&LF
		
		
		//운영체제의 엔터
		//1. 윈도우: \r\n
		//2. 맥OS: \r   -> 깃헙 사용할 때 엔터 관련해서 문제가 있지만 현재는 커버쳐주는 애들이 있음
		//3. 리눅스: \n
		
		System.out.println("하나\r\n둘");
		System.out.println("하나\n둘");
		
		
		//3. \t
		// - tab, 탭문자
		// - 탭이 뭐에요?
		// - 탭 > 행동X > 약속된 표시 O
		// - 서식 작업(열 맞추기)
		
		msg = "하나\t둘\t셋";
		System.out.println(msg);
		
		msg = "하나	둘	셋"; //권장X -> 가독성 때문..
		System.out.println(msg);
		
		//4. \b
		// - backspace
		// - 이클립스 콘솔에서는 동작 안함
		
		msg = "홍길동\b입니다.";
		System.out.println(msg); // 제대로된 결과: 홍길입니다.
		
		//5. \", \', \\
		// - (", ', \)가 이미 역할을 가지고 있는 문자 > 출력하기 위해 의미없게 만드는 이스케이프 문자
		
		//요구사항] 홍길동: "안녕하세요" <<그대로 화면 출력해주세요.
		
		msg = "홍길동: \"안녕하세요\"";
		System.out.println(msg);
		
		//요구사항] 수업 폴더의 경로를 출력하세요.
		//C:\class\code\java
		
		//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		System.out.println("수업폴더 > C:\\class\\code\\java");
		System.out.println("C:\\class\\code\\java"); //"" 먼저 만들고 그 안에 경로 붙여넣으면 이클립스가 알아서 수정해줌!
		
		
		
		
		
		
	}

}
