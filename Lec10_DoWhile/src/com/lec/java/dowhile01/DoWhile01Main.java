package com.lec.java.dowhile01;

/*
	 do {
	 	...
	 	...
	 }while(조건식) 문인 경우에는,
	 
	 {...} 안에 있는 실행문들을 한번은 실행을 하고 나서
	 조건식을 검사하게 된다.

 */
public class DoWhile01Main {

	public static void main(String[] args) {
		System.out.println("do-while 반복문");
		
		int n = 0;
		do {
			System.out.println("카운트다운: " + n);
			n--;
		} while (n > 0);
		
		//------------------------------------------
		n = 0;
		while(n > 0) {
			System.out.println("카운트다운: " + n);
			n--;
		}
		
		
	} // end main()

} // end class DoWhile01Main










