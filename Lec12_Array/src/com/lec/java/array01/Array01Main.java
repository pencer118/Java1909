package com.lec.java.array01;

/* 배열(Array)
 		동일 타입의 여러개의 데이터를 담는 집합자료형
 	
 	배열 선언
 		자료타입[] 변수이름;
 		
 	배열 원소 (element)
 		배열에 담긴 각각의 데이터
 		
 	배열의 길이 (length)
 		배열 원소의 개수, 즉 배열에 담긴 데이터의 개수 
 		
 	배열 인덱스 (첨자, index)
 		배열의 인덱스는 0부터 시작해서, (배열의 길이 - 1)까지가 됨
 		배열인덱스를 사용하여 배열원소에 접근하여 사용
 	
 	배열을 new로 생성한뒤에는 자동초기화 가 됨.
		숫자타입들은 --> 0으로
		boolean타입은 --> false 로
		객체타입(Object) 타입은 --> null 로.
 	
 	★ 배열변수의 타입, 배열원소의 타입 확실히 구분하자
 	★ JVM 메모리 상에 생기는 구조 이해 필수 
 */
public class Array01Main {

	public static void main(String[] args) {
		System.out.println("배열(Array)");
		
		int korean1 = 99;
		int korean2 = 88;
		int korean3 = 77;
		//.... xx
		
		System.out.println("배열 선언 & 초기화");
		int [] korean = new int[3] ;  // int 배열 변수 korean 선언
									// int값 3개를 담을수 있는 배열 생성하여 초기화
		
		korean[0] = 90;  // 첫번째[0] 배열원소값 90 을 대입!
		korean[1] = 80;  // 두번째[1]
		korean[2] = 70;  // 세번째[2]
		//korean[3] = 60;  // 네번째??   Exception 발생
		
		System.out.println("국어0: " + korean[0]);
		System.out.println("국어1: " + korean[1]);
		System.out.println("국어2: " + korean[2]);
		
		// korean 의 타입은 ? --> int[]
		// korean[0] 의 타입은 ? --> int
		
		System.out.println();
		
		// int 타입의 길이 5 배열 선언 , english
		int [] english = new int[5];
		
		System.out.println(english[0]);  // 자동초기화 되어 0 이 담겨 있다!
		
		for(int i = 0; i < 5; i++) {
			english[i] = i * 10;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("영어 " + i + " : " + english[i]);
		}
		
		
		
		
		
		
		
		
		
	} // end main()

} // end class Array01Main









