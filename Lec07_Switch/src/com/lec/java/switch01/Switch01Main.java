package com.lec.java.switch01;

/* switch - case 조건문
 * 
 * 	switch (조건값){
 * 	case 값1:
 * 		...
 * 	case 값2:
 * 		...
 *	default:
 *		...
 *	}
 *
 * 	해당 조건의 case문을 찾아서 거기서부터 break를 만날 때까지 실행을 함.
 *  break를 만나게 되면 switch 문장을 종료.
 *  해당하는 case가 없으면 default 문장을 실행함.
 *  
 *  	※ switch는 if - else if - else로 바꿀 수 있다. (할수 있어야 한다)
 */
public class Switch01Main {

	public static void main(String[] args) {
		System.out.println("switch 문");

		
		int num = 1;
		
		switch(num) {
		case 1:
			System.out.println("하나");
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("둘");
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("셋");
			System.out.println("THREE");
			break;
		default:  // 위 case 값 어느것에도 해당되지 않는 경우 수행
			System.out.println("이도 저도 아님");
		}
		
		
		char day = '월';
		
		switch(day) {
		case '월':
		case '화':
		case '수':
		case '목':
		case '금':
			System.out.println("일어나, 코딩해야지..");
			break;
		case '토':
		case '일':
			System.out.println("뭐해.. 야근해야지..");
			break;			
		}
		
		
		
		
	} // end main()

} // end class Switch01Main










