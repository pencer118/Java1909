package com.lec.java.inherit07;

public class Person {
	private String name;

	public Person() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 메소드
	public void showInfo() {
		System.out.println("이름: " + name);
	}
	
	// final 메소드는 더이상 오버라이딩 불가
	public final void whoAreYou() {
		System.out.println("이름: " + name);
	}
	
	// Object 의 메소드들 오버라이딩 가능!!
	@Override
	public String toString() {
		return String.format("Person] name : %s", name);
	}
	
	
	
}











