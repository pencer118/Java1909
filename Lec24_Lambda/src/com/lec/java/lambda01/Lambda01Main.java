package com.lec.java.lambda01;

/* 람다 표현식: lambda-expression
 	Java8 부터 도입:
		(매개변수 리스트) -> 리턴값
		(매개변수 리스트) -> {...}  수행코드

	추상메소드가 하나인 인터페이스 구현, 즉 익명클래스사용 더 간략화한 표현식
 */
public class Lambda01Main {

	public static void main(String[] args) {
		System.out.println("인터페이스, 익명 클래스, 람다 표현식");
		
		System.out.println();
		System.out.println("[1] 인터페이스를 구현하는 클래스");
		Calculable tc1 = new MyMath();
		double result = tc1.operate(10, 20);
		System.out.println("result = " + result);
				
		System.out.println();
		System.out.println("[2] 익명 클래스 사용");
		Calculable tc2 = new Calculable() {
			@Override
			public double operate(double x, double y) {
				return x + y;
			}
		};
		result = tc2.operate(10, 20);
		System.out.println("result = " + result);
		
		System.out.println();
		System.out.println("[3] 람다 표현식(lambda expression) 사용");
		Calculable tc3 = (x, y) -> x + y;
		result = tc3.operate(10, 20);
		System.out.println("result = " + result);
				
		
	} // end main()

} // end class Lambda01Main

interface Calculable {
	public abstract double operate(double x, double y);
}

class MyMath implements Calculable{
	@Override
	public double operate(double x, double y) {
		return x + y;
	}
}








