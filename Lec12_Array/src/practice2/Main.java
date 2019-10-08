package practice2;

import java.util.Scanner;

/*
 * http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=202&sca=10a0
 * 배열2 - 자가진단2
 * 100 미만의 양의 정수들이 주어진다. 
 * 입력받다가 0 이 입력되면 마지막에 입력된 0 을 제외하고 
 * 그 때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지 
 * 작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
 * 
 * [입력예]
 * 10 55 3 63 85 61 85 0
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 자리수별 개수를 담을 배열
		// cnt[0] <--  십의자리가 0인 숫자의 개수
		// cnt[1] <--  십의자리가 1인 숫자의 개수
		// ..
		// cnt[9] <-- 십의 자리가 9인 숫자의 개수
		int [] cnt = new int[10];
		
		while(true) {
			int n = sc.nextInt();

			if(n == 0) break;
			
			// 십의 자리수 구하기
			int i = n / 10;
			cnt[i]++;   // 개수 증가
		}
		
		// 결과 출력
		for (int i = 0; i < cnt.length; i++) {
			// 개수가 1이상인 것만 출력
			if(cnt[i] > 0) {
				System.out.println(i + " : " + cnt[i]);
			}
		}
		
		
		
		sc.close();
		System.out.println("프로그램 종료합니다");
	} // end main()

}
















