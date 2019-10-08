package com.lec.java.inherit04;

public class Car extends Vehicle {

	int oil;
	
	// 생성자
	public Car() {
		//super();   없으면 부모의 기본생성자 호출 
		System.out.println("Car() 생성");
	}
	
	public Car(int speed, int oil) {
		super(speed);  // 부모클래스의 생성자 직접 호출
		this.oil = oil;
		System.out.println("Car(int, int) 생성: speed = " + speed +
				" oil = " + oil);
	}
	
}






