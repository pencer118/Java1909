package com.lec.java.file11;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

/*
문자(character) 단위 입출력 스트림 클래스
 java.io.Reader: 프로그램이 '문자 단위' 데이터를 읽어들이는(read) 통로
  └─ java.io.InputStreamReader
      └─ java.io.FileReader

 java.io.Writer: 프로그램이 '문자 단위' 데이터를 쓰는(write) 통로
  └─ java.io.OutputStreamWriter
      └─ java.io.FileWriter

 FileReader / FileWriter 객체는 '텍스트파일, 즉 문자 단위' 데이터를 읽고/쓰기 할때
 사용하는 기반 스트립 입니다.   따라서 텍스트가 아닌 오디오, 비디오, 등의 파일을 다룰수 없습니다.
 주로 String 이나 char [] 내용을 입/출력 할때 사용합니다.

 텍스트 파일 (Text File) 이란
   사람이 읽을수 있는 글자들이 저장된 파일
   암호화 되지 않은 평범한 텍스트

 이진파일 (Binary File) 이란
   사람이 직접 읽을수는 없슴.
*/


public class File11Main {
	public static void main(String[] args) {
		System.out.println("FileReader / FileWriter");
		
		String src = "temp/FileData.txt";
		String dst = "temp/FileData.txt";
		
		try(
				FileWriter fw = new FileWriter(dst);  // write 모드
				//FileWriter fw = new FileWriter(dst, true);  // append 모드
				FileReader fr = new FileReader(src);
				){
			
			// 주로 String 이나 char [] 의 내용 입출력할때 사용
			String str = "안녕하세요";   // 한글5문자
			char [] charArr = {'J', 'A', 'V','A'};   // 4문자
			
			fw.write(str);   // 저장은 시스템 인코딩 상태에 따라 저장
							// utf-8 인코딩의 경우 한글한글자는 3byte 씩
			fw.write(charArr);
			fw.flush();   // write() 메소드 호출후 flush() 로 출력버퍼의 데이터를 완전히 출력
			
			// 읽기
			char [] buff = new char[100];
			int charsRead = 0;
			// 읽어들인 '문자수' 를 리턴
			charsRead = fr.read(buff);
			for(int i = 0; i < charsRead; i++) {
				System.out.print(buff[i]);
			}
			System.out.println();
			System.out.println("읽은 문자 개수: " + charsRead);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	} // end main()
} // end class









