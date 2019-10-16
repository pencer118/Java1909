package com.lec.java.oop05;

/*
 인터페이스(interface):
 1. 모든 메소드가 public abstract으로 선언되고,
 2. 모든 멤버 변수가 public static final로 선언된
 특별한 종류의 추상 클래스

 인터페이스는 interface라고 선언
 인터페이스를 구현(상속)하는 클래스에서는 implements 키워드를 사용
 인터페이스를 구현(상속)할 때는 개수 제한이 없다.
 메소드 선언에서 public abstract는 생략 가능
 멤버 변수 선언에서 public static final은 생략 가능
*/

public class Interface01Main {

	public static void main(String[] args) {
		System.out.println("인터페이스(interface)");
		
		//TestInterface t = new TestInterface();  // interface 는 절대로 인스턴스 생성 불가
												// 즉 interface 는 new 불가 

		TestImpl test1 = new TestImpl();
		test1.testAAA();
		test1.testBBB();
		
		TestImpl2 test2 = new TestImpl2();
		test2.testAAA();
		test2.testBBB();
		test2.testCCC();
		
		//System.out.println(test2.MIN);   // ambiguous error
		System.out.println(TestInterface.MIN);  // 애시당초 static 은 클래스(인터페이스)이름으로 사용하자!
		System.out.println(TestInterface2.MIN);
		
		
		
	} // end main()

} // end class Interface01Main

interface TestInterface {
	// 모든 멤버변수가 public static final 
	public static final int MIN = 0;
	int MAX = 100;  // public static final 이 생략되어도 public static final 임!
	//private int a = 10;
	public static final String JAVA_STRING = "Java";
	String PYTHON_STRING = "Python";
	
	// 모든 메소드  public abstract
	public abstract void testAAA();
	void testBBB();   // public abstract 이 생략되어도 public abstract 임!
}


interface TestInterface2 {
	public static final int MIN = 1;
	public abstract void testAAA();
	public abstract void testCCC();
}




// 인터페이스를 상속받을때는 
// implements 사용.
class TestImpl implements TestInterface {

	@Override
	public void testAAA() {
		System.out.println("testAAA");
	}

	@Override
	public void testBBB() {
		System.out.println("testBBB");
	}
}

// 인터페이스는 다중상속 가능
class TestImpl2 implements TestInterface, TestInterface2{

	@Override
	public void testAAA() {
		System.out.println("testAAA");
	}

	@Override
	public void testBBB() {
		System.out.println("testBBB");
	}

	@Override
	public void testCCC() {
		System.out.println("testCCC");
	}
	
}

















