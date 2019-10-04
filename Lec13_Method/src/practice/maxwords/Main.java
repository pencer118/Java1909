package practice.maxwords;

import java.util.Arrays;
import java.util.Scanner;
//We test coders. Give us a try. Can you make it out. It’s awesome.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		String [] sentences = line.split("\\.");
							// line.split("[.]");
		System.out.println(Arrays.toString(sentences));
		
		// 0번째 기준
		int maxWords = sentences[0].trim().split("\\s+").length;
		String maxSentence = sentences[0].trim();
		
		for(int i = 1; i < sentences.length; i++) {
			int words = sentences[i].trim().split("\\s+").length;
			
			if(maxWords < words) {
				maxWords = words;
				maxSentence = sentences[i].trim();
			}
		}	
		
		System.out.println(maxWords + "개");
		System.out.println(maxSentence);
		
		sc.close();
	}
}








