package practice.prime1;

import java.util.Scanner;

/* 소수 : Prime number
 *   1 과 자신 외에는 나누어 떨어지지 않는 수
 *   
 *   2, 3, 5, 7, 11.... 
 * 
 */

public class PrimeNumber1 {

	public static void main(String[] args) {
		// 소수 판별 프로그램 작성
		// 양의 정수 입력 받고, 
		// 입력받은 숫자가 소수이면 true ,  아니면 false 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int n = sc.nextInt();   // 정수 하나 입력
		
		int i;
		for(i = 2; i < n; i++) {
			if(n % i == 0) {  // 나누어 떨어지는 수가 중간에 발견!
				break;  // <-- 소수가 아니다
			}
		}
		
//		 소수 여부 어케 판단??
		if( i == n ) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		
		
		
		sc.close();
	}

}





