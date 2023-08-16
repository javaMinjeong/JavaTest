package com.test.question.Q104;

import java.util.Arrays;

public class MyArrayList {

	//ArrayList<String>
	private String[] list; //내부 배열이 문자열 배열이라는 가정 하에 만들기
	
	private int index; //*************************************
	
	public MyArrayList() {
		this.list = new String[4];
		this.index = 0;
	}
	
	//개발할 때 유용하게 사용 > toString()
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("length: %d\n", this.list.length)); //list 배열의 길이 찍기
		sb.append(String.format("index: %d\n", this.index)); //index 찍기
		sb.append(Arrays.toString(this.list) + "\n");
		
		
		return sb.toString(); //StringBilder가 가지고 있는 문자열 반환하기
	}
	

	public void add(String value) {
		
		if (checkLength()) {
			doubleList();
		
		}
		
		this.list[this.index] = value; //첫번째 값을 0번 방에 넣기
		this.index++; //index를 하나씩 증가하여 추가값을 넣을 경우 그 다음 방에 넣기

		
		//배열의 방이 남아 있는지? > 있으면..
		//					 > 없으면.. > 두배로 늘리기!!
			
			
	}
	
	private void doubleList() {

		String[] temp = new String[this.list.length * 2]; //현재 배열의 길이의 2배로 늘리기.
		
		//2배로 늘린 배열에 원래 있던 배열의 데이터를 깊은 복사 하기
		for (int i=0; i<this.list.length; i++) { //루프 횟수 > 짧은 배열 길이 기준으로 돌고 있음. temp 기준으로 하면 out of exception
			temp[i] = this.list[i];
		}
		
		//기존 4칸짜리 배열의 주소값을 버리고 8칸짜리 주소값으로 배열 교체
		this.list = temp; //배열 교체
		
		
	}

	public boolean checkLength() {
		
		if (this.list.length == this.index) {
			//방이 꽉 찼습니다.
			return true;
		}
		
		//방이 여유가 있습니다.
		return false;
		
	}
	
	public String get(int index) {
		
		//물리적으로는 있지만 대외적으로는 없는 방번호를 만들기 위한 로직
		if (index < 0 || index >= this.index) {
			//음수 거르고, 없는 방번호 요청 시 > 순수 ArrayList처럼 IndexOutOfBoundException 발생 시키기
			throw new IndexOutOfBoundsException(); //잘못된 방번호일경우 error 냅다 던지기
		}
		
		return this.list[index];
	}
	
	
	public int size() {
		//add가 호출된 횟수
		return index;
	}
	
//	//원하는 위치의 요소를 다른 값으로 수정한다.
//	public String set(int index, String value) {
//		
//		String temp = ""; //수정하기 전 요소의 값을 담을 도구
//		
//		temp = this.list[index]; //임시 도구에 수정하기 전 해당 방의 값 넣기
//		
//		this.list[index] = value; //수정할 요소의 위치의 방에 수정할 값 넣기
//		
//		return temp; //수정하기 전요소의 값을 반환
//	}
	
	public void set(int index, String value) {
		
		//물리적으로는 존재하나 논리적으로는 존재하지 않는 인덱스에 대한 예외 작성하기 (위 케이스와 동일 코드 사용)
		//물리적으로는 있지만 대외적으로는 없는 방번호를 만들기 위한 로직
		if (index < 0 || index >= this.index) {
			//음수 거르고, 없는 방번호 요청 시 > 순수 ArrayList처럼 IndexOutOfBoundException 발생 시키기
			throw new IndexOutOfBoundsException(); //잘못된 방번호일경우 error 냅다 던지기
		}
		
		this.list[index] = value;
		
	}
	
	
