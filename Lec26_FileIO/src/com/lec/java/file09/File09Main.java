package com.lec.java.file09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

// Object Filter Stream + Collection

// Program <=== ObjectInputStream <=== FileInputStream <=== File
// Program ===> ObjectOutputStream ===> FileOutputStream ===> File

// ArrayList<> 와 같은 Collection 에서,
// 모든 데이터들이 Serializable 되어 있으면 ObjectInputStream / ObjectOutputStream 으로
// read/write 가능.

public class File09Main {

	public static final String FILEPATH = "temp/memeber2.dat";
	
	public static void main(String[] args) {

		try(
				OutputStream out = new FileOutputStream(FILEPATH);
				ObjectOutputStream oout = new ObjectOutputStream(out);  
				InputStream in = new FileInputStream(FILEPATH);
				ObjectInputStream oin = new ObjectInputStream(in);
				){
			// 리스트 준비
			ArrayList<Member> list = new ArrayList<Member>();
			
			// 파일에 저장할 데이터
			Member m1 = new Member("root", "root1234");
			Member m2 = new Member("guest", "quest");
			Member m3 = new Member("admin", "admin9876");

			list.add(m1);
			list.add(m2);
			list.add(m3);
			
			oout.writeObject(list); // List 를 한번에 저장
			
			list = null;  // 기존 list 삭제
			
			list = (ArrayList<Member>)oin.readObject();
			for(Member m : list) {
				m.displayInfo();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	} // end main()

} // end class File08Main
















