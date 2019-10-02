package practice.isogram;

import java.util.Scanner;

public class Isogram {

	// isogram 판별
	public static boolean isIsogram(String str) {
		str = str.toLowerCase();
		for(int i = 0; i < str.length() - 1; i++) {
			// 같은문자 발견되면 무조건 false 리턴
			// "abcde"
			if(str.substring(i + 1).indexOf(str.charAt(i)) != -1) return false;
		}
		return true;		
	}
	
	// feat. 강경근
	public static boolean isIsogram2(String word) {
		for (int i = 0; i < word.length(); i++) { // 입력받은 User의 인덱스0번부터 순차적으로 동일한지 확인
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		while(true) {
			word = sc.nextLine();
			if(word.equalsIgnoreCase("quit")) break;
			System.out.println(isIsogram2(word));
		}		
		sc.close();
	}

}










