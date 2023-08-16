package com.test.question.Q096;

//마카롱 생산크기는 랜덤(난수)로 만들고 판매유효크기에 해당하는것만 판매
//색상도 난수로 만들고, 판매유효색상만 판매 > 문자열 난수는 어케만듦?
//두께도 난수로 만들고, 판매유효두께만 판매
//생성은 setter 얘 말고 box 클래스의 cook에서.....

class Macaron {
	private int size;
	private String color;
	private int thickness;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
//		if (size < 5 || size >15) {
//			return;
//		}
		this.size = size;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
//		if (!color.equals("red")
//				&& !color.equals("blue")
//				&& !color.equals("yellow")
//				&& !color.equals("white")
//				&& !color.equals("pink")
//				&& !color.equals("purple")
//				&& !color.equals("green")
//				&& !color.equals("black")) {
//			return;
//		}
		this.color = color;
	}
	
	public int getThickness() {
		return thickness;
	}
	
	public void setThickness(int thickness) {
		
//		if (thickness <1 || thickness >20) {
//			return;
//		}
		this.thickness = thickness;
	}
}