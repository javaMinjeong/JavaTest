package com.test.java.obj.inheritance;

public class Ex54_interface {

	public static void main(String[] args) {
		
		/*
			상속
			1. 단일 상속 > 부모가 1개
			2. 다중 상속 > 부모가 2개 이상
			
			*** 자바는 다중 상속을 허용하지 않는다.
			*** 인터페이스에 한해서 다중 상속을 허용한다. > 인터페이스는 구현부가 없어서..
			
			
		
		*/
		
		Hong hong = new Hong();
		hong.출근하다();
		hong.일을한다();
		hong.퇴근하다();
		//길동이는 한 사람이지만, 회사에서는 직원으로서의 행동, 집에서는 아빠로서의 행동이 필요!
		//직원으로서의 인터페이스와 아빠로서의 인터페이스를 동시에 상속 받자!
		hong.애들하고놀기();
		hong.낮잠자기();
		
		
		
		
	}//main
}//class



//여기서 인터페이스는 때와 장소에 따른 자격 > Roll
interface 직원 {
	void 출근하다();
	void 퇴근하다();
	void 일을한다();
}

interface 아빠 {
	void 애들하고놀기();
	void 돈벌기();
	void 낮잠자기();
}



class Hong implements 직원, 아빠{

	@Override
	public void 출근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 퇴근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 일을한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 애들하고놀기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 돈벌기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 낮잠자기() {
		// TODO Auto-generated method stub
		
	}
	
}


class Lee implements 직원 {

	@Override
	public void 출근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 퇴근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 일을한다() {
		// TODO Auto-generated method stub
		
	}
	
}
//클래스는 생소하지만, Hong이 가지고 있던 직원, 아빠라는 인터페이스를 상속받았네? > 내가 처음보는 클래스더라도 친숙

//무조건 어떤 클래스를 보면 그 집안부터 보기!! > 공부 & 업무에서도 많은 도움이 됨!!!
class Park implements 아빠 {

	@Override
	public void 애들하고놀기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 돈벌기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 낮잠자기() {
		// TODO Auto-generated method stub
		
	}
	
}