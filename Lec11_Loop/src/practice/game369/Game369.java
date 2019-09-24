package practice.game369;

public class Game369 {

	public static void main(String[] args) {
		{  // 방법1 : feat. 신동호
			int n = 100;
			
			for (int i = 1; i <= n; i++) {

				// 1의 자리를 체크
				if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
					System.out.printf("%4s", "*");
				
				// 10의 자리 체크
				else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
					System.out.printf("%4s", "*");

				else
					System.out.printf("%4d", i);

				if (i % 10 == 0)
					System.out.println();
			}
		}
		
		{ // 방법2 : 문자열 사용  feat.강경근
			// 두번째 방식으로 풀어본 3.6.9게임
			for (int i = 1; i <= 100; i++) { // i를 1~100까지 진행
				String num = Integer.toString(i); // contains함수를 사용하기 위해 int형을 string형으로 변환
				if (num.contains("3")){ // "3"을 지니고 있는지 확인
					System.out.print("   *"); // 가지고 있다면 *출력 (4자리씩 띄어쓰기를 어떻게 하는건지 ㅠㅠstring형일때는 어떻게 띄우는지 모르겠어요)
				} else if (num.contains("6")) { // "6"을 지니고 있는지 확인
					System.out.print("   *");// 가지고 있다면 *출력
				} else if (num.contains("9")) { // "9"를 가지고 있다면 *출력
					System.out.print("   *");// 가지고 있다면 *출력
				} else
					System.out.print("   " + num); // 3,6,9를 가지고 있지 않다면 num 출력(string형)

				if (i % 10 == 0) { // i를 10의자리수 마다 끊어 줄바꿔줌 --> i를 string형으로 변환해서 num에 넣었는데 i값이 여전히 int형으로 남는거 같아요
					System.out.println();
				}
			}			
		}
		
		{ // 방법3 : 임의의 숫자에 대해 동작하기
			System.out.println("방법3");
			int num = 2000;  // 과연 100 이상의 수에서도 동작할까?
			int i = 1, k;
			// 24561|0   
			//  2456|1
			//   245|6  <-- * 
			while(i <= num) {
				k = i;
				while(k > 0) {
					// 1의 자리 체크
					if( k % 10 == 3 || k % 10 == 6 || k % 10 == 9 ) {
						// 별 출력 
						System.out.printf("%5s", "*");
						break;
					}					
					k /= 10;  // 한자리씩 깍아 나가기
				}
				if(k == 0)  // 모든 자리수를 다 검색했는데도,  3,6,9가 없었다면..
					System.out.printf("%5d", i);
				
				if(i % 10 == 0) // 10개 단위 줄바꿈
					System.out.println();
				i++;
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
