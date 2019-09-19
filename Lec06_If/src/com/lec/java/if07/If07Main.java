package com.lec.java.if07;

/* String 비교, char 비교
 * - 문자열 비교는 절대로 == 를 사용하지 말자
 * - 문자열 비교는 equals(), equalsIgnoreCase() 사용!
 * 
 * - char 는 기본적으로 정수값 (아스키 코드값) 이라 일반 산술 비교가 
 */

public class If07Main {

	public static void main(String[] args) {
		System.out.println("String 비교, char 비교");

		String str1 = "John";
		String str2 = "John";

		if (str1 == str2) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}

		String str4 = "Jo";
		String str5 = "hn";
		String str6 = str4 + str5;

		System.out.println("str6 : " + str6);

		if (str1 == str6) { // 문자열 비교는 == 절대로 사용하지 말것.
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}

		// 문자열 비교는 equals(), equalsIgnoreCase() 사용
		if (str1.equals(str6)) {
			System.out.println("equals() 결과 같습니다");
		} else {
			System.out.println("equals() 결과 다릅니다");
		}

		String str7 = "john";
		if (str1.equalsIgnoreCase(str7)) {
			System.out.println("equalsIgnoreCase() 결과 같습니다");
		} else {
			System.out.println("equalsIgnoreCase() 결과 다릅니다");
		}
		
		System.out.println();
		
		// 주어진 숫자가 1 ~ 100 사이에 있는지 
		int num = 78;
		//if(1 <= num <= 100) {  (X)
		if(1 <= num && num <= 100) {
			System.out.println(num + "은 1 ~ 100 사이에 있습니다");
		}
		
		System.out.println();
		// char
		char ch = 'A';
		char ch2 = 'B';
		System.out.println("ch: " + ch);
		System.out.println("ch2: " + ch2);
		System.out.printf("ch : %c, %d\n", ch, (int)ch);
		System.out.printf("ch2 : %c, %d\n", ch2, (int)ch2);
		
		char ch3 = 'A' + 2;
		System.out.printf("ch3 : %c, %d\n", ch3, (int)ch3);
		
		// 알파벳의 개수를 출력?
		System.out.println("알파벳의 개수는 : " + ('Z' - 'A' + 1));
		
		// 주어진 문자가 '숫자' 인지 '대문자' 인지, '소문자' 인지 판별하기
		char ch4 = '@';
		
		if('0' <= ch4 && ch4 <= '9') {
			System.out.println("숫자입니다");
		} else if('A' <= ch4 && ch4 <= 'Z') {
			System.out.println("대문자 입니다");
		} else if('a' <= ch4 && ch4 <= 'z') {
			System.out.println("소문자 입니다");
		} else {
			System.out.println("숫자도 알파벳도 아닙니다");
		}
		
		
		
		
	} // end main()
} // end class










