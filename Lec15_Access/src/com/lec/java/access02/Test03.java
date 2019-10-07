package com.lec.java.access02;

public class Test03 {
	private int privateNum;
	int defaultNum;
	protected int protectedNum;
	public int publicNum;
	
	// 메소드
	void test() {
		// 클래스의 멤버변수/멤버메소드 들은 '같은 클래스' 안에 있어서
		// 직접 사용 가능.
		privateNum = 111;
		defaultNum = 222;
		protectedNum = 333;
		publicNum = 444;
	}
	
	private void privateMethod() {
		System.out.println("Test02 - private method");
	}
	
	void defaultMethod() {
		System.out.println("Test02 - default method");
	}
	
	protected void protectedMethod() {
		System.out.println("Test02 - protected method");
	}
	
	public void publicMethod() {
		System.out.println("Test02 - public method");
	}
	
}







