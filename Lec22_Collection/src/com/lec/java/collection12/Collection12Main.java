package com.lec.java.collection12;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection12Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 연습");
		
		// String 타입을 저장할수 있는 TreeSet 생성
		TreeSet<String> tset = new TreeSet<String>();
		
		// 데이터 5개 저장
//		tset.add("qwerty");
//		tset.add("asdf");
//		tset.add("zxcv");
//		tset.add("bnm");
//		tset.add("jkl");
		tset.add("AaAa");  //1
		tset.add("aaAA");  //2
		tset.add("aAaA");  //3
		tset.add("AAaa");  //4
		
		// 오름차순 출력
		Iterator<String> itr = tset.iterator();
		System.out.println("오름차순:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 내림차순 출력
		System.out.println();
		System.out.println("내림차순:");
		Iterator<String> itr2 = tset.descendingIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	} // end main

} // end class Collection12Main

















