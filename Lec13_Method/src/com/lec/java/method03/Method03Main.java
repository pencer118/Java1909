package com.lec.java.method03;

import java.util.Random;
import java.util.Scanner;

/* 컴퓨터의 생각을 맞추기 .. 
 *    컴퓨터는 1~5까지의 난수를 발생.
 *    사용자는 맞춰보는 겁니다.
 *    사용자가 그만둘때까지 계속 반복.
 *    얼마나 맞추었는지 확인도 가능.
 */
public class Method03Main {
	
	static int tryTotal = 0;
	static int winCount = 0; 
	
	public static void main(String[] args) {
		System.out.println("메소드 연습");
		
		run();
		
	} // end main()
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			showMenu();  // 메뉴 보여주기
			int input = sc.nextInt();
			switch(input) {
			case 1:
				guess(sc);
				break;
			case 2:
				displayScore();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				sc.close();
				return;
			default:
				System.out.println("잘못 입력했습니다");
			}
		}
	}
	
	
	// 사용자에게 메뉴를 보여주기
	public static void showMenu() {
		System.out.println("============");
		System.out.println("1. 맞춰보기(1~5사이 입력)");
		System.out.println("2. 점수판");
		System.out.println("0. 종료");
		System.out.println("============");
		System.out.print("입력 : ");
	}
	
	
	// 사용자로부터 숫자 입력받고
	// 컴퓨터가 내놓은 숫자와 같은지 비교
	public static void guess(Scanner sc) {
		tryTotal++;
		
		int cpu = new Random().nextInt(5) + 1;  // 1 ~ 5 난수
		System.out.print("컴퓨터의 생각을 맞추세요 (1~5) : ");
		int human = sc.nextInt();
		
		if(cpu == human) {
			System.out.println("맞추셨습니다!");
			winCount++;
		} else {
			System.out.println("틀리셨습니다 --> " + cpu);
		}
		
	}
	
	public static void displayScore() {
		System.out.printf("%d 회 도전 %d회 맞춤, 승률 %.1f\n", 
				tryTotal, winCount, (double)winCount / tryTotal);
	}
	
	
	
	
	
	
	
	

} // end class Method03Main








