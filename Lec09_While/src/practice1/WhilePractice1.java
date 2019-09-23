package practice1;

import java.util.Scanner;

public class WhilePractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int odd_count = 0, even_count = 0;
		
		while(true) { // while 무한루프
			int n = sc.nextInt();  // 정수 하나 입력
			// 0 이면 입력 종료
			if(n == 0) break;
			
			if(n % 2 == 0) even_count++;
			else odd_count++;
		}
		
		System.out.println("odd: " + odd_count);
		System.out.println("even: " + even_count);
		
		
		sc.close();
	}
	
	
	
	
	
	

}
