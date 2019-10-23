package com.lec.java.inner07;

public class Person {
	
	// 외부 클래스 멤버변수
	private String name;
	
	// 외부 클래스 생성자
	public Person(String name) {
		this.name = name;
	}
	
	public Readable createInstance(int age) {
		
		// 익명 내부 클래스 : Anonymous Inner class
		new Readable() {
			
			@Override
			public void readInfo() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		return new Readable() {
			@Override
			public void readInfo() {
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);			
			}
		};
		
	}
	
} // class Person

interface Readable {
	public abstract void readInfo();
}









