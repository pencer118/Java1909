package com.lec.java.file10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class File10Main {

	public static void main(String[] args) {
		System.out.println("파일 존재여부");
		

		OutputStream out = null;
		InputStream in = null;
		
		try {
			// OutputStream 은 생성할때 파일이 존재하지 않아도 Exception 발생 안함
			// InputStream 은 생성할때 파일이 존재하지 않으면 Exception 발행!
			out = new FileOutputStream("temp/aaa.txt");
			in = new FileInputStream("temp/aaa.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(out != null) out.close();
				if(in != null) in.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	} // end main()

} // end File09Main