//	//TODO 왜 삭제하는게 한줄이 더 출력이 되지...?????마지막게 한번 더 출력 되는디 > 삭제된 요소값 반환
//	//원하는 위치의 요소를 삭제한다.
//	public String remove(int index) {
//		
//		String temp = ""; //삭제된 요소의 값을 담을 도구
//		
//		temp = this.list[index]; // 원하는 위치의 요소의 값을 temp에 담기(얕은 복사)
//		
//		//삭제 희망 위치로 뒤의 요소들을 한칸씩 앞으로 당기고, 마지막 방은 null값 만들어주기
//		for (int i=index; i<this.list.length-1; i++) {
//			
//			this.list[index] = this.list[index + 1];
//		}
//		
//		
//		return temp; //삭제된 요소의 값을 반환
//		
//	}
	
	public void remove(int index) {
		
		//요소 삭제 > 우측의 모든 요소 > 왼쪽으로 1칸 이동 > Left Shift
		for (int i=index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		
		//삭제 후, index를 하나 뺴줘야 다음 add로 요소 추가 시 위치 안밀림
		this.index--;
		
	}
	
	public void add(int index, String value) {
		
		//인덱스가 올바른지 먼저 확인 후, 배열의 길이 확인 후, 기존 index 위치에 새 값 value 넣기
		//물리적으로는 있지만 대외적으로는 없는 방번호를 만들기 위한 로직
		if (index < 0 || index >= this.index) {
			//음수 거르고, 없는 방번호 요청 시 > 순수 ArrayList처럼 IndexOutOfBoundException 발생 시키기
			throw new IndexOutOfBoundsException(); //잘못된 방번호일경우 error 냅다 던지기
		}
		
		//add 하다가도 기존의 배열의 길이를 초과하면 error 발생할테니 배열 길이 늘려주는 작업 진행
		if (checkLength()) {
			doubleList();
		}
		
		
		//요소 삽입 > 우측의 모든요소 > 오른쪽으로 1칸 이동 > Right Shift
		for (int i=this.list.length-2; i>=index; i--) {
			
			this.list[i+1] = this.list[i];
		}
		
		this.list[index] = value;
		this.index++; //데이터를 추가했으니 인덱스 하나 늘리기
		
	}
	
	
	
	
	
//	//Insert 모드로 원하는 위치에 요소를 삽입한다.
//	public boolean add(int index, String value) {
//		
//		//this.list[index]; //원하는 값을 추가할 위치
//		
//		//추가할 위치부터 뒤로 1칸씩 이동하기
//		for (int i=this.list.length-1; i>=index; i--) {
//			
//			this.list[index + 1] = this.list[index];
//		}
//		
//		this.list[index] = value; //원하는 값을 추가할 위치에 원하는 값 담기
//		
//		//성공유무 반환
//		if (this.list[index].equals(value)) {
//			return true;
//		} else {
//			return false;
//		}
//		
//	}
	
	//원하는 요소가 몇번째 위치에 있는지 위치값을 반환한다.(앞에서부터)
	public int indexOf(String value) {
		
		//왼쪽부터 원하는 값을 찾아가면서 몇 번째방에 내가 원하는게 있는지 
		for (int i=0; i<this.index; i++) { //this.list.length > 데이터가 없는 방까지 돌 필요가 없으니 index-1까지만 돌면 됨.
			
			if (this.list[i].equals(value)) {
				return i;
			}
			
		}
		return -1; //못찾으면 통념상 '-1(없음)' 반환
	}
	
	//오버로딩 indexOf
	public int indexOf(String value, int beginIndex) {
		
		//왼쪽부터 원하는 값을 찾아가면서 몇 번째방에 내가 원하는게 있는지 
		for (int i=beginIndex; i<this.index; i++) { //this.list.length > 데이터가 없는 방까지 돌 필요가 없으니 index-1까지만 돌면 됨.
			
			if (this.list[i].equals(value)) {
				return i;
			}
			
		}
		return -1; //못찾으면 통념상 '-1(없음)' 반환
	}
	
	
	
	
	
	//원하는 요소가 몇번째 위치에 있는지 위치값을 반환한다.(뒤에서부터)
	public int lasIndexOf(String value) {
		
		for (int i=this.index-1; i>=0; i--) {

			if (this.list[i].equals(value)) {
				return i;
			} 
		}
		return -1;
	}
	
	//오버로딩 lastIndexOf
	public int lasIndexOf(String value, int beginIndex) {
		
		for (int i=beginIndex; i>=0; i--) {

			if (this.list[i].equals(value)) {
				return i;
			} 
		}
		return -1;
	}
	
	
	

	public boolean contains(String value) {

		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return true; //찾으면 true
			}
		}
		
		
		return false; //내가 찾고자하는 value값이 없으면 false 반환
	}
	
	
	//배열안의 요소의 개수만큼 배열의 길이를 줄인다.
	public void trimToSize() {
		
		String[] temp = new String[this.index];
		
		for (int i=0; i<this.index; i++) {
			
			temp[i] = this.list[i];
		}
		
		this.list = temp;
		
	}
	
	
	//배열의 모든 요소를 삭제한다.
	public void clear() {
		
//		//첫번째 방법 > 모두 null로 변경
//		for (int i=0; i<this.list.length; i++) {
//			this.list[i] = null;
//		}
//		//데이터를 깨끗이 다 지웠으니, index값도 0으로 초기화
//		this.index = 0;
		
//		//두번째 방법 > 기존 배열을 초기화 할게 아니라 버리고 새로 만들기
//		this.list = new String[4]; //새로운 배열 교체
//		this.index = 0; //index도 0으로 초기화
		
		//세번째 방법
		this.index = 0;
		//가장 간단한 방법이며, 우리가 보기에는 배열의 입력값이 보이지만. 이미 위에서 index개수만큼만 보이도록 로직처리했기때문에 상관 없음!
		
	}
	
}
