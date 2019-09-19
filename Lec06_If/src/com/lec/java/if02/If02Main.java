package com.lec.java.if02;
/* if ~ else if ~ else조건식
 * 
 *  구문3:
 *  if (조건식1) {
 *		조건식1 이 true 일때 실행되는 문장(들)
 *		...
 *  } else if (조건식2) {
 *  	조건식1 이 false 이고
 *		조건식2 이 true 일때 실행되는 문장(들)
 *		...
 *  } else if (조건식3) {
 *  	조건식2 가 false 이고
 *		조건식3 이 true 일때 실행되는 문장(들)
 *		...
 *  } else {
 *  	위의 모든 조건식 모두 false 일때 수행하는 문장(들)
 *  	..
 *  }
 * 
 */

public class If02Main {

	public static void main(String[] args) {
		System.out.println("if - else if - else");
		
		int kor = 88, eng = 80, math = 43;
		int total = kor + eng + math;  // 총점
		int avg = total / 3; // 평균
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		
		// 90이상 -> A
		// 80이상 -> B
		// 70이상 --> C
		// 60이상 --> D
		// 60미만 --> F
		
		if(avg >= 90) {
			System.out.println("A학점");
		} else if (avg >= 80) {
			System.out.println("B학점");
		} else if (avg >= 70) {
			System.out.println("C학점");
		} else if (avg >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		
		
		
		

	} // end main()
} // end class










