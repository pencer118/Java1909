package com.lec.java.array07;

import java.util.Scanner;

/*
 * http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=206&sca=10a0
 * 5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 
 * 각 개인별로 평균이 80 이상이면“합격” 
 * 그렇지 않으면“불합격”을 출력하고 합격한 사람의 수를 
 * 출력하는 프로그램을 작성하시오.

 */
public class Array07Main {

	public static void main(String[] args) {
		System.out.println("2차원 배열 연습");
		
		int [][] score = new int[5][4];  // 5명학생 x 4개과목 점수
		
		int [] total = new int[5];  // 5명의 총점을 담을 배열
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < score.length; i++) {  // 학생
			for(int j = 0; j < score[i].length; j++) { // 과목
				score[i][j] = sc.nextInt();		
				// i번째 학생 총점 계산
				total[i] += score[i][j];
			}
		}
		
		int pass = 0;  // 합격한 사람의 수
		for(int i = 0; i < total.length; i++) {
			double avg = (double)total[i] / 4; // 평균
			if(avg >= 80.0) {
				System.out.println("pass");
				pass++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("합격자수는 : " + pass);
		
		
		
		
		sc.close();
		

	} // end main()

} // end class Array07Main









