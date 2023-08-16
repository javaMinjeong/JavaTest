package com.test.java.obj;

import java.util.Arrays;

public class PencilCase {

	//Ex41_Class.java
	
	private String color;
	
	//필통 안에 여러개의 연필을 넣을 수 있으므로, 배열 생성하기
	//private Pencil[] pencil;	//***
	//위의 행동은 배열의 변수만 만들고 배열을 만든 적 없음 > new Pencil[5] 만든적 없음!! > null

	private Pencil[] pencil = new Pencil[5];	//***
	private int index = 0;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	public Pencil[] getPencil() {
//		return pencil;
//	}
//
//	public void setPencil(Pencil[] pencil) {
//		this.pencil = pencil;
//	}
//	
	
	//연필을 필통안에 넣기 > 이렇게하면 외부에서 배열을 관리할 필요가 없뜸!
	public void add(Pencil p) {
		
		if (this.index < this.pencil.length) {
			this.pencil[index] = p;
			this.index++;	//0 > 1 > 2 > 3 > 4 방에 연필이 들어감
		} else { //필통에 연필이 꽉 참
			System.out.println("필통에 연필이 꽉 찼습니다.");
		}
	}
	
	//필통에서 연필을 꺼내기 > 배열에서 제거
	public Pencil get(int index) { //몇번째에 있는 연필을 꺼낼래?
		
		//아래 Shift 돌면서 원본이 사라지기 전에 미리 복사해 놓은 것
		Pencil p = this.pencil[index];
		
		//TODO Shift는 자주 쓰이므로 연습해서 바로바로 튀어나올 수 있게 하기!
		//Left Shift > Why? 관리를 더 편하게 하기 위해서
		//물건이 빠진 자리에 뒤에있는 값들을 앞으로 옮겨서 맨 뒤가 가장 null로 초기화 시켜서 비어있을 수 있도록
		for (int i=index; i<this.pencil.length-1; i++) {
			
			this.pencil[i] = this.pencil[i+1];
			
		}
		
		this.pencil[this.pencil.length-1] = null;
		
		this.index--; //연필을 하나 꺼냈으면 연필을 넣던 작업에 index도 1을 빼줘야 마지막 자리에 넣을 수 있단얘기.
		
		return p;
	}
	
	//정보 확인용 dump method
			public String info() {
				return Arrays.toString(this.pencil);
			}
			
	
	
}
