package practice.capitalize;

import java.util.Arrays;
import java.util.Scanner;

public class LetterCapiralize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		String [] words;
		
		while(true) {
			str = sc.nextLine();
			if(str.trim().equalsIgnoreCase("quit")) break;
			str = str.toLowerCase();   // 일단 문자열 전체를 소문자로 변환
			words = str.split("\\s+");  // 공백기준으로 단어(들) 분리

			//System.out.println(Arrays.toString(words));
			for(String word : words) {
				// 맨 앞 한글자
				String firstLetter = word.substring(0, 1).toUpperCase();
				String rest = word.substring(1);  // 나머지 문자
				System.out.print(firstLetter + rest + " ");  // 결과 출력
			}
			System.out.println();
		}
		sc.close();
		
		System.out.println("프로그램 종료");
	}

}
























