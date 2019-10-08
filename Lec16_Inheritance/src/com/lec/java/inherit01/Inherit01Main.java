package com.lec.java.inherit01;

public class Inherit01Main {

	public static void main(String[] args) {
		System.out.println("상속(Inheritance) 을 사용하지 않는 경우");
		
		// BasicTV 인스턴스 생성
		BasicTV tv1 = new BasicTV();
		tv1.isPowerOn = true;
		tv1.volume = 10;
		tv1.channel = 5;
		tv1.displayInfo();
		
		// SmartTV 인스턴스
		SmartTV tv2 = new SmartTV();
		tv2.isPowerOn = true;
		tv2.channel = 123;
		tv2.volume = 12;
		tv2.ip = "192.168.0.111";
		tv2.displayInfo();
		

	} // end main()

} // end class Inherit01Main










