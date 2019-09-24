package com.lec.java.array04;

import java.util.Scanner;

/* 연습
 * 길이 5개 int 형 배열을 선언하고
 * 사용자로부터 5개 정수를 입력받아 초기화 한뒤 
 * 
 * 총점, 평균, 최대값, 최소값  출력해보기
 */
public class Array04Main {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		
		int [] score = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("5개 점수 입력: ");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		
		// 총점, 평균
		int total = 0;
		double avg = 0.0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		avg = (double)total / score.length;
		System.out.println("총점:" + total);
		System.out.println("평균:" + avg);
		
		
		// 최대값, 최소값
		int max = score[0];
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		
		
	} // end main()

} // end class Array04Main








