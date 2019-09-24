package com.lec.java.array02;
/*  배열의 선언과 초기화
 	
 	배열 선언 따로, 초기화 따로
		타입[] 이름 = new 타입[배열의 길이];
		
	배열을 선언과 동시에 초기화 1
		타입[] 이름 = new 타입[] {a, b, c, ...};
		
	배열을 선언과 동시에 초기화 2
		타입[] 이름 = {a, b, c, ...};
		
	배열의 길이를 자동으로 알 수 있는 방법
		배열이름.length 
 */
public class Array02Main {

	public static void main(String[] args) {
		System.out.println("배열의 선언과 초기화");
		
		// [1] 
		int [] korean = new int[3];
		korean[0] = 100;
		korean[1] = 90;
		korean[2] = 80;
		
		// [2] : 배열 선언과 동시에 초기화1
		int [] english = new int[] {30, 20, 40};
		for(int i = 0; i < 3; i++) {
			System.out.println(english[i]);
		}
		// [3] : 배열 선언과 동시에 초기화2
		int [] math = {10, 20, 30, 40, 50, 60, 70};  // new int[5]{10, 20, 30, 40, 50}
		
		// 배열이름.length
		System.out.println("math[] 의 length : " + math.length);
		
		for (int i = 0; i < math.length; i++) {
			System.out.println("수학점수[" + i + "] = " + math[i]);
		}
		
		System.out.println("배열변수를 출력하면?????");
		System.out.println(math); //??
		
		
	} // end main()

} // end class Array02Main











