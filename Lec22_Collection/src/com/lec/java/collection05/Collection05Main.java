package com.lec.java.collection05;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection05Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		
		//TODO:
		// Student 타입을 담는 ArrayList를 만드고
		// 사용자로부터 3개의 Student 데이터 을 입력받아서
		// 3가지 방법으로 출력해보세요. 
		// for, Enhanced-for, Iterator
		
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		// Student 생성 하고 add()
		Score score1 = new Score(100, 90, 80);
		Student stu1 = new Student(1, "신동호", score1);
		list.add(stu1);
		
		Student stu2 = new Student(2, "강경근", new Score(80, 94, 35));
		list.add(stu2);
		
		list.add(new Student(3, "명기범", new Score(66, 83, 89)));
		
		System.out.println("학생수:" + list.size());

		
		// 강경근 학생의 수학점수를 35 -> 55점으로 변경해보기
		list.get(1).getScore().setMath(55);
		
		
		
		// TODO : for, Enhanced-for, Iterator 사용한 출력
		
		System.out.println("for() 사용");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Enhanced-for");
		for(Student e : list) {
			System.out.println(e);
		}
		
		System.out.println("Iterator");
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	} // end main()

} // end class Collection05Main









