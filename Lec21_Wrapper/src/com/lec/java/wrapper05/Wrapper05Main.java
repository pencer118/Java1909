package com.lec.java.wrapper05;

/* Wrapper 클래스의 유용성
 * 1. Object 타입이 모~든 (심지어 primitive) 타입도 받을수 있다.
 * 2. Collection 과 같은 Generic 클래스에선
 *     primitive 타입을 담을수 없다. 그러나 ,Wrapper 를 통해 가능하다.
 */
public class Wrapper05Main {

	public static void main(String[] args) {
		System.out.println("Wrapper 클래스의 유용성");
		
		Object [] obj = new Object[5];
		
		obj[0] = new Wrapper05Main();
		obj[1] = new A();
		obj[2] = new A2();
		obj[3] = new B();
		obj[4] = 123;   // Object 가 primitive type 마저 담을수 있다!
				// 다형성 <- Auto-Boxing(Integer) <- 123(int)  
		
		for(Object e : obj) {
			System.out.println(e);   // Auto-Unboxing 발생!
		}
		

	} // end main
	
} // end class

class A{}
class A2 extends A{}
class B{}














