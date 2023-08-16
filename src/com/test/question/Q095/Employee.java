package com.test.question.Q095;

class Employee {
	
	//TODO 내가 구현하지 못한것 : 직속상사 관계 설정, 연락처 유효성검사에 전체 번호 자리 셋팅해야하는지?
	// >> 쌤은 연락처 유효성검사를 전혀 다른 방식으로 함! 일단 - 는 제외하고 -위치에 따라서 1차 유효성 검사 > 전화번호 자리수 입력에 대한 유효성 검사 OK. 2차 유효성 검사 > 각 자리가 0~9로 이루어진 숫자인지에 대한 유효성 검사 OK.
	
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	// getter, setter 구현

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//2~5자 이내 유효성 검사
		if (name.length() < 2 || name.length() >5) { //TODO 이거 범위설정 처음에 &&로 잘못 입력함!!!복습하세욧!!!
			return;
		} 
		
		//한글 유효성 검사
		for (int i=0; i<name.length(); i++) {
			
			char c = name.charAt(i);
			if (c < '가' || c > '힣') { //TODO 얘 또 범위설정 &&로 잘못입력함!!
				return;
			}
		}
		//위에서 걸리면 메소드 나가버리니까 안걸린 애들만 내려오면 그 아이들(name)은 this.name이 된다.
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {

		//부서 입력 유효성 검사
		if (department.equals("영업부")
				|| department.equals("기획부")
				|| department.equals("총무부")
				|| department.equals("개발부")
				|| department.equals("홍보부")) {

			this.department = department;
		}
		
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		//직책 입력 유효성 검사
		if (position.equals("부장")
				|| position.equals("과장")
				|| position.equals("대리")
				|| position.equals("사원")) {
			
			this.position = position;
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		
		//연락처 쓰기 유효성 검사
		// 010-XXXX-XXXX 형식 확인 > substring으로 "-"인지, 앞4자리 010- 인지 확인
		//TODO 흠... 010-, -, - 이것 확인만으로 유효성 검사가 될까? 뒤에 구간별 4자리 입력한거 맞는지 유효성 검사 or 전체 길이 유효성검사 추가로 진행 안해도 되나...?
		if (tel.substring(0,4).equals("010-")
				&& tel.substring(8,9).equals("-")) {
			this.tel = tel;
		}
		
	}

	public Employee getBoss() {
		return boss;
	}

	//직속상사: 같은 부서가 아니면 될 수 없음(유효성 검사)
	public void setBoss(Employee boss) {
		
		//TODO 오잉 position이 같다는걸 어떻게 구현행..
			//TODO 여기 직속상사 없음을 어떻게 표현할지 모르겠음!! 자꾸 Employee 는 문자쓸수없다는 오류만 나옴
			//아...! Employee boss 라는 변수를 생성했는데. Emplyee 클래스 내에는 또 position, 기타 등등의 변수가 있으니까. boss의정보를 또 가져올 수 있는건가...?
		
		if (boss == null) {
			return;
		} 
		//TODO 여기서 boss.name이 아닌 boss.getName()과 비교해야 하는 이유는?
		if (this.name.equals(boss.getName())
				&& this.department.equals(boss.getDepartment())
				&& this.position.equals(boss.getPosition())
				&& this.tel.equals(boss.getTel())) {
			return;
		}
		if (!this.department.equals(boss.getDepartment())) {
			return;
		}
		this.boss = boss;
		
	}//boss

	public void info() {

		//String result = ""; > 이거 필요없음. 왜? void 메소드라 String result값을 반환할게 아니니까 걍 출력하기

		System.out.printf("[%s]\n", this.name);
		System.out.printf("- 부서: %s\n", this.department);
		System.out.printf("- 직위: %s\n", this.position);
		System.out.printf("- 연락처: %s\n", this.tel);
		
		//TODO ??? 골때리네 직속상사 왜 안나옴 > 내가 position이 동일해야만 boss라고 조건 잘못걸음 ㅎ...department인디...ㅎ
		if (this.boss == null) {
			System.out.printf("- 직속상사: %s\n", "없음");
		} else {
			System.out.printf("- 직속상사: %s(%s %s)\n", this.boss.getName(), this.boss.getDepartment(), this.boss.getPosition());
			
		}
		
		//아래가 처음에 한거
//		if (boss == null) {
//			System.out.printf("- 직속상사: %s\n", "없음");
//		} else {
//			System.out.printf("- 직속상사: %s(%s %s)\n", this.boss, boss.department, boss.position);
//			
//		}
		
	}
}