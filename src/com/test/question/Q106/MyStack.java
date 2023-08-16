package com.test.question.Q106;

import java.util.Arrays;

public class MyStack {

	private String[] list;
	private int index;
	
	public MyStack() {
		
		this.list = new String[4];
		this.index = 0;
	}
	
	//값을 순차적으로 추가하기
	public boolean push(String value) {
		
		//index가 list.length와 동일할 경우, 배열 길이 2배로 증가 및 증가한 배열로 기존 배열 이동
		
		if (this.index == this.list.length) {
			
			String[] temp = new String[this.list.length * 2];
			for (int i=0; i<this.index; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
		//꼭 길이를 2배로 설정하지 않아도 되지만, 짧게 생성할 경우 계속 돌아야 함!
		
		//value값을 앞 번호부터 순차적으로 넣어주기
		this.list[this.index] = value;
		
		//정확히 추가되면 true, 아니면 false 값 반환
		if (this.list[this.index].equals(value)) {
			index++;
			return true;
		} 
		return false;
		
	}
	
	//this.index 의 값부터 -1씩 값 순차적으로 가져오고, 
	public String pop() {
		
		if (this.index <= 0) {
			throw new IndexOutOfBoundsException(); //잘못된 방번호일경우 error 냅다 던지기
		}
		
		String result = this.list[this.index-1];
		this.index --;

		//TODO 배열 값 땡기는건 어케하지...?
		// >> pop 메소드에서는 따로 index값을 받아 배열 값을 반환하지 않기때문에 굳이 이쪽에서는 null처리 불요!
		
		return result;
		
	}
	
	@Override
	public String toString() {
		return "MyStack [list=" + Arrays.toString(list) + ", index=" + index + "]";
	}

	public int size() {
		return this.index;
	}
	
	public String peek() {
		return this.list[this.index-1];
	}
	
	public void trimToSize() {
		//stack안에 들어간 값의 개수(index)와 길이가 같은 배열인 new 배열 'temp' 생성 하여 기존 this.list배열의 값 넣어주기
		String[] temp = new String[this.index];
		
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
			
		}
		
		//stack안에 들어간 값의 개수(index)와 길이가 같은 배열인 temp를 this.list에 대입
		
		this.list = temp;
		
	}
	
	public void clear() {
		this.index = 0;
	}
}
