package com.lec.java.oop01;
/*
 	다형성  ( Polymorphism )
 	하나의 이름의 클래스나 메소드가 '여러 가지 형태의 동작을 하는 능력'
 	
 	클래스의 다형성:
	 	한 타입의 참조변수로 여러타입의 객체를 참조 가능.
	 	조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조가능한것
 	
 	메소드의 다형성:
 		메소드 오버로딩, 메소드 오버라이딩
 	
 */
public class Polymorphism01Main {

	public static void main(String[] args) {
		System.out.println("다형성(Polymorphism)");
		
		System.out.println();
		
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		HybridCar h1 = new HybridCar();
		
		//  각각의 타입에 오버라이딩 된 메소드가 동작
		v1.displayInfo();
		c1.displayInfo();
		h1.displayInfo();
		
		System.out.println();

		// 'IS-A 관계'이면 상속관계로 만든다
		// 자동차(Car) 는 탈것(Vehicle) 이다    Car IS-A Vehicle  (o)
		// 탈것(Vehicle) 은 자동차(Car) 다"    Vehicle IS-A Car  (X)
		
		// 'HAS-A' 관계이면 멤버로 만든다
		// Car HAS-A Tire
		
		
		Vehicle car1 = new Car();
		Vehicle car2 = new HybridCar();
		//Vehicle car3 = new String("asdf");
		Car car3 = new HybridCar();
		
		car1.displayInfo();
		car2.displayInfo();
		car3.displayInfo();
		
//		HybridCar car7 = new Vehicle();   // 불가능  : 조상 <- 자손 (○)  ,  자손 <- 조상 (X)
		
		
		

		
	} // end main()

} // end class Polymorphism01Main











