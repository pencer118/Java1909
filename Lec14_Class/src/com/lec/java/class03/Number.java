package com.lec.java.class03;

public class Number {
	// 멤버변수
	// private 을 사용하여
	// 데이터 은닉및 캡슐화 구현
	private int num;
	
	// 생성자
	// 디폴트 생성자
	public Number() {}
	
	// 매개변수 있는 생성자
	public Number(int num) {
		this.num = num;
	}
	
	// 메소드들
	// 멤버변수의 값을 리턴해주는 메소드 --> getter
	// 멤버변수의 값을 변경새주는 메소드 --> setter
	// 일반적으로 get변수명(), set변수명() .. 이렇게 작명.
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		if(num > 0)
			this.num = num;
	}
	
	
}











