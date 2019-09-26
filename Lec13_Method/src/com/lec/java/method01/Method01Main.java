package com.lec.java.method01;

/* 메소드 (Method):
 		반복되는 코드, 내용, 재사용해야할 코드들을 한 뭉치로 묶어서
 		따로 메소드로 만들은 다음(정의) 이를 필요할때마다 사용(호출)한다. 
 		
 		※ 자바는 '함수(function)' 가 따로 없습니다
 		  그러나 교육하면서 편의상, 혼용하여 말하겠습니다.
 		
	 메소드 정의:
	 	메소드는 main 메소드 바깥에서!!, class 안에서 정의!!

	 메소드 정의구문:
		수식어        리턴타입              메소드이름(매개변수, ...) { ... }
	    modifier return_type  method_name(parameter, ...) { ... }
	
		수식어(modifier) : public, static, private, ... (생략 가능)
	   
		매개변수 (parameter) : 메소드 호출시 넘겨주는 값.

		리턴타입 (return type) : 메소드 종료후 호출한 쪽에 돌려주는 값
			void, int, double, String ...
			(리턴타입 void의 의미는 되돌려주는 값(return 값)이 없다는 의미)
	
	메소드 signature 란?:
		메소드 이름 + 매개변수 리스트 (매개변수 타입, 순서, 개수)
			sayAge(int)
			sayHello3(String, int)
			
*/

public class Method01Main {
	
	public static void main(String[] args) {
		System.out.println("메소드(함수) Method(Function)");
		
		System.out.println("안녕하세요.");
		System.out.println("제 이름은 이한별 입니다");
		
		System.out.println("안녕하세요");
		System.out.println("제 이름은 조은이 입니다");
		
		System.out.println("안녕하세요");
		System.out.println("제 이름은 박수찬 입니다");
		
		// 메소드 sayHello() 호출 (사용) (method call,  method invoke)
		sayHello("정예경");
		sayHello("김진후");
		
		System.out.println();
		// sayAge() 호출
		sayAge(16);
		sayAge(20);
		
		System.out.println();
		// sayHello2() 호출
		sayHello2("쌤성", 20);
		//sayHello2(100, 200);  // 메소드 정의와 호출 매개변수 타입이 다르면 에러
		
		System.out.println();
		sayHello3("자바", 23);
		
		System.out.println("프로그램 종료");
	} // end main()
	
	// 메소드 '정의'!
	// 메소드 이름 : sayHello
	// 매개변수 : name
	// 리턴타입 : void
	
	// ↓ JavaDoc
	/**
	 * 메소드 이름 : sayHello
	 * 주어진 이름을 출력합니다
	 * @param name 이름
	 */
	public static void sayHello(String name) {
		System.out.println("안녕하세요");
		System.out.println("제 이름은 " + name + " 입니다.");
	}

	// 메소드 이름 : sayAge
	// 매개변수 : int 타입의 age
	// 리턴타입 : void (리턴값이 없다)
	public static void sayAge(int age) {
		System.out.println("Hi~ ");
		System.out.println("제 나이는 " + age + " 입니다");
	}
	
	
	// 메소드 이름 : sayHello2
	// 매개변수 :
	//    1) String name
	//    2)  int age
	// 리턴타입 : void
	public static void sayHello2(String name, int age) {
		System.out.println("안녕!");
		System.out.println("내 이름은 " + name + " 입니다");
		System.out.println("내 나이는 " + age + " 살 입니다");
	}
	
	public static void sayHello3(String name, int age) {
		// 메소드가 다른 메소드 호출!
		System.out.println("sayHello3() 호출");
		sayHello(name);
		sayAge(age);
		System.out.println("sayHello3() 리턴");
	}
	
	
	
	
} // end class Method01Main

/*
 * 이클립스 단축키 : 메소드 이름위에서
 * 	F3 : Open Declaration  (이 메소드 는 어디서 정의?)
 * 	CTRL + ALT + H : Open Call Hierarchy (이 메소드는 어디서 호출되나?)
 * 
 * 디버깅 :
 *   step into :
 *   step out (step return) :
 */








