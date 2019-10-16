package com.lec.java.oop03;

public class Polymorphism03Main {

	public static void main(String[] args) {
		System.out.println("다형성의 어려움");
		
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();
		
		car2.setSpeed(10);  // ok
		
		//car2.setOil(100);  // 에러
		// car2 변수가 Vehicle 타입으로 선언되어 있으므로
		// Vehicle 이 아닌 다른 클래스 (심지어 자식클래스 이더라도!) 에 정의된
		// 멤버변수/메소드 사용불가!
		// 따라서 실제로는 Car 인스턴스가 생성되긴 했으나 (즉 setOil() 이 있긴 하나..)
		// Vehicle 타입 참조변수 로는 Car 클래스에의 멤버 사용 불가
		
		
		((Car)car2).setOil(50);
		
		
		//((Car)car1).setOil(10);
		// ClassCastException  발생
		// setOil() 을 호출하는 과정이 아니라  Car 로 형변환 하는 과정에서 에러 발생
		
	} // end main()

} // end class Polymorphism03Main












