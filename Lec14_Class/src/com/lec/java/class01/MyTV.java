package com.lec.java.class01;

/*
  클래스:
   우리가 만들고자 하는 대상의 '상태' 와 '기능' 을 함께 가지고 있는 '데이터 타입'
   
   상태(속성, 필드) -> 클래스의 멤버변수로 정의 
      field, attribute, member variable 라고 함
    기능(동작) -> 클래스의 멤버메소드로 정의  
      behavior, member method 라고 함


   일반적으로 
	 멤버변수(필드)는 private 으로 설정. 
	 멤버메소드는 public 으로 설정.
*/


public class MyTV {
	// TV 의 상태 -> 변수
	boolean isPowerOn;   // 전원 On/Off
	int channel;        // 현재 채널
	int volumne;        // 현재 볼륨
	
	
	// TV 의 동작 -> 메소드
	public void powerOnOff() {
		// 메소드 호출때 마다 전원 껏다 켰다..  
	}
	
}













