package com.test.question.Q107;

public class MyHashMap {

	private String[] keys;
	private String[] values;
	private int index;

	public MyHashMap() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}
	
	public String put(String key, String value) {
		
		for (int i=0; i<keys.length; i++) {
			if (!this.keys[i].equals(key)) {
				
				//index가 keys.length 및 values.length와 동일할 경우, 배열 길이 2배로 증가 및 증가한 배열로 기존 배열 이동
				if (this.index == this.keys.length && this.index == this.values.length) {

					String[] tempkeys = new String[this.keys.length * 2];
					for (int j=0; j<this.index; j++) {
						tempkeys[j] = this.keys[j];
					}
					this.keys = tempkeys;

					String[] tempvalues = new String[this.values.length * 2];
					for (int j=0; j<this.index; j++) {
						tempvalues[j] = this.values[j];
					}
					this.values = tempvalues;
					
					}
					
					//입력받은 key, value 값을 각 배열 앞부터 순차적으로 넣어주기
					this.keys[this.index] = key;
					this.values[this.index] = value;
					this.index++;
					
					return null;
					
				
			} else {
				
				String temp = this.values[i]; //수정 전 값 temp에 넣어주고
				
				this.values[i] = value; //수정할 값 기존 자리에 넣어주기
				
				return temp;
			}
		}
		
		return "";
		
	}
	
	//키에 대응하는 요소의 값을 가져온다.
	public String get(String key) {
		
		
		for (int i=0; i<keys.length; i++) {
			
			if (this.keys[i].equals(key)) {
				
				return this.values[i];
			}
		}
		
		return "";
	}
	
	public int size() {
		return this.index;
	}
	

	
}
