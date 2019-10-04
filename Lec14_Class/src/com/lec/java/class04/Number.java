package com.lec.java.class04;

public class Number {
	private int num = 100;

	// 생성자들.
	public Number() {
		super();
	}

	public Number(int num) {
		super();
		this.num = num;
	}

	// getter & setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	public void add(int x) {
		this.num += x;
	}
	
	public Number add(Number x) {
		this.num += x.num;
		return this;  // 자기자신을 리턴
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
