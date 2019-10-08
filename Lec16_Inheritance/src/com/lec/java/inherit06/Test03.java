package com.lec.java.inherit06;

import com.lec.java.inherit05.Test01;

// private < (default) < protected < public

public class Test03 extends Test01{
	public void showInfo() {
		// 다른 패키지 있어도 상속받은 클래스는
		// protected 멤버 사용 가능!
		System.out.println(this.protectedNum);
		this.protectedMethod();
	}
	
	
} // end class Test03










