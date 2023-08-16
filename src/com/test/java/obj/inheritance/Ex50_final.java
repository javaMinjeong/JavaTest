package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex50_final {

	public static void main(String[] args) {
		
		/*
			final 키워드
			- 한번 결정하면 바꿀 수 없다.
			- 안전성 높음 (안전성을 향상시키기 위해 종종 쓰는 도구)
			
			1. 변수 적용(지역 변수, 멤버 변수)
				- 초기화 이후 값을 변경할 수 없다.
				- 상수
			
			2. 메소드 적용
				- 상속(에서만 일어나는 일)
				- 오버라이드 금지!!
				- 부모 메소드 > 수정하지 못하게
				
			3. 클래스 적용
				- 상속(에서만 일어나는 일)
				- 부모 클래스 > 수정하지 못하게
				
			final은 1번 변수에서 가장 활용도가 높으며, 2-3번은 활용도가 비교적 낮다.
		*/
		
		//지역 변수
		int a = 10;
		a = 20;
		a = 30;
		
		//final 변수 = 상수
		final int b = 10;
		//b = 20; //The final local variable b cannot be assigned. It must be blank and not using a compound assignment
		
		//final로 먼저 선언하고 후에 초기화도 가능하나 > 권장하지 않음. > final 확인 못할 시, 변수처럼 보일 가능성 多
		//비권장 > 변수처럼 보여서..
		final int c;
		c = 10;
		//c = 20; //The final local variable c may already have been assigned
		
		//권장 > 선언과 초기화
		final int d = 10;
		
		final int E = 10; //변수명을 '대문자'로 작성해야함!!!!!!!
		
		//멤버 변수에 final 설정
		Test t = new Test();
		t.a = 20;
		//t.b = 30; //The final field Test.b cannot be assigned
		
		test(100);
		
		System.out.println(Calendar.YEAR); //캘린더 상수
		//Calendar.YEAR = 2; // The final field Calendar.YEAR cannot be assigned
		
		int gender;
		gender = 1;
		gender = 2;
		
		int male = 1;
		int female = 2;
		//의미는 생겼으나 변수니까 누군가가 male에 2를 넣으면 큰일 남. 그래서 final을 붙여 상수로 만들기
		
		//아래 두 아이들은 지역변수라 이 메소드에서밖에 못쓰나
		final int MALE = 1;
		final int FEMALE = 2;
		
		//아래와 같이 새로 클래스를 생성하여 static final 멤버 변수 지정 > 여기서의 static은 공용 사용의 느낌이 아니라, 인스턴스를 안만들고 바로 정적 방식으로 접근하기 위해 static을 만든거일 뿐.
		//static은 obj를 안만들고도 손쉽게 변수를 이용하기 위해 사용하기도 함!!
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
	}//main
	
	public static void test(final int a) {
		System.out.println(a);
		//a = 200; //The final local variable a cannot be assigned. It must be blank and not using a compound assignment
	}
	
}//class

class Test {
	public int a = 10;
	public final int b = 20; //멤버 변수
}

//남자(1), 여자(2) > 열거값
class Gender {
	public final static int MALE = 1;
	public final static int FEMALE = 2;
}

class FinalParent {
	
	//부모 클래스 설계..
	// - test() 메소드가 매우 중요 > 나중에 상속받은 자식 클래스가 이 test() 메소드를 재정의하면 안될 것 같다!!!
	final public void test() {
		System.out.println("부모 메소드");
	}
}

class FinalChild extends FinalParent {
	
//	@Override
//	public void test() { //Cannot override the final method from FinalParent
//		System.out.println("자식 메소드");
//	}
	
}

//나는 나살기도 바빠! 나 이후로는 자식을 만들지마랏!! > 상속 불가능
//부모 클래스 설계..
// > 안정성 높음.
final class FinalMember {
	
	
}

//class FinalUser extends FinalMember { //The type FinalUser cannot subclass the final class FinalMember
//}