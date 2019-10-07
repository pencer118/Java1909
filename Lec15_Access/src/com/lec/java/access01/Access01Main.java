package com.lec.java.access01;

import com.lec.java.access02.Test02;

// 접근권한 수식어(Access Modifier)  접근제한자
// 1) 종류: private, (default), protected, public 
// 2) 기능 
//   - 멤버 변수, 멤버메소드에 대한 접근 권한을 제한

// 3) private: '자기자신'이 선언된 클래스에서만 사용 가능
// 4) (default): '자기자신' + '같은 패키지'에 있는 클래스들에서는사용 가능
// 5) protected: '자기자신' + '같은 패키지' + '상속받은 클래스' 에서 사용 가능
//         다른 패키지의 클래스라도 '상속 받으면' 사용 가능하다                     
// 6) public: 어디서든 사용이 가능

// 사용범위: private < (default) < protected < public

//※ 클래스에 붙는 접근제한자는 딱 두가지 입니다
// (default) , public

public class Access01Main {

	public static void main(String[] args) {
		System.out.println("접근권한 수식어(Access Modifier)");

		Test01 t1 = new Test01();
		//t1.privateNum = 10;  // private : 자기 자신이 선언된 클래스 내에서만 사용 가능
		t1.defaultNum = 20;
		t1.protectedNum = 30;
		t1.publicNum = 40;
		
		//t1.privateMethod();
		t1.defaultMethod();
		t1.protectedMethod();
		t1.publicMethod();
		
		// 다른 패키지에 있는 클래스는 반드시 import 해야 함
		// import 없이도 사용가능한 클래스 : 같은 패키지 안의 클래스 + java.lang 패키지 밑의 클래스들.
		Test02 t2 = new Test02();
		
//		t2.privateNum = 10;
//		t2.defaultNum = 20;
//		t2.protectedNum = 30;
		t2.publicNum = 50;
		
		// import 없이도 다음과 같이 full name 으로 사용 가능.
		com.lec.java.access02.Test03 t3 = new com.lec.java.access02.Test03();

	} // end main()

} // end class Access01Main










