package com.lec.java.collection10;

import java.util.HashSet;
import java.util.Iterator;

public class Collection10Main {

	public static void main(String[] args) {
		System.out.println("HashSet 연습");
		
		// MyClass 타입을 저장할 수 있는 HashSet 인스턴스 생성
		HashSet<MyClass> set = new HashSet<MyClass>();
		
		// 데이터 3개 저장
		set.add(new MyClass(1, "강정원"));
		set.add(new MyClass(2, "조준원"));
		set.add(new MyClass(3, "임선아"));
		
		// 검색: Iterator, enhanced for
		System.out.println();
		System.out.println("Iterator");
		Iterator<MyClass> itr = set.iterator();
		while(itr.hasNext()){
			// while 안에서 next() 를 여러번 호출하지 않도록 주의!
//			System.out.println("id:" + itr.next().getId());
//			System.out.println("name:" + itr.next().getName());
			
			MyClass data = itr.next();
			System.out.println("id:" + data.getId());
			System.out.println("name:" + data.getName());
		}
		
		System.out.println();
		System.out.println("enhanced for");
		for(MyClass e : set) {
			System.out.println(e);			
		}

		// forEach() 메소드 사용
		System.out.println();
		System.out.println("forEach() 사용");
		// TODO

	} // end main()
} // end class









