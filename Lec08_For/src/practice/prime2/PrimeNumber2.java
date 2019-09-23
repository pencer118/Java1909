package practice.prime2;


// 양의정수를 입력받으시고 (n)
// 2 ~ n 사이의 수 중에서 
// 소수의 개수를 출력하세요
// 완성코드는 강사 카톡으로 보내주세요 : id: frogteam

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");

		int n = sc.nextInt();  // 2 ~ n 사이의 소수의 개수

		int numbers = 0;  // 소수의 개수를 담기 위한 변수

		for (int i = 2; i <= n; i++) {  // 2 ~ n 사이의 소수의 개수
			
			int p;
			for (p = 2; p < i; p++) {
				if (i % p == 0) {  // 나누어 떨어지면...
					break;
				}
			}

			if (p == i) {
				System.out.println(i);
				numbers = numbers + 1;
			}
		}
		System.out.println("소수의 개수는: " + numbers + "개");

		sc.close();
	}
}





