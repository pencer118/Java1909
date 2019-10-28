package com.lec.java.file14;

import java.io.File;
import java.io.IOException;

public class File14Main {

	public static final String TEST_DIRECTORY = "test";
	public static final String TEMP_DIR = "temp";
	public static final String TEST_FILE = "dummy.txt";
	public static final String TEST_RENAME = "re_dummy.txt";
	
	public static void main(String[] args) {
		System.out.println("폴더/파일 생성, 이름변경, 삭제");
		System.out.println();
		
		String path = System.getProperty("user.dir")
				+ File.separator
				+ TEST_DIRECTORY
				;
		System.out.println("절대경로:" + path);
		
		// 경로를 사용해서 File 객체 생성
		File f = new File(path);  // new File() 했다고 물리적으로 생기지 않는다.
		
		// 디렉토리로 생성 : mkdir()
		if(!f.exists()) {  // 폴더 존재 여부 체크, 
			if(f.mkdir()) {
				System.out.println("폴더 생성 성공");
			} else {
				System.out.println("폴더 생성 실패");			
			}
		} else {
			System.out.println("폴더가 존재합니다");
		}
		
		// test/dummy.txt 파일 생성하기
		File f2 = new File(f, TEST_FILE);  // File객체(디렉토리 File객체, 파일명)
		
		System.out.println(f2.getAbsolutePath());
		
		if(!f2.exists()) {  // 파일이 존재하는지 체크			
			try {
				if(f2.createNewFile()) {  // 물리적으로 생성!
					System.out.println("파일 생성 성공!");
				} else {
					System.out.println("파일 생성 실패!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("파일이 이미 존재합니다");
		}
		
		
		

	} // end main()

} // end class File12Main



















