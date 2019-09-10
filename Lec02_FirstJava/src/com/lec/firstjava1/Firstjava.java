package com.lec.firstjava1;

// 모든 자바 프로그램은 main() 메소드로 부터 '시작' 한다. (entry point)

// <- 한줄 주석 (line comment)

/* 블럭 주석 (block comment)
 * 여러줄 주석은 블럭 주석으로 감싸준다.
 */


public class Firstjava {

	public static void main(String[] args) {
		System.out.println("First Java");  // CTRL + F11
		System.out.println("Second Java");
//		System.out.println("Third Java");
		System.out.println("Fourth Java");
		
		System.out.println();
		
		System.out.println(123);  // 숫자 123
		System.out.println("123");  // " ~ " <-- 문자열(String)
		
		System.out.println();
		
		System.out.println(10 + 20);   // 10, 20 이 '숫자' 이기 때문에 덧셈 연산
		System.out.println("10 + 20");  // " ~ " 안의 10 + 20 은 문자열로 출력
		
		//System.out.println(안녕하세요);  // 문자열을 " ~ " 로 감싸지 않으면 에러
		
		System.out.println(3.141592);
		System.out.println(3.141592 * 10 * 10);
		System.out.println(10 * 10 / 2);
		
		// + 연산자의 여러가지 기능
		System.out.println("안녕" + "하세요");  // 문자열 연결 (concatenation)
		System.out.println("안녕하세요, " + " 여러분!");
		System.out.println("결과:" + 10);  // + 연산자의 좌측, 우측중 하나라도 문자열인 경우
											// 문자열 연결연산을 수행
											// 숫자 10 --> "10" 으로 변환후 수행
		System.out.println("결과:" + 10 + 20);
		System.out.println(10 + 20 + "결과");
		System.out.println("결과:" + (10 + 20));
		
		// 사칙연산의 결과 보여주기 ( +, -, *, / )
		System.out.println("10 + 20 = " + (10 + 20));
		System.out.println("10 - 20 = " + (10 - 20));
		System.out.println("10 * 20 = " + (10 * 20));
		System.out.println("10 / 20 = " + (10 / 20));  // 숫자중에서도 소숫점 없으면 '정수' 타입
													// 정수끼리의 나눗셈 결과는 정수입니다.
													// 즉 소숫점 이하 절삭됨.
		
		System.out.println("10.0 + 20 = " + (10.0 + 20)); // 연산자 좌우측중 하나라도 실수이면
															// 결과는 '실수'
		System.out.println("10.0 / 20 = " + (10.0 / 20));
		
		// println(),              print()
		// ↑ print with line
		System.out.print("안녕");  // 줄바꿈 안함
		System.out.println("하세요");
		
		// 문자열 안에서 특수한 기능의 문자를 출력할때
		// 이스케이프 문자 (escape character) 사용
		// \ 으로 시작
		// \"  <-- " 출력
		// She says "Hi"   <-- 이거출력하려면????
		System.out.println("She says \"Hi\"");
		
		// 기억할 이스케이프 문자
		// \"   <-- " 출력
		// \n   <-- 줄바꿈
		// \t   <-- 탭 문자
		// \\   <-- \ 출력
		
		System.out.println("Avengers End\nGame");
		System.out.println("\t1234\t4567");
		System.out.println("\t10\t4");
		System.out.println("Hello\\\\\\\\Java");
		
	}

}










