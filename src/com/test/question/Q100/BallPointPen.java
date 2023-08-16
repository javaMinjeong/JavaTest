package com.test.question.Q100;

public class BallPointPen {

	private double thickness;
	private String color;
	
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String info() {
		return String.format("%s 색상 %.1fmm 볼펜", this.color, this.thickness);
	}
}
