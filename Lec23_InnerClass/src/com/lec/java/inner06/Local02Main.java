package com.lec.java.inner06;

public class Local02Main {

	public static void main(String[] args) {
		System.out.println("Local 내부 클래스의 활용");
		
		Person person = new Person("김진하");
		Readable r = person.createInstance(28);
		r.readInfo();
		r = person.createInstance(30);
		r.readInfo();
		
		
		
	} // end main()

} // end class Local02Main













