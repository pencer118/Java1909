package com.lec.java.class02;

public class Circle {
	// 원(동그라미) 가 가질수 있는 상태 --> 멤버변수
	public double radius = 5.0; // 반지름,   멤버변수 선언시 기본값 설정 가능.
	
	// 생성자(들)
	// 기본생성자
	public Circle() { 
		System.out.println("Circle() 생성자 호출");
		System.out.println("반지름: " + radius);
	}
	
	// 매개변수 있는 생성자
	public Circle(double r) {
		System.out.println("Circle(" + r + ") 생성자 호출");
		radius = r;  // 멤버변수 초기화
		System.out.println("반지름: " + radius);
	}
	
	
	// 원이 취할수 있는 동작 --> 메소드들
	
	// 원의 둘레 계산
	// calcParameter()
	// 리턴값 : double , 원의 둘레 계산
	public double calcPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	// 원의 넓이 계산
	// calcArea()
	// 리턴값 : double, 원의 넓이 계산
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	
	
	
	
	
	
	
	
	
	
}
