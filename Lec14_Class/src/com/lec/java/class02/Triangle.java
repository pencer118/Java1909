package com.lec.java.class02;

public class Triangle {
	// 삼각형
	
	// 속성 --> 멤버변수
	private double base;   // 밑변
	private double height; // 높이
	
	// 생성자들
	// 기본생성자
	public Triangle() {
		System.out.println("밑변: " + base);
		System.out.println("높이: " + height);
	}
	
	
	// 매개변수 받는 생성자
	public Triangle(double b, double h) {
		base = b;
		height = h;
		System.out.println("밑변: " + base);
		System.out.println("높이: " + height);
	}

	// 메소드들
	// 넓이 계산 메소드
	// calcArea()
	// 리턴값 : double 
	public double calcArea() {
		return base * height / 2;
	}
	
}







