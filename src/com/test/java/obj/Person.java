package com.test.java.obj;

public class Person {

	private String name;	//이름
	private int age;		//나이
	private String gender;	//성별
	
	//관계 생성
	private Person father;	//아빠
	private Person mother;	//엄마
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	
	//dump method 생성
	public String info() {
		
		String temp = "";
		
		temp += "아빠: " + this.father.getName() + "\n";
		temp += "엄마: " + this.mother.getName() + "\n";
		temp += "본인: " + this.name + "\n";
		
		return temp;
		
		
	}
	
	
}
