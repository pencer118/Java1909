package com.lec.java.file13;

import java.io.File;

public class File13Main {

	public static void main(String[] args) {
		System.out.println("디렉토리 정보 확인");
		
		System.out.println();
		
		// current working directory (CWD)
		String curWorkingDir = System.getProperty("user.dir");
		System.out.println("현재 작업폴더:" + curWorkingDir);
		
		
		// 현재 작업 디렉토리의 파일 리스트 출력
		// File 클래스 : '파일객체'  또는 '디렉토리(폴더) 객체' 를 다룸
		File curDir = new File(curWorkingDir);  // 현재 작업 디렉토리 객체
		
		File [] list = curDir.listFiles();  // listFiles() : 디렉토리 안에 있는 파일과 디렉토리들을 File[] 로 리턴

		for (int i = 0; i < list.length; i++) {
			
			if(list[i].isDirectory()) {  // File 이 디렉토리 인 경우
				System.out.print("DIR\t");
			} else {  // File 이 파일 인 경우
				System.out.print("FILE\t");
			}
							// File 객체 이름   ,              File 의 크기 (byte)
			System.out.println(list[i].getName() + "\t" + list[i].length());
		}
		
		System.out.println();
		
		// temp 디렉토리 내용 출력
		File tempDir = new File("temp");   // '상대경로'를 이용한 파일 객체 생성
		
		File [] list2 = tempDir.listFiles();
		
		for(File f : list2) {
			if(f.isFile()) {  // File 객체가 파일 이라면.
				System.out.println("FILE\t" + f.getName() + "\t" + f.length());
			} else {
				System.out.println("DIR\t" + f.getName());
			}
		}
		
		System.out.println();
		
		// 파일 하나에 대한 정보
		String path = "dummy.txt";
		File f = new File(path);   // 새로운 File 객체 생성, ★ new File() 했다고 물리적으로 파일 생기지 않는다!!!
		System.out.println("파일 이름:" + f.getName()); 
		System.out.println("절대 경로:" + f.getAbsolutePath());
		System.out.println("있냐?:" + f.exists());
		
		
		
		
		
	} // end main()

} // end File11Main

















