package com.lec.java.method11;

/* 재귀 호출 (recursive call)
 */
public class Method11Main {

	public static void main(String[] args) {
		System.out.println("재귀 호출 (recursive call)");
		System.out.println("재귀 메소드(recursive method)");
		
		// Stack 메모리 용량 초과 : StackOverFlowError
		//showNumber(1);
		
		// Heap 메모리 용량 초과 : OutOfMemoryError
//		int n = Integer.MAX_VALUE;
//		double [] arr = new double[n];
		
		System.out.println(calcFactorial(5));
		
		
		
	} // end main()
	
	public static void showNumber(int n) {
		System.out.println(n);
		showNumber(n + 1);   // 자기 자신을 다시 호출?!
	}
	
	// n! = n x (n - 1) x (n - 2 ) x  ... x 1
	// 5! = 5 x 4 x 3 x 2 x 1 = 120
	// 5! = 5 x 4!
	//          4 x 3!
	//              3 x 2!
	//                  2 x 1!
	//                      1 x 0!
	
	
	public static long calcFactorial(long num) {
		long result = 0L;
		
		if(num == 0) {  // 0! 이면 1 리턴, (종료)
			return 1L;  // 재귀 호출은 반드시 종료조건이 있어야 한다.
		} else if (num > 0) {
			result = num * calcFactorial(num - 1);  // 재귀호출
		} else {
			System.out.println("음수 팩토리얼은 계산할수 없어요");
		}
		
		return result;
	}
	
	
	
	
} // end class Method10Main










