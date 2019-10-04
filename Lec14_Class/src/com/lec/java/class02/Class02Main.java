package com.lec.java.class02;


public class Class02Main {

	public static void main(String[] args) {
		System.out.println("클래스 연습");		
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1.calcArea());
		System.out.println(r1.calcPerimeter());
		System.out.println();
		Rectangle r2 = new Rectangle(3, 8);
		System.out.println(r2.calcArea());
		System.out.println(r2.calcPerimeter());
		
		System.out.println();
		// Circle 인스턴스 2개 이상 생성하고 동작
		Circle c1 = new Circle();
		Circle c2 = new Circle(3);

		double perimeter = c1.calcPerimeter();
		System.out.println("c1의 둘레: " + perimeter);
		perimeter = c2.calcPerimeter();
		System.out.println("c2의 둘레: " + perimeter);
		
		double area = c1.calcArea();
		System.out.println("c1의 넓이: " + area);
		area = c2.calcArea();
		System.out.println("c2의 넓이: " + area);
		
		System.out.println();
		// Triangle 인스턴스 2개이상 생성하고 동작
		Triangle t1 = new Triangle(3, 5);
		area = t1.calcArea();
		System.out.println("삼각형 t1 의 넓이: " + area);
		
		Triangle t2 = new Triangle();
		area = t2.calcArea();
		System.out.println("삼각형 t2 의 넓이: " + area);
		
		
		
		
	} // end main()

} // end class Class02Main










