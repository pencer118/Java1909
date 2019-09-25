package practice1;

import java.util.Scanner;

// http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=57&sca=1090
// 배열1 - 형성평가8

public class ArrayHw1 {

	// feat. 정예슬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[100];
		int i = 1; // 입력받은 정수의 갯수를 저장하는 지역변수
		int sum = 0;// 총합을 저장하는 변수
		int five = 0; // 5의 배수의 갯수를 저장하는 변수

		System.out.println("정수를 모두 입력하고 0을 입력한 후 엔터를 눌러주세요 : ");

		for (i = 1; i <= arr.length; i++) {
			arr[i] = sc.nextInt(); // 입력받은 정수를 arr 배열에 차례대로 저장

			if (arr[i] == 0)
				break; // 입력받은 정수가 0이라면 반복문 탈출
			
			if (arr[i] % 5 == 0) {
				five++; // 입력받은 정수가 5의 배수라면 5의 배수의 갯수 변수 1씩 증가
				sum += arr[i]; // 5의 배수를 모두 더한 누적 합
			}
			
		}
		System.out.println("5의 배수 개수는 " + five + "개 입니다.");
		System.out.println("위 숫자의 총 합은 " + sum + "입니다.");
		System.out.printf("위 숫자들의 평균은 %.1f 입니다. ", (float) sum / five);
		
		
		
// 위의 i변수에는 0을 입력한 것도 입력한 정수의 갯수로 파악되기 때문에 1을 빼줘야 맞는 평균이 나옴.

		sc.close();

	}
		
}
