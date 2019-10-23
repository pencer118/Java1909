package com.lec.java.inner05;

public class TestOuter {
	// TestOuter 클래스의 멤버 변수
	private int num1 = 100;
	
	// TestOuter 클래스의 멤버 메소드
	public void localMethod() {
		int num2 = 200;  // localMehod() 의 지역변수
		
		// localMethod() 내부에서 정의된 local innner class22
		class TestLocal{
			// 멤버변수
			private int num3 = 300;  
			
			// 멤버메소드
			public void showNumbers() {
				//num2 = 300;
				System.out.println("num1 = " + num1);
				System.out.println("num2 = " + num2);
				System.out.println("num3 = " + num3);
			}
			
		} // end TestLocal
		
		TestLocal local = new TestLocal();
		
		num1 = 111;
		local.num3 = 333;
		//num2 = 222;  에러!
		
		local.showNumbers();
		
		
		
	} // end localMethod()
	

} // end class TestOuter













