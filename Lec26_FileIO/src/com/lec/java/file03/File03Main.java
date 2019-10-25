package com.lec.java.file03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 java.io.InputStream
  |__ java.io.FileInputStream
 java.io.OutputStream
  |__ java.io.FileOutputStream
*/

public class File03Main {

	public static void main(String[] args) {
		System.out.println("File IO 2");
		
		// Java 7부터 도입된 try-with-resource
		// try (리소스 생성) { ... }
		// catch (exception ) { ... }
		// 리소스를 close하는 코드가 없어도 자동으로 close가 실행
		//
		// java.lang.AutoCloseable 나 
		//  └─ java.io.Closeable 을 상속받은 어떠한 객체라도 
		//  try(리소스 생성) 안에 '선언' 되어 있으면
		//  try~catch 가 끝나기 전에 close() 됨.
		
		// InputStream, OutputStream 둘다 Closeable 을 상속(implements) 한다
		
	
		try (
				// close() 되어야 할 리소스 객체 선언
				InputStream in = new FileInputStream("temp/big_text.txt");			
				OutputStream out = new FileOutputStream("temp/copy_big_text.txt");
				){
			
			byte [] buff = new byte[1024];  // 버퍼준비
			
			int lengthRead = 0;
			int bytesCopied = 0;
			long startTime = System.currentTimeMillis();
			
			while(true) {
				// byte[] 배열의 길이만큼 read 한다
				// 읽어들인 바이트수 리턴,
				// 읽어들일게 없으면 -1 리턴
				lengthRead = in.read(buff);
				if(lengthRead == -1) break;
				
				// 데이터 쓰기
				// out.write(buff); <-- 주의! 배열의 길이만큼 다 쓰기 함
				out.write(buff, 0, lengthRead);
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

} // end class
















