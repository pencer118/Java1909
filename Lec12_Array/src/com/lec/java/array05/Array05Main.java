package com.lec.java.array05;

import java.util.Scanner;

/* 2차원 배열 (2-dimensional array)
 * 	직전의 예제와 같이 같이 배열 첨자를 하나만 쓰는 배열을 
 * 1차원 배열 (one-dimensional array) 이라고 함
 *   배열원소가 '1차원 배열' 들로 이루어진 배열을 2차원 배열 이라 한다
 *   배열원소가 '2차원 배열' 들로 이루어진 배열을 3차원 배열 이라 한다
*/
public class Array05Main {

	public static void main(String[] args) {
		System.out.println("2차원 배열");
		
		// 1차원 배열
		int [] arr1 = {1, 2};
		// arr1 의 타입은???  -->  int []
		// arr1[0] 의 타입은 ??? --> int
		
		// 배열첨자(인덱스)를 하나만쓰는 배열 --> 1차원배열
		
		// 배열원소가 배열인 배열
		
		int [][] array = {
				{1, 2},
				{3, 4},
				
				{5, 6}
		};
		
		System.out.println(array[0][0]);
		System.out.println(array[0][1]);
		System.out.println(array[1][0]);
		System.out.println(array[1][1]);
		System.out.println(array[2][0]);
		System.out.println(array[2][1]);
		//System.out.println(array[2][2]); // Exception
		
		// 2차원 배열을 '행' 과 '열' 로 표현하기도 함
		// array 는 3행 x 2열 짜리 2차원 배열
		
		System.out.println("array.length = " + array.length);
		System.out.println("array[0].length = " + array[0].length);
		
		// 2차원 배열 출력
		for(int x = 0; x < array.length; x++) {
			for(int y = 0; y < array[x].length; y++) {
				System.out.print(array[x][y] + "\t");
			}
			System.out.println();
		}
		
		// 2행 4열의 2차원배열 두 개를 만들어서 
		// 아래와 같이 초기화하고 출력하기
		
		// 첫번째 배열 출력
		// 1 2 3 4
		// 5 6 7 8		
		
		int [][] arr4 = {
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		
		for(int x = 0; x < arr4.length; x++) {
			for(int y = 0; y < arr4[x].length; y++) {
				System.out.print(arr4[x][y] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	} // end main()

} // end class Array05Main





















