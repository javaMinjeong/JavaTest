package com.test.question.Q100;

public class Ruler {

	private int length;
	private String shape;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String info() {
		return String.format("%dcm %s", this.length, this.shape);
	}
}
