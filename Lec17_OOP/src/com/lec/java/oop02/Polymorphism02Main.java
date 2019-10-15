package com.lec.java.oop02;

/* 다형성의 유용성
	다형성에 의해서, 자식타입 객체가 부모타입으로 자동 형변환 가능!
	부모타입 만으로도 상속된 모~든 자손 타입들을 담을수 있다.
*/

public class Polymorphism02Main {

	public static void main(String[] args) {
		System.out.println("다형성의 사용 (유용성)");

		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();
		
		Vehicle [] car = new Vehicle[3];
		car[0] = new Vehicle();
		car[1] = new Car();
		car[2] = new HybridCar();
		
		for (int i = 0; i < car.length; i++) {
			car[i].displayInfo();
		}
		
		System.out.println();
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		Vehicle car4 = new Vehicle();
		driveCar(car4);
		
		Car car5 = new Car();
		driveCar(car5);
		
		HybridCar car6 = new HybridCar();
		driveCar(car6);
		
		// instanceof 연산자
		//   변수/값 instanceof 클래스
		//   결과 true/false
		if( car1 instanceof Vehicle) {
			System.out.println("car1 은 Vehicle 의 instance");
		} else {
			System.out.println("car1 은 Vehicle 의 instance 가 아닙니다");			
		}

		if( car1 instanceof Car) {
			System.out.println("car1 은 Car 의 instance");
		} else {
			System.out.println("car1 은 Car 의 instance 가 아닙니다");			
		}
		
		if( car2 instanceof Vehicle) {
			System.out.println("car2 은 Vehicle 의 instance");
		} else {
			System.out.println("car2 은 Vehicle 의 instance 가 아닙니다");			
		}
		
		
		
		
	} // end main	
	
	public static void driveCar(Vehicle v) {
		v.setSpeed(100);
		v.displayInfo();
	}
	
	
	
	
	
	
	

} // end class





















