package com.lec.java.constant;

/*
 * 상수(constant) : final
 * 변수와 반대로, 한번 값을 정하면 변경 불가!
 * 
 * 관례적으로 상수명은 대문자로 작성합니다.
 */
public class FinalMain {

	public static void main(String[] args) {
		System.out.println("상수(final)");
		int mymoney;  // int 타입 변수 a 선언
		mymoney = 100;
		mymoney = 200;
		mymoney = 300;
		
		
		final int MYAGE = 35;
		//myage = 21;  // 상수(final)은 한번 값을 대입하면 변경 불가
		
		System.out.println("a = " + mymoney + " MYAGE:" + MYAGE);
		
		// 변수명 (클래스명, 메소드 명, 패키지명... )을 바꿀때는 Refactor-rename 기능 사용하기
	}

}






