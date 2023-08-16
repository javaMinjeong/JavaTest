package com.test.question.Q105;

public class MyQueue {

	private String[] list;
	private int index;
	
	public MyQueue() {
		this.list = new String[4];
		this.index = 0;
	}

	public boolean add(String value) {
		
		//index가 list.length와 동일할 경우, 배열 길이 2배로 증가 및 증가한 배열로 기존 배열 이동
		if (this.index == this.list.length) {
			
			String[] temp = new String[this.list.length * 2];
			for (int i=0; i<this.index; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
			
		}
		
		//value값을 배열 앞 번호부터 순차적으로 넣어주기
		this.list[this.index] = value;
		
		//정확히 추가되면 true, 아니면 false 값 반환
		if (this.list[this.index].equals(value)) {
			index++;
			return true;
		} 
		return false;
		
		
	}

	//값을 순차적으로 가져오기(삭제하기)
	public String poll() {
		
		if (this.index <= 0) {
			throw new IndexOutOfBoundsException(); //잘못된 방번호일경우 error 냅다 던지기
		}
		
		//매번 배열의 맨 앞 값을 가져오고
		String result = this.list[0];
		
		//왼쪽으로 shift 해주고
		for (int i=0; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		
		//index 개수 줄어들기(queue 사이즈 줄어들기)
		index--;
		
		return result;
		//TODO 모든 값이 빠지고 나서 index가 음수가 될 경우 예외처리 필요. index가 0보다 작거나 같으면 throw문 활용
		
	}
	
	public int size() {
		
		return this.index;
	}
	
	public String peek() {
		
		if (this.index <= 0) {
			throw new IndexOutOfBoundsException(); //잘못된 방번호일경우 error 냅다 던지기
		}
		
		return this.list[0];
	}
	
	
	public void trimToSize() {
		//queue안에 들어간 값의 개수(index)와 길이가 같은 배열인 new 배열 'temp' 생성 하여 기존 this.list배열의 값 넣어주기
		String[] temp = new String[this.index];
		
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
			
		}
		
		//queue안에 들어간 값의 개수(index)와 길이가 같은 배열인 temp를 this.list에 대입
		
		this.list = temp;
		
	}
	
	public void clear() {
		this.index = 0;
	}
}

