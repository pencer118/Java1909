package com.lec.java.method13;

import java.util.Arrays;
import java.util.List;

/* String 클래스의 메소드들 1.
 */
public class Method13Main {

	public static void main(String[] args) {
		System.out.println("String 클래스의 메소드들");
		
		String str1 = "AbCdEfg";
		String str2 = "안녕하세요~";
		
		System.out.println("String length()");
		System.out.println("str1 의 길이 : " + str1.length());
		System.out.println("str2 의 길이 : " + str2.length());
		
		System.out.println();
		System.out.println("String concat()");  // concatenation 
		System.out.println(str1.concat(str2));
		System.out.println(str2.concat(str1));
		System.out.println(str2.concat(str1).concat("하하하"));
		System.out.println(str2.concat(str1).concat("하하하").length());
		
		System.out.println();
		System.out.println("String indexOf()");
		System.out.println(str1.indexOf('C'));
		System.out.println(str1.indexOf('c'));  // 못찾으면 -1 리턴
		
		System.out.println();
		System.out.println("String charAt()");
		System.out.println(str1.charAt(0));
		System.out.println(str2.charAt(1));
		
		System.out.println("toUpperCase(), toLowerCase()");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println();
		System.out.println("startWith()");
		String prefix = "http://";
		String url = "www.google.com";
		System.out.println(url.startsWith(prefix));
		if(!url.startsWith(prefix)) {
			String newUrl = prefix.concat(url);
			System.out.println(newUrl);
		}
		
		// 하나의 문자열 --> 여러 문자열로 쪼개기
		System.out.println();
		System.out.println("String split()");
		String str4 = "19:25:34";
		String [] strings = str4.split(":");
		for(String x : strings) {
			System.out.println(x);
		}
		
		// 년, 월, 일, 시, 분, 초 분리하기
		str4 = "2019-09-30 19:29:03";
		String date = str4.split(" ")[0];
		String time = str4.split(" ")[1];
		
		for(String e : date.split("-")) {
			System.out.println(e);
		}
		
		for(String e : time.split(":")) {
			System.out.println(e);
		}
		
		
		// String.join()
		// 문자열들, 문자열 배열 --> 하나의 문자열로 합하기    split() 의 반대
		System.out.println();
		System.out.println("String.join()");
		System.out.println(String.join("-", "Alice", "Bob", "Carol"));
		System.out.println(String.join("//", new String[] {"Alice", "Bob", "Carol"}));
		
		System.out.println();
		System.out.println("substring()");
		String str7 = "Hello Java";
		System.out.println(str7.substring(2, 5));  // 2부터 5전까지
		System.out.println(str7.substring(6));
		
		System.out.println();
		System.out.println("String trim()");  // 좌우 공백 제거
		String str9 = "    임민교      ";
		System.out.println("[" + str9 + "]");
		System.out.println("[" + str9.trim() + "]");
		
		System.out.println();
		System.out.println("String replace()");  // 치환
		String str10 = "Hello Python";
		System.out.println(str10.replace("Python", "Java"));
		
		// equals()
		String str11 = "Java";
		String str12 = "java";
		System.out.println(str11.equals(str12));
		System.out.println(str11.equalsIgnoreCase(str12));
		System.out.println(str11.toUpperCase().equals(str12.toUpperCase()));
		
		
	} // end main()

} // end class




