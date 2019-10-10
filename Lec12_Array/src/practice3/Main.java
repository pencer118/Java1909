package practice3;

import java.util.Scanner;

/*
 * http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=61&sca=10a0
 * 배열2 - 형성평가2
 */
public class Main {

	// feat. 김다예
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] cnt = new int[11]; // 0, 10, 20, ... ,100 총 11개가 필요
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

			int i = n / 10;
			cnt[i]++;
		}
		for (int i = 10; i >= 0; i--) {
			if (cnt[i] > 0) {
				System.out.println(i * 10 + " : " + cnt[i] + "person");
			}
		}

		sc.close();
		System.out.println("프로그램 종료");

	}


}
