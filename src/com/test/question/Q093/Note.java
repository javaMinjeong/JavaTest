package com.test.question.Q093;

//TODO 내가 구현 못한 것 : 얇다, 보통, 두껍다 구분, 소유자 이름 한글 유효성 검사, 필수값으로 구분 유효성 검사
class Note {
	
	//TODO 가격때문에 해설에서는 기본값을 private 변수 선언 때 값까지 기본값으로 초기화 시킴.
	private String size = "A5";
	private String color = "흰색";
	private int page = 10;
	private String owner;
	private int price = 500;

	// setter, getter 구현


	// size(크기) > 쓰기 전용 > A3,4,5, B3,4,5
	public void setSize(String size) {
		if (size.equals("A3") 
				|| size.equals("A4") 
				|| size.equals("A5") 
				|| size.equals("B3") 
				|| size.equals("B4")
				|| size.equals("B5")) {
			this.size = size;
		} else { //실제 업무에서는 else절 이하(잘못된 값 기입 시 H/D절차) 꼭 선임한테 물어보고 진행!! 함부로 입력하지 않기 > 실수 발생
			System.out.println("올바른 크기를 입력하세요.");
		}

	}// setSize

	// color(표지 색상) > 쓰기 전용 > 검정, 흰, 노란, 파란
	public void setColor(String color) {
		if (color.equals("검정색") 
				|| color.equals("흰색") 
				|| color.equals("노란색") 
				|| color.equals("파란색")) {
			this.color = color;
		} else {
			System.out.println("올바른 표지 색상을 입력하세요.");
		}

	}

	// page(페이지수) > 쓰기 전용 > 10~200
	public void setPage(int page) {
		if (page >= 10 && page <= 200) {
			this.page = page;
		} else {
			System.out.println("올바른 페이지수를 입력하세요.");
		}

		//페이지 얇은, 보통, 두꺼운은 info()에 말고 여기 메소드에 작성하는게 info()가 훨 깔끔해짐!
		//이 경우 새로운 멤버변수를 만들면 됨!!
		//위에 String thickness = ""; 멤버변수 만들면 아래 info 메소드에서도 호출해서 사용 가능!!
		
		
		
	}//page
	
	/*
			쌤 해설) 
			2가지 검사 필요 > 한글인지, 길이가 2~5자 인지
		 	
	 **유효성 검사**
			- 검사할 기준 1개 > 무관
			- 검사할 기준 N개 > 잘못된 것을 찾기!!
			
			
	 **올바르지 않은것을 찾았을 때 작업하는 코드 > 이 패턴을 훨씬 더 많이 씀!
			if (page < 10 || page > 200) {
				return;
			}
			
			this.page = page;

	 */

	
	// owner(소유자이름) > 쓰기 전용 > 한글 2~5자 이내. 필수값
	public void setOwner(String owner) {

		//쌤 해설*************************************
		//문자코드 값 필요 > charAt 사용
		//그외 작업 > substring 사용
		
		//한글 2~5자 이내
		boolean result = false;
		//글자수
		if (owner.length() >= 2 && owner.length() <=5) {
			
			//한글
			for (int i=0; i<owner.length(); i++) {
				
				char c = owner.charAt(i);
				
				//홍A동 > 잘못된 글자를 만나는 순간 나머지 뒷글자를 검사하면 안되므로 break로 for문 빠져나가야 함!
				if (c >= '가' && c <= '힣') {
					result = true;
				} else {
					result = false;
					break;
				}
				
				
			}//for
			
			if (result) {
				this.owner = owner;
			}
			
		}
		
		//이 아래로는 잘못된거 찾기
		
		if (owner.length() < 2 || owner.length() > 5) {
			return;
		}
		
		for (int i=0; i<owner.length(); i++) {
			
			char c = owner.charAt(i);
			
			if (c < '가' || c > '힣') {
				return;
			}
		}
		
		this.owner = owner;
		
		
		//************************************************
		
		
		
		
		//한글 유효성 검사: char '가'~'힣' 까지
//		char temp = ' ';
//		
//		for (int i=0; i<owner.length(); i++) {
//			temp = owner.charAt(i);
//			if (temp >=)
//		}
		
		if (checkLength(owner) && checkKorean(owner)) {
			this.owner = owner;
		} else {
			System.out.println("올바른 소유자 이름을 입력하세요.");
		}
		
	

	}

	private boolean checkKorean(String owner) {

		for (int i=0; i<owner.length(); i++) {
			char c = owner.charAt(i);
			
			if (c <'가' && c > '힣') {
				return false;
			} else {
				return true;
			}
		}
		
		return false; //TODO 아~ 어차피 여기까지는 못닿아서 상관없나? 메소드쪽 다시 복습!!!
	}

	private boolean checkLength(String owner) {
		
		if (owner.length() >= 2 && owner.length() <= 5) {
			return true;
		}
		return false;
	}

	public String info() {
		
		int price = 500;
		
		switch(size) {
		case "A3": 
			price += 400;
			break;
		case "A4":
			price += 200;
			break;
		case "B3":
			price += 500;
			break;
		case "B4":
			price += 300;
			break;
		case "B5":
			price += 100;
		}
		
		switch(color) {
		case "검정색":
			price += 100;
			break;
		case "노란색": case "파란색":
			price += 200;
			break;
			
		}
		
		price += (this.page-10) * 10;
		
		//페이지 수가 얇은, 보통, 두꺼운 종류도 여기에 조건을 걸었네 if 절로!! > String tempPage라는 새로운 변수를 사용하여
		
		String tempPage = "";
		
		if (this.page >= 10 && this.page <= 50) {
			tempPage = "얇은";
		} else if (this.page >= 51 && this.page <= 100) {
			tempPage = "보통";
		} else if (this.page >= 101 && this.page <= 200) {
			tempPage = "두꺼운";
		}
		
		
		//참조형의 값이 없는건 "" 가 아닌 null 이다!!!!!!
		String temp = "";
		temp = "■■■■■■ 노트 정보 ■■■■■■\n";

		//TODO 문자열 비교는 대입연산자가 아니라 equals 사용하는데 왜 null 값에서는 사용 하면 오류가 뜨는지? 여기는 != 사용해줘야 하나?
		if (this.owner != null) {

			temp += String.format("소유자 : %s\n", this.owner);
			temp += String.format("특성 : %s %s %s노트\n", this.color, tempPage, this.size);
			temp += String.format("가격 : %,d원\n", price);
			//TODO this.price = price로 치환한게 없는데 왜 this.price 써야하는지?!
			//TODO ++ this.thickness도!!
		} else {
			temp += "주인 없는 노트\n";
		}
		
		temp += "■■■■■■■■■■■■■■■■■■■■■■\n";
		
		
		return temp;
		
		//하나의 메소드에서는 목적에 맞는 하나의 행동만 하기 >> 가격은 다른 메소드로 빼기
		//페이지 두께도 위에 페이지로 빼기!!
	}
}