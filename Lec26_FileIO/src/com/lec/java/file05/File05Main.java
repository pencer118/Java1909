package com.lec.java.file05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* Buffered Stream + Buffer 예제
Program <=== FilterInputStream <=== InputStream <=== Source
					↓ 상속					↓ 상속
Program <=== BufferedInputStream <=== FileInputStream <=== File

Program ===> FilterOutputStream ===> OutputStream ===> Source
					↓ 상속					↓ 상속
Program ===> BufferedOutputStream ===> FileOutputStream ===> File

java.io.InputStream
 |__ java.io.FilterInputStream
      |__ java.io.BufferedInputStream

java.io.OutputStream
 |__ java.io.FilterOutputStream
      |__ java.io.BufferedOutputStream
*/

public class File05Main {

	public static void main(String[] args) {
		System.out.println("Buffered Stream + Buffer");
		
		// TODO:
		// file03 패키지 참조
		// try with resource 구문으로 작성
		// in.read(buff) --> bin.read(buff);
		// out.write( , , ) --> bout.write( , , ); 사용
		// finally 필요 없슴
		
		
		try (
				// close() 되어야 할 리소스 객체 선언
				InputStream in = new FileInputStream("temp/big_text.txt");	
				BufferedInputStream bin = new BufferedInputStream(in);
				OutputStream out = new FileOutputStream("temp/copy_big_text.txt");
				BufferedOutputStream bout = new BufferedOutputStream(out);
				
				){
			
			byte [] buff = new byte[1024];  // 버퍼준비
			
			int lengthRead = 0;
			int bytesCopied = 0;
			long startTime = System.currentTimeMillis();
			
			while(true) {
				// byte[] 배열의 길이만큼 read 한다
				// 읽어들인 바이트수 리턴,
				// 읽어들일게 없으면 -1 리턴
				lengthRead = bin.read(buff);
				if(lengthRead == -1) break;
				
				// 데이터 쓰기
				// out.write(buff); <-- 주의! 배열의 길이만큼 다 쓰기 함
				bout.write(buff, 0, lengthRead);
				bytesCopied += lengthRead;				
			} // end while
			
			long endTime = System.currentTimeMillis();  // 끝난 시간
			long elapsedTime = endTime - startTime;  // 경과시간
			
			System.out.println("읽고 쓴 바이트: " + bytesCopied);
			System.out.println("경과시간(ms): " + elapsedTime);
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	} // end main()

} // end class File05Main
















