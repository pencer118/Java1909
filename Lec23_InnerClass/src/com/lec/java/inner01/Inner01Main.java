package com.lec.java.inner01;

/*
 Inner Class(내부 클래스)
 1. Member inner class(멤버 내부 클래스): 다른 클래스 내부에서 선언된 클래스
 2. Static inner class(static 내부 클래스): 다른 클래스의 내부에서 static으로 선언된 클래스
 3. Local class(지역 클래스)
   1) Local inner class(지역 내부 클래스): 메소드 내부에서 선언된 클래스
   2) Anonymous inner class(익명 내부 클래스): 이름이 없는 local class
*/

public class Inner01Main {

	public static void main(String[] args) {
		System.out.println("Member Inner Class(멤버 내부 클래스)");
		
		// 외부클래스의 인스턴스 생성
		TestOuter out = new TestOuter(100);
		
		// 멤버내부크래스 인스턴스 생성
		// 멤버내부클래스 이름 : [외부클래스이름].[멤버내부클래스이름]
		// [외부클래스이름].[멤버내부클래스이름] 참조변수 =
		//   [외부클래스인스턴스].new 내부클래스 생성자()
		TestOuter.TestInner in = out.new TestInner(111);
		in.printOuterValue();
		in.printInnerValue();
		
		// 하나의 외부 클래스 인스턴스를 이용해서
		// 멤버내부클래스의 인스턴스를 여러개 생성 가능
		System.out.println();
		TestOuter.TestInner in2 = out.new TestInner(123);
		in2.printOuterValue();
		in2.printInnerValue();
		
		System.out.println();
		// TODO
		// 새로운 TestOuter 외부 클래스 인스턴스 생성 -> out2
		// out2 외부 클래스 인스턴스 생성
		//  out2 로부터 in4, in5 라는 이름으로 내부 클래스 객체 만드세요.
		
		TestOuter out2 = new TestOuter(200);
		TestOuter.TestInner in4 = out2.new TestInner(201);
		in4.printOuterValue();
		in4.printInnerValue();
		
		TestOuter.TestInner in5 = out2.new TestInner(202);
		in5.printOuterValue();
		in5.printInnerValue();
		
		TestOuter.TestInner in6 = new TestOuter(300).new TestInner(301);

		
	} // end main()

} // end class Inner01Main

















