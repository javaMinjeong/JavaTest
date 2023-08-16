package com.test.question.Q096;

//cook 만들어서 넣어라
//check 품질검사
//list > dump 메소드

class Box {
	private Macaron[] list = new Macaron[10];

	public void cook() {
		//여기서 만들어서 넣어라?
		//마카롱의 크기, 색상, 샌드 두께 모두 난수로 설정!!!
		
		//색상 난수 설정을 위한 색상 배열 생성
		String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
		
		for (int i=0; i<list.length; i++) {
			//마카롱 객체 메소드 사용하기 위해 객체 생성
			Macaron m = new Macaron();
			
			//생산크기 (5~15 난수 생성)
			m.setSize((int)(Math.random()*11)+5);
			
			//생산 색상 위 color배열에서 무작위 생성
			//TODO 근데 왜 여기서 color.length-1이 아니라 구냥 color.length 지..?
			//최대값-최소값+1 이라서 그런건 알겠는디.. 갑자기 이해가 안되네
			m.setColor(color[(int)(Math.random()*color.length)]);
			
			//생산 샌드 두께 (1~20 난수 생성)
			m.setThickness((int)(Math.random()*20)+1);
			this.list[i] = m;
		}//for
				
		System.out.printf("마카롱을 %d개 만들었습니다.\n",list.length);
		System.out.println();
	}

	public void check() {
		//품질검사해라?
		
		int pass = 0;
		int nonpass = 0;
		
		
		for (int i=0; i<list.length; i++) {
			
			//아~~~ 난 그냥 합격/불합격 검증 메소드에 냅다 this.list[i]라고 때려박았는데 그거보다 쌤 해설처럼 Macaron m = this.list[i]라고 써주고, 검증 메소드에 checkQC(m)이라고 넣어주면 제 3자가 볼 때 더 가독성이 좋긴 하겠다.
			
			if (checkQC(this.list[i])) {
				pass++;
			} else {
				nonpass++;
			}
			
		}
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n", pass);
		System.out.printf("QC 불합격 개수 : %d개\n", nonpass);
		System.out.println();
	}

	
	//마카롱 QC검사를 위한 boolean 메소드
	//아닌 조건에 해당되면 return; 다 통과하면 true;
	private boolean checkQC(Macaron m) {
		
		//하나의 조건에라도 해당이 되면 판매가 불가하니 if 절에 해당 되는 true값 반환 시 return false;
		
		//TODO 아...쌤이 푸신 방식처럼 !(해당하는 조건) 이렇게 하면 걍 안되는 조건 되겠구나...????
		if (m.getSize() < 8 || m.getSize() > 14) {
			return false;
		}
		
		//TODO 아 이거 또 잘못썼다...string인데 또 ==로 씀 ㅠㅠequal 이라고오ㅗ옹오오옹오오오오오오오
		if (m.getColor() == "black") {
			return false;
		}
		
		if (m.getThickness() < 3 || m.getThickness() > 18) {
			return false;
		}
		
		//위 모든 case중 하나라도 해당이 되면 false값 반환. 그 어느것에도 해당이 안되면 판매 가능하므로, true값을 반환
		return true;
	}

	//dump method 생성
	public void list() {

		System.out.println("[마카롱 목록]");
		for (int i=0; i<this.list.length; i++) {
			
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n"
								, i+1
								, this.list[i].getSize()
								, this.list[i].getColor()
								, this.list[i].getThickness()
								, checkQC(this.list[i]) ? "합격" : "불합격");
			
		}
	
	
	
	
	}
}
